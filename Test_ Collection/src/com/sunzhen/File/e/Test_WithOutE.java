package com.sunzhen.File.e;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/8 - 11 - 08 - 20:36
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
public class Test_WithOutE {
    public static void main(String[] args) {
        //没有规定泛型时
        //创建一个ArrayList集合,向这个集合存入学生的成绩
        Collection list = new ArrayList();
        list.add(99);
        list.add(98);
        list.add(Integer.MIN_VALUE);
        list.add("傻逼咸鱼");
        System.out.println(list);
        //对数组进行遍历:
        for (Object o : list){
            System.out.println(o);
        }
        //我们可以看出当我们想存储同一个数据类型时,没有规定泛型行 时,很难去管理数据,换句话说设么数据都可以存入集合
        //非常的难搞
    }
}
