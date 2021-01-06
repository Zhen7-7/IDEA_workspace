package com.sunzhen.File.test01;

import java.util.Scanner;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 10:12
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请选择你想要购买的匹萨（1.培根匹萨 2.水果匹萨）:  ");

        int num = sc.nextInt();
        Pizza pizza = PizzaStore.getPizza(num);
        System.out.println(pizza.show());
    }

}
