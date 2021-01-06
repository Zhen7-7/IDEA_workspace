package com.sunzhen.File.compare;

import java.util.Comparator;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:17
 * @Description: com.sunzhen.compare
 * @version: 1.0
 */
public class BiJiao04 implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        //年龄相同比较姓名:
        if(o1.getAge()-o2.getAge()==0){
            return (o1.getName()).compareTo((o2.getName()));
        }else{
            return o1.getAge()-o2.getAge();
        }
    }
}
