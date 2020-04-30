package com.achen.pass.form;

import javax.validation.constraints.NotBlank;

/**
 *更改信息状态传入表单
 * @Author AChen
 * @Data: 2020/3/24 9:09 下午
 */

public class StatusForm {
    @NotBlank
    private String account;
    @NotBlank
    private String password;
}
