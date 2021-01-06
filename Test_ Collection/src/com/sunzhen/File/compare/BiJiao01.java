package com.sunzhen.File.compare;

import java.util.Comparator;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:08
 * @Description: com.sunzhen.compare
 * @version: 1.0
 */
public class BiJiao01 implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        //比较年龄:
        return o1.getAge()-o2.getAge();
    }
}
