package com.sunzhen.Test1;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 14:04
 * @Description: com.sunzhen.Test1
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        TestThread2 tt = new TestThread2();
        Thread t = new Thread(tt,"子线程");
        //t.setName("haha");
        t.start();

        //主线程输出1~10;
        Thread.currentThread().setName("主线程");
        for (int i = 1; i <11 ; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}
