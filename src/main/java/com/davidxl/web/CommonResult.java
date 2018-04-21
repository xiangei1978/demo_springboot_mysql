package com.davidxl.web;

import com.davidxl.common.type.NormalResultType;

/**
 * Created by xianglei on 2018/4/21.
 */
public class CommonResult {
    private Integer code = NormalResultType.ok.getCode();
    private String msg;
    private Object data;

    public CommonResult(Integer code,Object data,String msg) {

        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public CommonResult() {

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
