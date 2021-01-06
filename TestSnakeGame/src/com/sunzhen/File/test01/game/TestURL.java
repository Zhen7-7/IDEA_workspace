package com.sunzhen.File.test01.game;

import java.net.URL;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 14:18
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestURL {
    public static void main(String[] args) {
        URL url = Images.class.getResource("/");//相对路径
        System.out.println(url);
    }
}
