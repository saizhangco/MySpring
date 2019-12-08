package com.kenny.app;

import com.kenny.app.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : saizhang
 * @Date : 2019/12/08
 * @Time : 11:05
 * @Description : TODO
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean.getContent());
        System.out.println(myBean.getNumber());
    }
}
