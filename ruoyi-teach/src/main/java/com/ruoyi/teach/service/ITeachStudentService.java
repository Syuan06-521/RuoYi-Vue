package com.ruoyi.teach.service;

import java.util.List;
import com.ruoyi.teach.domain.TeachStudent;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author sunjiaqi
 * @date 2023-06-22
 */
public interface ITeachStudentService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param stuId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TeachStudent selectTeachStudentByStuId(Long stuId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param teachStudent 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TeachStudent> selectTeachStudentList(TeachStudent teachStudent);

    /**
     * 新增【请填写功能名称】
     * 
     * @param teachStudent 【请填写功能名称】
     * @return 结果
     */
    public int insertTeachStudent(TeachStudent teachStudent);

    /**
     * 修改【请填写功能名称】
     * 
     * @param teachStudent 【请填写功能名称】
     * @return 结果
     */
    public int updateTeachStudent(TeachStudent teachStudent);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param stuIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTeachStudentByStuIds(Long[] stuIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param stuId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTeachStudentByStuId(Long stuId);
}
