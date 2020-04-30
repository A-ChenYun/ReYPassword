package com.achen.pass.dao;

import com.achen.pass.pojo.Secret;
import com.achen.pass.form.SecretForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecretMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Secret record);

    int insertSelective(Secret record);

    Secret selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Secret record);

    int updateByPrimaryKey(Secret record);

    int insertSelectiveVo(Secret record);

    //添加uid
    int updateByAccountPassword(Secret record);

    //查看是否有相同的解释
    Integer countByDec(String description);

    //通过description查找账户密码
    Secret selectByDescription(String description);

    List<Secret> selectByBlurryDec(@Param("description") String description);

    //定位账户密码删除用,用更新status的方法,status设为0，作为删除
    int updateStatusByAccPassW(@Param("account") String account,
                            @Param("password") String password,
                               @Param("description") String description);

    Integer countByAccPassW(@Param("account") String account,
                            @Param("password") String password,
                            @Param("description") String description);


}