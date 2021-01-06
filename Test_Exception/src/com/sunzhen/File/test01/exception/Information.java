package com.sunzhen.File.test01.exception;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/31 - 10 - 31 - 16:30
 * @Description: com.sunzhen.exception
 * @version: 1.0
 */
public class Information {
    private String name;
    private String sex;
    private int age;

    public Information() {
    }

    public Information(String name, String sex, int age) {
        this.name = name;
        this.sex = Information.judgeAge(sex);
        this.age = age;
    }

    public static String judgeAge(String sex) {
        if ("男".equals(sex) || "女".equals(sex)) {
            return sex;
        } else {
            //解决方式:
            return "男";
        }
    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public void setSex(String sex) throws Exception {//将异常抛出给调用它的方法
        if ("男".equals(sex) || "女".equals(sex)) {
            this.sex = sex;
        } else {
            /*解决方式:
            2.给出友好型提示,但是打印结果为默认的null
             System.out.println("您的性别错了");
            3.制作运行时异常
            throw new RuntimeException("性别错了");
            4.制造检查异常:
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
            throw new Exception();
        }
    }
}
