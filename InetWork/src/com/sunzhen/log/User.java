package com.sunzhen.log;

import java.io.Serializable;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/17 - 11 - 17 - 15:41
 * @Description: com.sunzhen.log
 * @version: 1.0
 */
public class User implements Serializable {

    private String name ;
    private String pwd ;

    public User() {
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
