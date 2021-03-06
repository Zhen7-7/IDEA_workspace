package com.sunzhen.File.list_set;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 9:46
 * @Description: com.sunzhen.compare
 * @version: 1.0
 */
public class Student implements Comparable<Student> {
    private int age;
    //private double height;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int age,  String name) {
        this.age = age;

        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    //内部比较器:
    @Override
    public int compareTo(Student o) {
        //按照年龄进行比较:
        return this.getAge()-o.getAge();
        //按照身高进行比较:
        //return ((Double)this.getHeight()).compareTo((Double)o.getHeight());
        //按照姓名进行比较:
        // return (this.getName()).compareTo(o.getName());
    }
}
