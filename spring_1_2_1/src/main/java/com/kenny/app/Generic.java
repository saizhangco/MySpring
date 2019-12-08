package com.kenny.app;

import com.kenny.app.beans.MyBean;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author : saizhang
 * @Date : 2019/12/08
 * @Time : 11:06
 * @Description : TODO
 */
public class Generic {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new GenericApplicationContext();
        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(ctx);
        xmlReader.loadBeanDefinitions(new ClassPathResource("services.xml"));
        ctx.refresh();

        MyBean myBean = (MyBean) ctx.getBean("myBean");
        System.out.println(myBean.getNumber());
        System.out.println(myBean.getContent());
    }
}
