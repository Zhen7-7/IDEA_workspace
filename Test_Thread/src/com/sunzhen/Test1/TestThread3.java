package com.sunzhen.Test1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 14:46
 * @Description: com.sunzhen.Test1
 * @version: 1.0
 */
public class TestThread3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //随机生成[5,10)之间的整数
        return (int)(((Math.random())*5)+5);
    }
}
class Test{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThread3 tt = new TestThread3();
        FutureTask ft = new FutureTask(tt);
        Thread t = new Thread(ft);
        t.start();
        Object obj = ft.get();
        System.out.println(obj);
    }
}
