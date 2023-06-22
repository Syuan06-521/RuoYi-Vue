package com.ruoyi.web.controller.teach;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.teach.domain.TeachPaper;
import com.ruoyi.teach.service.ITeachPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 【请填写功能名称】Controller
 * 
 * @author sunjiaqi
 * @date 2023-06-21
 */
@RestController
@RequestMapping("/teach/paper")
public class TeachPaperController extends BaseController
{
    @Autowired
    private ITeachPaperService teachPaperService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('teach:paper:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachPaper teachPaper)
    {
        startPage();
        List<TeachPaper> list = teachPaperService.selectTeachPaperList(teachPaper);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('teach:paper:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachPaper teachPaper)
    {
        List<TeachPaper> list = teachPaperService.selectTeachPaperList(teachPaper);
        ExcelUtil<TeachPaper> util = new ExcelUtil<TeachPaper>(TeachPaper.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('teach:paper:query')")
    @GetMapping(value = "/{paperId}")
    public AjaxResult getInfo(@PathVariable("paperId") Integer paperId)
    {
        return success(teachPaperService.selectTeachPaperByPaperId(paperId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('teach:paper:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachPaper teachPaper)
    {
        return toAjax(teachPaperService.insertTeachPaper(teachPaper));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('teach:paper:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachPaper teachPaper)
    {
        return toAjax(teachPaperService.updateTeachPaper(teachPaper));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('teach:paper:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{paperIds}")
    public AjaxResult remove(@PathVariable Integer[] paperIds)
    {
        return toAjax(teachPaperService.deleteTeachPaperByPaperIds(paperIds));
    }
}
