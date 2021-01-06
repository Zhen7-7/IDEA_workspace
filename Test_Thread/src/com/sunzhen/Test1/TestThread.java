package com.sunzhen.Test1;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 13:14
 * @Description: com.sunzhen.Test1
 * @version: 1.0
 */
public class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 100 ; i++) {
            System.out.println(this.getName()+":"+i);//用super.getName()也行
        }
    }
}
