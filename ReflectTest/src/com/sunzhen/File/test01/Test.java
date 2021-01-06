package com.sunzhen.File.test01;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/7 - 11 - 07 - 12:43
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //定义一个字符串,用来模拟前台的支付方式
        String str = "支付宝";
        switch (str){
            case "微信":{
                //微信支付
                //new Wechat().payOnline();
                pay(new Wechat());

            }break;
            case "支付宝":{
                //支付宝支付
                //new Alipay().payOnline();
                pay(new Alipay());
            }break;
            case "银行卡":{
                pay(new BankCard() );

            }
        }


    }
    //我们利用面向对象的三大特性之一的多态去实现一个代码的精简
    //用接口作为形参,实现类作为实参;

    public static void pay(Mtwm mtwm){
        mtwm.payOnline();
    }
    /*    //用方法去替换对象的方法调用:太过于冗余
    public static void pay(Wechat wc){
        wc.payOnline();
    }
    public static void pay(Alipay ap){
        ap.payOnline();
    }
    public static void pay(BankCard bc){
        bc.payOnline();
    }*/
}
