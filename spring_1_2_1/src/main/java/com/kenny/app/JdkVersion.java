package com.kenny.app;

import org.springframework.core.SpringVersion;

/**
 * @Author : saizhang
 * @Date : 2019/12/08
 * @Time : 11:27
 * @Description : TODO
 */
public class JdkVersion {
    public static void main(String[] args) {
        System.out.println(org.springframework.core.JdkVersion.getJavaVersion());
        System.out.println(org.springframework.core.JdkVersion.getMajorJavaVersion());

        System.out.println(org.springframework.core.JdkVersion.JAVA_13);
        System.out.println(org.springframework.core.JdkVersion.JAVA_14);
        System.out.println(org.springframework.core.JdkVersion.JAVA_15);

        System.out.println(SpringVersion.getVersion());

        System.out.println(JdkVersion.class.getPackage().getImplementationVersion());
    }
}
