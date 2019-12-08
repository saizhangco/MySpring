package com.kenny.app.beans;

/**
 * @Author : saizhang
 * @Date : 2019/12/08
 * @Time : 11:03
 * @Description : TODO
 */
public class MyBean {
    private Integer number;
    private String content;
    private MyData myData;

    public MyBean() {

    }

    public MyBean(Integer number, String content) {

    }

    public MyBean createBean() {
        return new MyBean();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setNumber1(Integer number) {
        this.number = number + 1;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MyData getMyData() {
        return myData;
    }

    public void setMyData(MyData myData) {
        this.myData = myData;
    }
}
