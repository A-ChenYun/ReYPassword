package com.achen.pass.enums;

import lombok.Data;
import lombok.Getter;

/**
 * @Author AChen
 * @Data: 2020/3/20 12:08 上午
 */
@Getter
public enum ResponseEnum {
    //账户密码存放相关的枚举
    NOT_INSERT(1,"没有记录进去诶诶诶"),
    WRITE_PASSWORD(2,"写密码，小宝贝"),
    ACCOUNT_NON(3,"账户不能为空"),
    DEC_NON(4,"添加解释信息哟"),
    AP_IN(5,"为您保存好啦"),
    DEC_EXIT(6,"这种description已经存在了，尝试加个说明？比如几月几日做了更新"),

    //更改记录状态的枚举
    UP_STATUS_DELETE(7,"状态已更改，原来的作废了哟"),
    FIND_IT(8,"找到啦，找到啦"),
    STATUS_DELE(9,"该项记录已经废除"),
    NO_INFO(10,"没有这项信息"),

    //删除信息
    DELETE_OK(11,"已经删除啦，不用重复删咯")



                ;


    private Integer code;
    private String msg;

    ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
