package com.achen.pass.service;

import com.achen.pass.vo.ResponseVo;

/**
 *
 * 删除保存信息
 * @Author AChen
 * @Data: 2020/3/25 4:36 下午
 */
public interface IDeleteItem {
     ResponseVo deleteIt(String account, String password, String description);
}
