package com.ruoyi.teach.service.impl;

import java.util.List;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.teach.domain.dto.TeachScoreAndStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teach.mapper.TeachScoreMapper;
import com.ruoyi.teach.domain.TeachScore;
import com.ruoyi.teach.service.ITeachScoreService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author sunjiaqi
 * @date 2023-06-22
 */
@Service
public class TeachScoreServiceImpl implements ITeachScoreService {
    @Autowired
    private TeachScoreMapper teachScoreMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param stuId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TeachScore selectTeachScoreByStuId(Long stuId) {
        return teachScoreMapper.selectTeachScoreByStuId(stuId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param teachScore 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TeachScore> selectTeachScoreList(TeachScore teachScore) {
        return teachScoreMapper.selectTeachScoreList(teachScore);
    }

    /**
     * 查询学生成绩和部分学生信息
     *
     * @param teachScoreAndStu
     * @return
     */
    @Override
    public List<TeachScoreAndStu> selectTeachScoreAndStuList(TeachScore teachScore) {
        return teachScoreMapper.selectTeachScoreAndStuList(teachScore);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param teachScore 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTeachScore(TeachScore teachScore) {
        teachScore.setCreateTime(DateUtils.getNowDate());
        return teachScoreMapper.insertTeachScore(teachScore);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param teachScore 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTeachScore(TeachScore teachScore) {
        return teachScoreMapper.updateTeachScore(teachScore);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param stuIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTeachScoreByStuIds(Long[] stuIds) {
        return teachScoreMapper.deleteTeachScoreByStuIds(stuIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param stuId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTeachScoreByStuId(Long stuId) {
        return teachScoreMapper.deleteTeachScoreByStuId(stuId);
    }
}
