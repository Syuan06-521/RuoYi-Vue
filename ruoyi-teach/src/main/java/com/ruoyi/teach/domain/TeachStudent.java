package com.ruoyi.teach.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 teach_student
 * 
 * @author sunjiaqi
 * @date 2023-06-22
 */
public class TeachStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生id */
    private Long stuId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String stuName;

    /** 性别 */
    @Excel(name = "性别")
    private String stuGender;

    /** 年龄 */
    @Excel(name = "年龄")
    private String stuAge;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String stuPoliStatus;

    /** 准考证号 */
    @Excel(name = "准考证号")
    private String confirmCard;

    public void setStuId(Long stuId) 
    {
        this.stuId = stuId;
    }

    public Long getStuId() 
    {
        return stuId;
    }
    public void setStuName(String stuName) 
    {
        this.stuName = stuName;
    }

    public String getStuName() 
    {
        return stuName;
    }
    public void setStuGender(String stuGender) 
    {
        this.stuGender = stuGender;
    }

    public String getStuGender() 
    {
        return stuGender;
    }
    public void setStuAge(String stuAge) 
    {
        this.stuAge = stuAge;
    }

    public String getStuAge() 
    {
        return stuAge;
    }
    public void setStuPoliStatus(String stuPoliStatus) 
    {
        this.stuPoliStatus = stuPoliStatus;
    }

    public String getStuPoliStatus() 
    {
        return stuPoliStatus;
    }
    public void setConfirmCard(String confirmCard) 
    {
        this.confirmCard = confirmCard;
    }

    public String getConfirmCard() 
    {
        return confirmCard;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stuId", getStuId())
            .append("stuName", getStuName())
            .append("stuGender", getStuGender())
            .append("stuAge", getStuAge())
            .append("stuPoliStatus", getStuPoliStatus())
            .append("confirmCard", getConfirmCard())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
