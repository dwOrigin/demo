package com.njgd.demo.Entity;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result result(int code,String msg,Object data){
    Result result= new Result();
    result.setCode(code);
    result.setMsg(msg);
    result.setData(data);
    return result;
    }
}
