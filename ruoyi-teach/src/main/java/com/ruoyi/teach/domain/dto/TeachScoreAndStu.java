package com.ruoyi.teach.domain.dto;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

public class TeachScoreAndStu extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 学生id
     */
    @Excel(name = "学生id")
    private Long stuId;

    /**
     * 学生姓名
     */
    @Excel(name = "学生姓名")
    private String stuName;

    /**
     * 学生性别
     */
    @Excel(name = "学生性别")
    private String stuGender;

    /**
     * 学生年龄
     */
    @Excel(name = "学生年龄")
    private Integer stuAge;

    /**
     * 概率统计
     */
    @Excel(name = "概率统计")
    private Integer probability;

    /**
     * 云计算
     */
    @Excel(name = "云计算")
    private Integer cloudCompute;

    /**
     * 数据结构
     */
    @Excel(name = "数据结构")
    private Integer dataStructure;

    /**
     * 设计模式
     */
    @Excel(name = "设计模式")
    private Integer designPatterns;

    /**
     * 高级算法
     */
    @Excel(name = "高级算法")
    private Integer algorithm;

    /**
     * 网络安全
     */
    @Excel(name = "网络安全")
    private Integer
            cyberSecurity;

    /**
     * 自然语言处理
     */
    @Excel(name = "自然语言处理")
    private Integer nlp;

    /**
     * 矩阵分析
     */
    @Excel(name = "矩阵分析")
    private Integer matrixAnalysis;

    /**
     * 深度学习
     */
    @Excel(name = "深度学习")
    private Integer deepLearnning;

    /**
     * 数据库原理
     */
    @Excel(name = "数据库原理")
    private Integer dataStore;

    /**
     * 操作系统
     */
    @Excel(name = "操作系统")
    private Integer operateSystem;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public Integer getCloudCompute() {
        return cloudCompute;
    }

    public void setCloudCompute(Integer cloudCompute) {
        this.cloudCompute = cloudCompute;
    }

    public Integer getDataStructure() {
        return dataStructure;
    }

    public void setDataStructure(Integer dataStructure) {
        this.dataStructure = dataStructure;
    }

    public Integer getDesignPatterns() {
        return designPatterns;
    }

    public void setDesignPatterns(Integer designPatterns) {
        this.designPatterns = designPatterns;
    }

    public Integer getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Integer algorithm) {
        this.algorithm = algorithm;
    }

    public Integer getCyberSecurity() {
        return cyberSecurity;
    }

    public void setCyberSecurity(Integer cyberSecurity) {
        this.cyberSecurity = cyberSecurity;
    }

    public Integer getNlp() {
        return nlp;
    }

    public void setNlp(Integer nlp) {
        this.nlp = nlp;
    }

    public Integer getMatrixAnalysis() {
        return matrixAnalysis;
    }

    public void setMatrixAnalysis(Integer matrixAnalysis) {
        this.matrixAnalysis = matrixAnalysis;
    }

    public Integer getDeepLearnning() {
        return deepLearnning;
    }

    public void setDeepLearnning(Integer deepLearnning) {
        this.deepLearnning = deepLearnning;
    }

    public Integer getDataStore() {
        return dataStore;
    }

    public void setDataStore(Integer dataStore) {
        this.dataStore = dataStore;
    }

    public Integer getOperateSystem() {
        return operateSystem;
    }

    public void setOperateSystem(Integer operateSystem) {
        this.operateSystem = operateSystem;
    }

    @Override
    public String toString() {
        return "TeachScoreAndStu{" +
                "stuId=" + stuId +
                ", stuName=" + stuName +
                ", stuGender=" + stuGender +
                ", stuAge=" + stuAge +
                ", probability=" + probability +
                ", cloudCompute=" + cloudCompute +
                ", dataStructure=" + dataStructure +
                ", designPatterns=" + designPatterns +
                ", algorithm=" + algorithm +
                ", cyberSecurity=" + cyberSecurity +
                ", nlp=" + nlp +
                ", matrixAnalysis=" + matrixAnalysis +
                ", deepLearnning=" + deepLearnning +
                ", dataStore=" + dataStore +
                ", operateSystem=" + operateSystem +
                '}';
    }
}
