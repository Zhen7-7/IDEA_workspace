package com.sunzhen.buyticket02;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 14:08
 * @Description: com.sunzhen.buyticket02
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable {
    /*这样创建的好处:
    1.java中是单继承多实现:如果继承了Thread就不能继承别的类了
    2.这种方式的共享资源的能力强一些;就不要去非得加个static 去修饰:

     */

    //private static int TICKET = 10;这样无须创建static 变量
    private int ticketNum = 10;
    @Override
    public void run() {
        for (int i =1;i<=100;i++){
            if (ticketNum>0){
                System.out.println("在"+Thread.currentThread().getName()+"购买了第"+ticketNum--+"张票");
            }
        }
    }
}
