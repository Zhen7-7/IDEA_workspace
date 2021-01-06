package com.sunzhen.File.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/8 - 11 - 08 - 11:57
 * @Description: com.sunzhen.collection
 * @version: 1.0
 *
 * 学习List接口的除Collection包含的方法:
 * 增: add(int index,Object element)
 * 删:remove(int index)  remove(Object o)
 * 改:set(int index , E element)
 * 查:get (int index)
 * 判断:
 */
public class Test03_List {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(12);
        list.add(19);
        list.add(2);
        System.out.println(list);
        list.add(3,"four");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove("four");
        list.remove((Integer)2);
        System.out.println(list);
        list.set(0,0);
        System.out.println(list);
        //1.for循环遍历:
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //2.增强for循环:
        for(Object o : list){
            System.out.println(o);
        }
        //3.迭代器:
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
