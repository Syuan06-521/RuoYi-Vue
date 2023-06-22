import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listScore(query) {
  return request({
    url: '/teach/score/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getScore(stuId) {
  return request({
    url: '/teach/score/' + stuId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addScore(data) {
  return request({
    url: '/teach/score',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateScore(data) {
  return request({
    url: '/teach/score',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delScore(stuId) {
  return request({
    url: '/teach/score/' + stuId,
    method: 'delete'
  })
}
