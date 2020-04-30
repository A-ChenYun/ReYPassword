package com.achen.pass.controller;

import com.achen.pass.form.SecretForm;
import com.achen.pass.service.impl.AccPassServiceImpl;
import com.achen.pass.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author AChen
 * @Data: 2020/3/24 8:28 下午
 */
@RestController
public class AccPassController {
    @Autowired
    private AccPassServiceImpl accPassService;
    //写账户，密码，解释
    @PostMapping(value = "/setAccountPassword")
    public ResponseVo setItem(@Valid @RequestBody SecretForm secretForm){
        ResponseVo responseVo = accPassService.setItem(secretForm);
        return responseVo;
    }

}
