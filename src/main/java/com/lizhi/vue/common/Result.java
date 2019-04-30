package com.lizhi.vue.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Result {

    public static final int RESULT_OK_CODE = 200;
    public static final String RESULT_OK_MESSAGE = "成功返回";

    public static final int RESULT_ERROR_CODE = 422;
    public static final String RESULT_ERROR_MESSAGE = "返回失败";


    //状态码
    private int code;
    //信息
    private String message;
    // 数据
    private Object data;
    public Result(){

    }

    public Result(int code , String msg, Object data){
        this.code = code;
        this.message = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toJsonString() {
        return JSON.toJSONString(this, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullStringAsEmpty);
    }

    public static Result success(Object data){
        return new Result(RESULT_OK_CODE, RESULT_OK_MESSAGE, data);
    }

    public static Result fail(Object data){
        return new Result(RESULT_ERROR_CODE, RESULT_ERROR_MESSAGE, data);
    }

    public static Result fail(int code, String errorMsg, Object data){
        return new Result(code, errorMsg, data);
    }

}
