package com.sunzhen.Test1;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 13:15
 * @Description: com.sunzhen.Test1
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //创建线程
        TestThread t = new TestThread("猪猪");//利用多态:
        t.setName("皮卡丘");
        //t.run();发现调用run方法并无卵用,就相当于调用一个普通的方法
        t.start();//发现可以交错出现:说明我们有启动一个线程:

        //对照的main方法的输出0~99
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
