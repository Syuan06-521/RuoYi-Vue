package com.ruoyi.teach.service;

import java.util.List;
import com.ruoyi.teach.domain.TeachScore;
import com.ruoyi.teach.domain.dto.TeachScoreAndStu;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author sunjiaqi
 * @date 2023-06-22
 */
public interface ITeachScoreService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param stuId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TeachScore selectTeachScoreByStuId(Long stuId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param teachScore 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TeachScore> selectTeachScoreList(TeachScore teachScore);

    /**
     * 查询学生成绩和部分学生信息
     * @param teachScoreAndStu
     * @return
     */
    public List<TeachScoreAndStu> selectTeachScoreAndStuList(TeachScore teachScore);

    /**
     * 新增【请填写功能名称】
     * 
     * @param teachScore 【请填写功能名称】
     * @return 结果
     */
    public int insertTeachScore(TeachScore teachScore);

    /**
     * 修改【请填写功能名称】
     * 
     * @param teachScore 【请填写功能名称】
     * @return 结果
     */
    public int updateTeachScore(TeachScore teachScore);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param stuIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTeachScoreByStuIds(Long[] stuIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param stuId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTeachScoreByStuId(Long stuId);
}
