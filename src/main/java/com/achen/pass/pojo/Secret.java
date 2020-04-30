package com.achen.pass.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Secret {
    private Integer id;

    private String account;

    private String password;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private String description;

}