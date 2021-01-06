package com.sunzhen.File.test02;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/7 - 11 - 07 - 14:00
 * @Description: com.sunzhen.test02
 * @version: 1.0
 */
public class Student {
    //属性:
    private int sno;//学号
    double height ;//身高
    protected double weight;//体重
    public double score;//分数
    //方法:
    public String showInfo(){
        return "我是一名三好学生";
    }
    public void work(){
        System.out.println("我以后找工作--->程序员 程序猿");
    }
    //构造方法:
    public Student(){
        System.out.println("空参构造器");
    }
    private Student(int sno){
        this.sno=sno;
    }
    Student (int sno, double weight){
        this.sno = sno;
        this.weight = weight;
    }

}
