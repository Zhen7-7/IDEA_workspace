package com.sunzhen.File.compare;

import java.util.Comparator;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:12
 * @Description: com.sunzhen.compare
 * @version: 1.0
 */
public class BiJiao03 implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return (o1.getName()).compareTo(o2.getName());
    }
}
