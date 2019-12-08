package com.kenny.app.beans;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Author : saizhang
 * @Date : 2019/12/08
 * @Time : 11:04
 * @Description : TODO
 */
public class ReplaceMethod implements MethodReplacer {
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return "19931121";
    }
}
