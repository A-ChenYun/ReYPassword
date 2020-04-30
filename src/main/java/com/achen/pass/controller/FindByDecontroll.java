package com.achen.pass.controller;

import com.achen.pass.service.impl.FindByDecImpl;
import com.achen.pass.vo.BulerryDecVo;
import com.achen.pass.vo.ResSelectDetailVo;
import com.achen.pass.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;


/**
 * @Author AChen
 * @Data: 2020/3/24 11:02 下午
 */
@RestController
public class FindByDecontroll {
    @Autowired
    private FindByDecImpl findByDec;
    @GetMapping("/findByDec/{description}")
    public ResponseVo<ResSelectDetailVo> findAccPassword(@PathVariable String description){
        ResponseVo<ResSelectDetailVo> accPassword = findByDec.findAccPassword(description);
        return accPassword;
    }
    //模糊查找描述信息，返回所有
    @GetMapping("/findByBulerryDec/{bulerryDec}")
    public ResponseVo<List<BulerryDecVo>> blurryFindDec(@PathVariable String bulerryDec){
        ResponseVo<List<BulerryDecVo>> blurryDecResultC = findByDec.blurryFindDec(bulerryDec);
        return blurryDecResultC;
    }

}
