package com.sunzhen.File.test01.exception;

import java.util.Scanner;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/31 - 10 - 31 - 10:38
 * @Description: com.sunzhen.exception
 * @version: 1.0
 */
public class SolveTryCatch {
    public static void main(String[] args) {
        try {Scanner sc =new Scanner(System.in) ;
            System.out.print("请输入第一个数\t");
            int num1 = sc.nextInt();
            System.out.print("请输入第二个数\t");
            int num2 = sc.nextInt();
            System.out.println(num1 / num2);
            System.exit(0);//终止当前虚拟机执行  finally里的也不会运行
            return;//直接结束线程;


        }catch(Exception ex){
            //1.什么也干

            //2.给予友好性提示:
            //System.out.println("代码出错");

            //3.打印异常信息:
            /*调用toString方法,显示异常的类名(全限定路径)
            System.out.println(ex);
            System.out.println(ex.toString());
            显示异常描述信息对应的字符串,如果没有就显示null;
            System.out.println(ex.getMessage());
            显示异常的堆栈信息,将异常信息捕获后,在控制台将异常的信息展示给我们,方便查看:*/
            // ex.printStackTrace();

            //4.将异常抛出
            //throw ex;
            /*return;//将不会执行最后的代码*/

        }finally {
            System.out.println("finally里的代码块");
        }

        System.out.println("之后的代码___");
    }
}
