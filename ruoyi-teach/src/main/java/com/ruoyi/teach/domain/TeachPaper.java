package com.ruoyi.teach.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 teach_paper
 * 
 * @author sunjiaqi
 * @date 2023-06-21
 */
public class TeachPaper extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 试卷id */
    private Integer paperId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String paperName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String paperDescrip;

    public void setPaperId(Integer paperId) 
    {
        this.paperId = paperId;
    }

    public Integer getPaperId() 
    {
        return paperId;
    }
    public void setPaperName(String paperName) 
    {
        this.paperName = paperName;
    }

    public String getPaperName() 
    {
        return paperName;
    }
    public void setPaperDescrip(String paperDescrip) 
    {
        this.paperDescrip = paperDescrip;
    }

    public String getPaperDescrip() 
    {
        return paperDescrip;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("paperId", getPaperId())
            .append("paperName", getPaperName())
            .append("paperDescrip", getPaperDescrip())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
