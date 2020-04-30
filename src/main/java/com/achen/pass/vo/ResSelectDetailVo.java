package com.achen.pass.vo;

import lombok.Data;

import java.util.Date;

/**
 * 通过描述查找的对象
 * @Author AChen
 * @Data: 2020/3/24 10:03 下午
 */
@Data
public class ResSelectDetailVo {
    private String account;

    private String password;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private String description;
}
