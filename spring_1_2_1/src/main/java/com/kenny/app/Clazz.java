package com.kenny.app;

import com.kenny.app.beans.MyAnnotation;
import com.kenny.app.beans.MyBean;
import com.kenny.app.beans.MyInterface;

/**
 * @Author : saizhang
 * @Date : 2019/12/08
 * @Time : 11:06
 * @Description : TODO
 */
public class Clazz {
    public static void main(String[] args) {
        System.out.println("MyInterface :" + MyInterface.class.isInterface());
        System.out.println("MyBean :" + MyBean.class.isInterface());
        System.out.println("MyAnnotation :" + MyAnnotation.class.isAnnotation());
    }
}
