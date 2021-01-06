package com.sunzhen.File.test01.exception;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/31 - 10 - 31 - 16:29
 * @Description: com.sunzhen.exception
 * @version: 1.0
 */
public class TestException {
    public static void main(String[] args) throws Exception {//将异常抛出给虚拟机;
        Information i1 = new Information("莫玉丹", "女", 20);

        i1.setSex("adfsd");
        System.out.println(i1);
    }
}
