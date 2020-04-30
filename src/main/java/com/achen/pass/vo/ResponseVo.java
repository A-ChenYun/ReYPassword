package com.achen.pass.vo;

import com.achen.pass.enums.ResponseEnum;
import com.achen.pass.pojo.Secret;
import lombok.Data;

/**
 * @Author AChen
 * @Data: 2020/3/20 12:06 上午
 */
@Data
public class ResponseVo<T> {
    Integer code;
    String msg;
    T data;

    public ResponseVo() {
    }

    public ResponseVo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseVo(T data) {
        this.data = data;
    }

    public ResponseVo (Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }



    public static  <T>ResponseVo<T> success(T data){
        return new <T>ResponseVo<T>(ResponseEnum.FIND_IT.getCode(),ResponseEnum.FIND_IT.getMsg(),data);

    }


    public static ResponseVo error(ResponseEnum responseEnum){
        return new ResponseVo(responseEnum.getCode(),responseEnum.getMsg());

    }

    public static ResponseVo success(ResponseEnum responseEnum){
        return new ResponseVo(responseEnum.getCode(),responseEnum.getMsg());

    }

}
