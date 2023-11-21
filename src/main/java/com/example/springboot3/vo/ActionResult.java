package com.example.springboot3.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装统一的前端响应对象
 * Created by Kak on 2020/9/4.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionResult {
    private int  statusCode;//响应状态码
    private String msg;//响应的短消息
    private Object data;//响应携带的数据
}

