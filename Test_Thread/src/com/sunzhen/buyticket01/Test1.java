package com.sunzhen.buyticket01;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/18 - 11 - 18 - 13:51
 * @Description: com.sunzhen.buyticket01
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        BuyTicketThread t1 = new BuyTicketThread("第一售票口");
        BuyTicketThread t2 = new BuyTicketThread("第二售票口");
        BuyTicketThread t3 = new BuyTicketThread("第三售票口");
        t1.start();
        t2.start();
        t3.start();
    }
}
