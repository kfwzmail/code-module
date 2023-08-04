package com.module.model;

import com.module.constants.Constant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 接口响应对象
 * @author wjw
 */
@ApiModel(description = "响应对象")
public class ResponseObj {
    @ApiModelProperty(value = "响应业务数据", example = "1")
    private Object data;
    @ApiModelProperty(value = "响应code", example = "0")
    private String code;
    @ApiModelProperty(value = "响应message", example = "操作成功")
    private String msg;
    public ResponseObj() {
    }
    public ResponseObj(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResponseObj(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static ResponseObj SUCCESS() {
        return new ResponseObj(Constant.SYS_CONSTANT_0, "操作成功");
    }

    public static ResponseObj SUCCESS(Object data) {
        return new ResponseObj(Constant.SYS_CONSTANT_0, "操作成功", data);
    }

    public static ResponseObj ERROR(String code, String msg) {
        return new ResponseObj(code, msg);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
