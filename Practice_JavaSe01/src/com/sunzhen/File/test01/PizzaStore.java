package com.sunzhen.File.test01;

import java.util.Scanner;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 12:48
 * @Description: com.sunzhen
 * @version: 1.0
 */
public class PizzaStore {
    public static Pizza getPizza(int num) {
        Pizza p = null;
        Scanner sc = new Scanner(System.in);

        switch (num) {
            case 1: {
                //制作培根披萨
                System.out.print("请输入培根的克数:     ");
                int weightOfBacon = sc.nextInt();
                System.out.print("请输入披萨的大小:   ");
                int size = sc.nextInt();
                System.out.print("请输入披萨的价格:   ");
                double prise = sc.nextDouble();
                BaconPizza bp = new BaconPizza("培根披萨", prise, size, weightOfBacon);
                p = bp;
            }
            break;


            case 2: {
                //制作水果披萨
                System.out.print("请输入想要加入的水果:     ");
                String fruit = sc.next();
                System.out.print("请输入披萨的大小:   ");
                int size = sc.nextInt();
                System.out.print("请输入披萨的价格:   ");
                double prise = sc.nextDouble();
                FruitPizza fp = new FruitPizza("水果披萨", prise, size, fruit);
                p = fp;
            }
            break;
        }
        return p;
    }
}
