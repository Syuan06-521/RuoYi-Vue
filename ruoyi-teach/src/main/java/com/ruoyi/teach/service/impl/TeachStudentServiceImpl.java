package com.ruoyi.teach.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teach.mapper.TeachStudentMapper;
import com.ruoyi.teach.domain.TeachStudent;
import com.ruoyi.teach.service.ITeachStudentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author sunjiaqi
 * @date 2023-06-22
 */
@Service
public class TeachStudentServiceImpl implements ITeachStudentService 
{
    @Autowired
    private TeachStudentMapper teachStudentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param stuId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TeachStudent selectTeachStudentByStuId(Long stuId)
    {
        return teachStudentMapper.selectTeachStudentByStuId(stuId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param teachStudent 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TeachStudent> selectTeachStudentList(TeachStudent teachStudent)
    {
        return teachStudentMapper.selectTeachStudentList(teachStudent);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param teachStudent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTeachStudent(TeachStudent teachStudent)
    {
        teachStudent.setCreateTime(DateUtils.getNowDate());
        return teachStudentMapper.insertTeachStudent(teachStudent);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param teachStudent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTeachStudent(TeachStudent teachStudent)
    {
        teachStudent.setUpdateTime(DateUtils.getNowDate());
        return teachStudentMapper.updateTeachStudent(teachStudent);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param stuIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTeachStudentByStuIds(Long[] stuIds)
    {
        return teachStudentMapper.deleteTeachStudentByStuIds(stuIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param stuId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTeachStudentByStuId(Long stuId)
    {
        return teachStudentMapper.deleteTeachStudentByStuId(stuId);
    }
}
