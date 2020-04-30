package com.achen.pass.form;

import com.achen.pass.consts.OConsts;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * 首次保存传入表单
 * @Author AChen
 * @Data: 2020/3/20 12:30 上午
 */

@Data
public class SecretForm {
    @NotBlank(message = "账号不能为空")
    private String account;
    @NotBlank(message = "密码不能为空")
    private String password;
    @NotBlank(message =  "desc解释不能为空")
    private String description;
    //状态设为1，表明可用
    private Integer status = OConsts.STATUSLOAD;

}
