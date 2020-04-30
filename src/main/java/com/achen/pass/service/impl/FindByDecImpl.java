package com.achen.pass.service.impl;

import com.achen.pass.consts.OConsts;
import com.achen.pass.dao.SecretMapper;
import com.achen.pass.enums.ResponseEnum;
import com.achen.pass.pojo.Secret;
import com.achen.pass.service.IFindByDec;
import com.achen.pass.vo.BulerryDecVo;
import com.achen.pass.vo.ResSelectDetailVo;
import com.achen.pass.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 通过描述查看账户，密码
 * @Author AChen
 * @Data: 2020/3/24 10:47 下午
 */
@Slf4j
@Service
public class FindByDecImpl implements IFindByDec {
    @Autowired
    private SecretMapper secretMapper;

    //通过描述查看账户，密码,精确查找
    @Override
    public ResponseVo<ResSelectDetailVo> findAccPassword(String description) {

        Secret secret = secretMapper.selectByDescription(description);
        if( secret==null ){
            return ResponseVo.error(ResponseEnum.NO_INFO);
        }
        if(!secret.getStatus().equals(OConsts.STATUSLOAD)){
            return ResponseVo.error(ResponseEnum.STATUS_DELE);
        }
        ResSelectDetailVo resSelectDetailVo = new ResSelectDetailVo();
        BeanUtils.copyProperties(secret,resSelectDetailVo);
        return ResponseVo.success(resSelectDetailVo);
    }

    //模糊查找描述
    @Override
    public ResponseVo<List<BulerryDecVo>> blurryFindDec(String blurryDec) {
        List<Secret> bulerrySecrets = secretMapper.selectByBlurryDec(blurryDec);
        List<BulerryDecVo> bulerryDecVoList = new ArrayList<>();
        log.info("bulerrySecrets = {}",bulerrySecrets);
        if( bulerrySecrets.isEmpty() ){
            return ResponseVo.error(ResponseEnum.NO_INFO);
        }
        for (Secret bulerrySecret : bulerrySecrets){
            //状态为1，写入
            if(bulerrySecret.getStatus() == OConsts.STATUSLOAD) {
                //当前用户判定没写
                bulerryDecVoList.add(secret2bulerryDecVo(bulerrySecret));
            }
        }

        return ResponseVo.success(bulerryDecVoList);
    }

    //secret2bulerryDecVo
    public BulerryDecVo secret2bulerryDecVo(Secret secret){
        BulerryDecVo bulerryDecVo = new BulerryDecVo();
        BeanUtils.copyProperties(secret,bulerryDecVo);
        return bulerryDecVo;
    }
}
