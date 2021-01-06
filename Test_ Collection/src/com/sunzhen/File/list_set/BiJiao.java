package com.sunzhen.File.list_set;

import java.util.Comparator;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:51
 * @Description: com.sunzhen.list_set
 * @version: 1.0
 */
public class BiJiao implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getName()).compareTo(o2.getName());
    }
}
