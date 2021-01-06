package com.sunzhen.File.compare;

import java.util.Comparator;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/13 - 11 - 13 - 10:10
 * @Description: com.sunzhen.compare
 * @version: 1.0
 */
public class BiJiao02 implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return ((Double)o1.getHeight()).compareTo((Double)o2.getHeight());
    }
}
