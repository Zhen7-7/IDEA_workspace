package com.sunzhen.File.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/8 - 11 - 08 - 11:12
 * @Description: com.sunzhen.collection
 * @version: 1.0
 *
 * 以下是对于Collection接口进行学习:
 * 增:add()  addAll()
 * 删:clear() remove()
 * 改:
 * 查:iterator() size()
 * 判断:isEmpty() equals()
 */
public class Test01 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("lalala");
        col.add(13);
        col.add(true);
        col.add('r');
        System.out.println(col/*.toString()*/);
        List list = Arrays.asList(new Integer[]{11, 23, 45, 65, 87});
        col.add(list);
        System.out.println(list);
        System.out.println(col);
        //col.clear();
        System.out.println(col);
        System.out.println(col.size());
        System.out.println(col.isEmpty());

        boolean isRemove = col.remove('r');
        System.out.println(col);
        System.out.println(isRemove);

        Collection col2 = new ArrayList();
        col2.add(18);
        col2.add(12);
        col2.add(11);
        col2.add(17);
        Collection col3 = new ArrayList();
        col3.add(18);
        col3.add(12);
        col3.add(11);
        col3.add(17);
        System.out.println(col2.equals(col3));//true
        System.out.println(col2 == col3);//false
        System.out.println(col2.contains(12));


    }
}
