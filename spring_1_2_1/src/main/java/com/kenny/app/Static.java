package com.kenny.app;

import com.kenny.app.beans.MyBean;
import com.kenny.app.beans.MyData;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.context.support.StaticApplicationContext;

/**
 * @Author : saizhang
 * @Date : 2019/12/08
 * @Time : 11:06
 * @Description : TODO
 */
public class Static {
    public static void main(String[] args) {
        StaticApplicationContext ctx = new StaticApplicationContext();

        MutablePropertyValues pvs = new MutablePropertyValues();
        pvs.addPropertyValue("data1", 12);
        pvs.addPropertyValue("data2", "hello, data");
        ctx.registerSingleton("myData", MyData.class, pvs);

        MutablePropertyValues pvs1 = new MutablePropertyValues();
        pvs1.addPropertyValue("number", 11);
        pvs1.addPropertyValue("content", "hello static");
        pvs1.addPropertyValue("myData", ctx.getBean("myData"));
        ctx.registerSingleton("myBean", MyBean.class, pvs1);

        MyBean myBean = (MyBean) ctx.getBean("myBean");
        System.out.println(myBean.getContent());
        System.out.println(myBean.getNumber());
        System.out.println(myBean.getMyData().getData1());
        System.out.println(myBean.getMyData().getData2());
    }
}
