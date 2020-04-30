package com.achen.pass.service;

import com.achen.pass.vo.BulerryDecVo;
import com.achen.pass.vo.ResSelectDetailVo;
import com.achen.pass.vo.ResponseVo;

import java.util.List;

/**
 * @Add 模糊查找描述 25/3/2020
 * @Author AChen
 * @Data: 2020/3/24 10:46 下午
 */
public interface IFindByDec {

    //通过描述查看账户，密码
    ResponseVo<ResSelectDetailVo> findAccPassword(String description);

    //模糊查找描述
    ResponseVo<List<BulerryDecVo>> blurryFindDec(String blurryDec);
}
