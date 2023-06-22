package com.ruoyi.teach.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teach.mapper.TeachPaperMapper;
import com.ruoyi.teach.domain.TeachPaper;
import com.ruoyi.teach.service.ITeachPaperService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author sunjiaqi
 * @date 2023-06-21
 */
@Service
public class TeachPaperServiceImpl implements ITeachPaperService 
{
    @Autowired
    private TeachPaperMapper teachPaperMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param paperId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TeachPaper selectTeachPaperByPaperId(Integer paperId)
    {
        return teachPaperMapper.selectTeachPaperByPaperId(paperId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param teachPaper 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TeachPaper> selectTeachPaperList(TeachPaper teachPaper)
    {
        return teachPaperMapper.selectTeachPaperList(teachPaper);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param teachPaper 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTeachPaper(TeachPaper teachPaper)
    {
        teachPaper.setCreateTime(DateUtils.getNowDate());
        return teachPaperMapper.insertTeachPaper(teachPaper);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param teachPaper 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTeachPaper(TeachPaper teachPaper)
    {
        teachPaper.setUpdateTime(DateUtils.getNowDate());
        return teachPaperMapper.updateTeachPaper(teachPaper);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param paperIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTeachPaperByPaperIds(Integer[] paperIds)
    {
        return teachPaperMapper.deleteTeachPaperByPaperIds(paperIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param paperId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTeachPaperByPaperId(Integer paperId)
    {
        return teachPaperMapper.deleteTeachPaperByPaperId(paperId);
    }
}
