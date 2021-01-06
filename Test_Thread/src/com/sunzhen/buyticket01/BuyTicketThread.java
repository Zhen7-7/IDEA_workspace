package com.sunzhen.buyticket01;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 13:48
 * @Description: com.sunzhen.buyticket01
 * @version: 1.0
 */
public class BuyTicketThread extends Thread{
    //将要进行的操作放入run方法中
    private static int ticket = 10; //让线程共享这十张票

    public BuyTicketThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            if(ticket>0){
                System.out.println("在"+this.getName()+"买到了第"+ticket--+"火车票");
            }
        }
    }
}
