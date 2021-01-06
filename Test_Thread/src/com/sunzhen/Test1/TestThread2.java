package com.sunzhen.Test1;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 14:02
 * @Description: com.sunzhen.Test1
 * @version: 1.0
 */
public class TestThread2 implements Runnable{
    @Override
    public void run() {
        //从1到10进行输出:
        for (int i=1;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
}
