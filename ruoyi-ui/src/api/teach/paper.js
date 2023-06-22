import request from '@/utils/request'

// 查询【试卷】列表
export function listPaper(query) {
  return request({
    url: '/teach/paper/list',
    method: 'get',
    params: query
  })
}

// 查询【试卷】详细
export function getPaper(paperId) {
  return request({
    url: '/teach/paper/' + paperId,
    method: 'get'
  })
}

// 新增【试卷】
export function addPaper(data) {
  return request({
    url: '/teach/paper',
    method: 'post',
    data: data
  })
}

// 修改【试卷】
export function updatePaper(data) {
  return request({
    url: '/teach/paper',
    method: 'put',
    data: data
  })
}

// 删除【试卷】
export function delPaper(paperId) {
  return request({
    url: '/teach/paper/' + paperId,
    method: 'delete'
  })
}
