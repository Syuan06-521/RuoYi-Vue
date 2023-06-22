package com.ruoyi.web.controller.teach;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.teach.domain.dto.TeachScoreAndStu;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.teach.domain.TeachScore;
import com.ruoyi.teach.service.ITeachScoreService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author sunjiaqi
 * @date 2023-06-22
 */
@RestController
@RequestMapping("/teach/score")
public class TeachScoreController extends BaseController
{
    @Autowired
    private ITeachScoreService teachScoreService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('teach:score:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeachScore teachScore)
    {
        startPage();
//        List<TeachScore> list = teachScoreService.selectTeachScoreList(teachScore);
        List<TeachScoreAndStu> teachScoreAndStus = teachScoreService.selectTeachScoreAndStuList(teachScore);
        return getDataTable(teachScoreAndStus);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('teach:score:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeachScore teachScore)
    {
        List<TeachScore> list = teachScoreService.selectTeachScoreList(teachScore);
        ExcelUtil<TeachScore> util = new ExcelUtil<TeachScore>(TeachScore.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('teach:score:query')")
    @GetMapping(value = "/{stuId}")
    public AjaxResult getInfo(@PathVariable("stuId") Long stuId)
    {
        return success(teachScoreService.selectTeachScoreByStuId(stuId));
    }

    /**
     * 新增【新增学生成绩】
     */
    @PreAuthorize("@ss.hasPermi('teach:score:add')")
    @Log(title = "【新增学生成绩】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeachScore teachScore)
    {
        return toAjax(teachScoreService.insertTeachScore(teachScore));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('teach:score:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeachScore teachScore)
    {
        return toAjax(teachScoreService.updateTeachScore(teachScore));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('teach:score:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stuIds}")
    public AjaxResult remove(@PathVariable Long[] stuIds)
    {
        return toAjax(teachScoreService.deleteTeachScoreByStuIds(stuIds));
    }
}
