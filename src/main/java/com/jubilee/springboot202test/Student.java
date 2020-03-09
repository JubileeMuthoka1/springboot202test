package com.jubilee.springboot202test;

import com.sun.org.apache.xml.internal.utils.QName;
import org.springframework.context.annotation.EnableMBeanExport;

public class Student {
    private String name;
    private String age;
    private String height;
    private int phonenumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
