package com.sunzhen.File.test01.exception;

import java.util.Scanner;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/31 - 10 - 31 - 9:47
 * @Description: com.sunzhen.exception
 * @version: 1.0
 * 我们可以看出该方法太过于复杂,不适合解决复杂的异常
 */
public class SolveByIfELse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        System.out.print("请输入第一个数\t");
        if(sc.hasNextInt()) {
            int num1 = sc.nextInt();


            System.out.print("请输入第二个数\t");
            if(sc.hasNextInt()){
                int num2 = sc.nextInt();
                if (num2 == 0) {
                    System.out.println("请输入非0的数");
                } else {
                    System.out.println(num1 / num2);
                }
            }else{
                System.out.println("请输入整数");
            }

        }else{
            System.out.println("请输入整数");
        }
    }
}
