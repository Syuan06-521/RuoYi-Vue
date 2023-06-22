package com.ruoyi.teach.service;

import java.util.List;
import com.ruoyi.teach.domain.TeachPaper;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author sunjiaqi
 * @date 2023-06-21
 */
public interface ITeachPaperService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param paperId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TeachPaper selectTeachPaperByPaperId(Integer paperId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param teachPaper 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TeachPaper> selectTeachPaperList(TeachPaper teachPaper);

    /**
     * 新增【请填写功能名称】
     * 
     * @param teachPaper 【请填写功能名称】
     * @return 结果
     */
    public int insertTeachPaper(TeachPaper teachPaper);

    /**
     * 修改【请填写功能名称】
     * 
     * @param teachPaper 【请填写功能名称】
     * @return 结果
     */
    public int updateTeachPaper(TeachPaper teachPaper);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param paperIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTeachPaperByPaperIds(Integer[] paperIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param paperId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTeachPaperByPaperId(Integer paperId);
}
