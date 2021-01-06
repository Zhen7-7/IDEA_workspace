package com.sunzhen.buyticket02;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 14:12
 * @Description: com.sunzhen.buyticket02
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        /*Thread t1 =new Thread(new BuyTicketThread(),"第一个站口");
        Thread t2 =new Thread(new BuyTicketThread(),"第二个站口");
        Thread t3 =new Thread(new BuyTicketThread(),"第三个站口");
        这样创建对象和extends Thread 没有区别
        */
        BuyTicketThread tt = new BuyTicketThread();
        Thread t1 = new Thread(tt,"第一售票处");
        Thread t2 = new Thread(tt,"第二售票处");
        Thread t3 = new Thread(tt,"第三售票处");

        t1.start();
        t2.start();
        t3.start();

    }
}
