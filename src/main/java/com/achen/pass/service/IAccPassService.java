package com.achen.pass.service;

import com.achen.pass.vo.ResponseVo;
import com.achen.pass.form.SecretForm;

/**
 * @Author AChen
 * @Data: 2020/3/19 11:14 下午
 */
public interface IAccPassService {
    //写入description(什么账户)，account, password
    ResponseVo setItem(SecretForm secretForm);

/*    //更改记录（账户密码）使用状态
    ResponseVo upStatus(StatusForm statusForm);*/
//更改账户
    //更改密码
    //更改账户密码

}
