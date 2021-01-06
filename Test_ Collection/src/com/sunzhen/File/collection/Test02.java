package com.sunzhen.File.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/8 - 11 - 08 - 11:40
 * @Description: com.sunzhen.collection
 * @version: 1.0
 * 对于collection 的遍历
 */
public class Test02 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(18);
        col.add(12);
        col.add(11);
        col.add(17);
        /*//1.普通for循环:
        for (int i = 0; i < col.size(); i++) {
            col.//发现并没有可以通过索引遍历的方式
        }*/
        //2.增强for循环:
        for(Object o : col){
            System.out.println(o);
        }
        //3.iterator迭代器
        Iterator iterator = col.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
