package com.achen.pass.controller;

import com.achen.pass.service.impl.DeleteItemImpl;
import com.achen.pass.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author AChen
 * @Data: 2020/3/25 5:09 下午
 */
@RestController
public class DeleteItemController {
    @Autowired
    private DeleteItemImpl deleteItem;
    @RequestMapping(value = "/delete")
    public ResponseVo delete(@RequestParam(name = "account") String account,
                             @RequestParam(name = "password") String password,
                             @RequestParam(name = "description") String description){
        ResponseVo responseVo = deleteItem.deleteIt(account, password, description);
        return responseVo;
    }

}
