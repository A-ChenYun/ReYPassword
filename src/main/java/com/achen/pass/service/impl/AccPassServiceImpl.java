package com.achen.pass.service.impl;

import com.achen.pass.dao.SecretMapper;
import com.achen.pass.enums.ResponseEnum;
import com.achen.pass.pojo.Secret;
import com.achen.pass.service.IAccPassService;
import com.achen.pass.vo.ResponseVo;
import com.achen.pass.form.SecretForm;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author AChen
 * @Data: 2020/3/19 11:17 下午
 */
@Service
public class AccPassServiceImpl implements IAccPassService {
    @Autowired
    private SecretMapper secretMapper;


    @Override
    public ResponseVo setItem(SecretForm secretForm) {
        //解释不能相同
        Integer row = secretMapper.countByDec(secretForm.getDescription());
        if (row>0){
            return ResponseVo.error(ResponseEnum.DEC_EXIT);
        }

        //secretForm2secret
        Secret secret = new Secret();
        BeanUtils.copyProperties(secretForm,secret);
        //判断是否写进数据库
        int insertSelective = secretMapper.insertSelectiveVo(secret);
        if(insertSelective == 0){
            return  ResponseVo.error(ResponseEnum.NOT_INSERT);
        }

        return ResponseVo.success(ResponseEnum.AP_IN);
    }

 /*   //更改记录（账户密码）使用状态
    @Override
    public ResponseVo upStatus(StatusForm statusForm) {
        secretMapper.updateByPrimaryKeySelective()
        return ResponseVo.success(ResponseEnum.UP_STATUS_DELETE);
    }*/






}
