<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="概率统计" prop="probability">
        <el-input
          v-model="queryParams.probability"
          placeholder="请输入概率统计分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="云计算" prop="cloudCompute">
        <el-input
          v-model="queryParams.cloudCompute"
          placeholder="请输入云计算分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据结构" prop="dataStructure">
        <el-input
          v-model="queryParams.dataStructure"
          placeholder="请输入数据结构分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设计模式" prop="designPatterns">
        <el-input
          v-model="queryParams.designPatterns"
          placeholder="请输入设计模式分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="高级算法" prop="algorithm">
        <el-input
          v-model="queryParams.algorithm"
          placeholder="请输入高级算法分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!-- <el-form-item label="网络安全" prop="cyberSecurity">
        <el-input
          v-model="queryParams.cyberSecurity"
          placeholder="请输入网络安全"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <el-form-item label="自然语言处理" prop="nlp">
        <el-input
          v-model="queryParams.nlp"
          placeholder="请输入自然语言处理分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="矩阵分析" prop="matrixAnalysis">
        <el-input
          v-model="queryParams.matrixAnalysis"
          placeholder="请输入矩阵分析分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="深度学习" prop="deepLearnning">
        <el-input
          v-model="queryParams.deepLearnning"
          placeholder="请输入深度学习分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据库原理" prop="dataStore">
        <el-input
          v-model="queryParams.dataStore"
          placeholder="请输入数据库原理分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="操作系统" prop="operateSystem">
        <el-input
          v-model="queryParams.operateSystem"
          placeholder="请输入操作系统分数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['teach:score:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['teach:score:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['teach:score:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['teach:score:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="scoreList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="学生id" align="center" prop="stuId" />
      <el-table-column label="学生姓名" align="center" prop="stuName" />
      <el-table-column label="学生性别" align="center" prop="stuGender" />
      <el-table-column label="学生年龄" align="center" prop="stuAge" />
      <el-table-column label="概率统计" align="center" prop="probability" />
      <el-table-column label="云计算" align="center" prop="cloudCompute" />
      <el-table-column label="数据结构" align="center" prop="dataStructure" />
      <el-table-column label="设计模式" align="center" prop="designPatterns" />
      <el-table-column label="高级算法" align="center" prop="algorithm" />
      <!-- <el-table-column label="网络安全" align="center" prop="cyberSecurity" /> -->
      <el-table-column label="自然语言处理" align="center" prop="nlp" />
      <el-table-column label="矩阵分析" align="center" prop="matrixAnalysis" />
      <el-table-column label="深度学习" align="center" prop="deepLearnning" />
      <el-table-column label="数据库原理" align="center" prop="dataStore" />
      <el-table-column label="操作系统" align="center" prop="operateSystem" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['teach:score:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['teach:score:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="学生id" prop="stuId">
          <el-input v-model="form.stuId" placeholder="请输入学生id" />
        </el-form-item>
        <el-form-item label="概率统计" prop="probability">
          <el-input v-model="form.probability" placeholder="请输入概率统计分数" />
        </el-form-item>
        <el-form-item label="云计算" prop="cloudCompute">
          <el-input v-model="form.cloudCompute" placeholder="请输入云计算分数" />
        </el-form-item>
        <el-form-item label="数据结构" prop="dataStructure">
          <el-input v-model="form.dataStructure" placeholder="请输入数据结构分数" />
        </el-form-item>
        <el-form-item label="设计模式" prop="designPatterns">
          <el-input v-model="form.designPatterns" placeholder="请输入设计模式分数" />
        </el-form-item>
        <el-form-item label="高级算法" prop="algorithm">
          <el-input v-model="form.algorithm" placeholder="请输入高级算法分数" />
        </el-form-item>
        <!-- <el-form-item label="网络安全" prop="cyberSecurity">
          <el-input v-model="form.cyberSecurity" placeholder="请输入网络安全分数" />
        </el-form-item> -->
        <el-form-item label="自然语言处理" prop="nlp">
          <el-input v-model="form.nlp" placeholder="请输入自然语言处理分数" />
        </el-form-item>
        <el-form-item label="矩阵分析" prop="matrixAnalysis">
          <el-input v-model="form.matrixAnalysis" placeholder="请输入矩阵分析分数" />
        </el-form-item>
        <el-form-item label="深度学习" prop="deepLearnning">
          <el-input v-model="form.deepLearnning" placeholder="请输入深度学习分数" />
        </el-form-item>
        <el-form-item label="数据库原理" prop="dataStore">
          <el-input v-model="form.dataStore" placeholder="请输入数据库原理分数" />
        </el-form-item>
        <el-form-item label="操作系统" prop="operateSystem">
          <el-input v-model="form.operateSystem" placeholder="请输入操作系统分数" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    
  </div>
</template>
<script>
import { listScore, getScore, delScore, addScore, updateScore } from "@/api/teach/score";

export default {
  name: "Score",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 【请填写功能名称】表格数据
      scoreList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        probability: null,
        cloudCompute: null,
        dataStructure: null,
        designPatterns: null,
        algorithm: null,
        
        cyberSecurity: null,
        nlp: null,
        matrixAnalysis: null,
        deepLearnning: null,
        dataStore: null,
        operateSystem: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true;
      listScore(this.queryParams).then(response => {
        this.scoreList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        stuId: null,
        probability: null,
        cloudCompute: null,
        dataStructure: null,
        designPatterns: null,
        algorithm: null,
        
        cyberSecurity: null,
        nlp: null,
        matrixAnalysis: null,
        deepLearnning: null,
        dataStore: null,
        operateSystem: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.stuId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加【学生成绩】";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const stuId = row.stuId || this.ids
      getScore(stuId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.stuId != null) {
            updateScore(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addScore(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const stuIds = row.stuId || this.ids;
      this.$modal.confirm('是否确认删除【请填写功能名称】编号为"' + stuIds + '"的数据项？').then(function() {
        return delScore(stuIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('teach/score/export', {
        ...this.queryParams
      }, `score_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
