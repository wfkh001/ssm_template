package com.white.ssm.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * @ClassName ResultJson
 * @Author White.
 * @Date 2019/7/2 21:03
 * @Version 1.0
 * 封装响应结果集的对象
 */
@Data
@Accessors(chain = true)
public class ResultJson {

    //是否成功
    private Boolean succeedFlag;

    //响应消息
    private String message;

    //响应的结果集对象
    private Map<String,Object> resultMap;
}
