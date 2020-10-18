package com.wb.common;

import lombok.Data;

/**
 * Create By WeiBin on 2020/9/28 20:33
 */
@Data
public class JsonResult<T> {

    private String code;
    private String msg;
    private T data;

    public  JsonResult(T data){
        this.data=data;
        this.code="200";
        this.msg="成功";

    }
    public  JsonResult(){
        this.code="200";
        this.msg="成功";

    }

    public JsonResult error(){
        this.code="400";
        this.msg="失败";
        return this;
    }
    public JsonResult error(T data){
        this.data=data;
        this.code="400";
        this.msg="失败";
        return this;
    }

}
