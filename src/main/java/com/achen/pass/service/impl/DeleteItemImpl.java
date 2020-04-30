package com.achen.pass.service.impl;

import com.achen.pass.consts.OConsts;
import com.achen.pass.dao.SecretMapper;
import com.achen.pass.enums.ResponseEnum;
import com.achen.pass.pojo.Secret;
import com.achen.pass.service.IDeleteItem;
import com.achen.pass.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 删除记录
 * @Author AChen
 * @Data: 2020/3/25 4:40 下午
 */

@Service
public class DeleteItemImpl implements IDeleteItem {

    @Autowired
    private SecretMapper secretMapper;

    @Override
    public ResponseVo deleteIt(String account, String password, String description){
        Integer status = secretMapper.countByAccPassW(account, password, description);
        if (status != OConsts.DELETEMSG){
            int row = secretMapper.updateStatusByAccPassW(account, password, description);
            if(row > 0){
                return ResponseVo.success(ResponseEnum.STATUS_DELE);
            }
        }
        return ResponseVo.success(ResponseEnum.DELETE_OK);
    }
}
