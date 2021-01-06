package com.sunzhen.File.e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/9 - 11 - 09 - 18:41
 * @Description: com.sunzhen.e
 * @version: 1.0
 */
public class GenericOperator {
    /*public void a(List<Object> list){
        System.out.println("这是方法a");
    }
    public void a(List<String> list){

    }
    public void a(List<Integer> list){

    }*/
    //使用通用符:
    public void a(List<?> list){}

}
/*class TestGO{
    public static void main(String[] args) {
        GenericOperator go = new GenericOperator();
       go.a(new ArrayList<Object>());
       go.a(new ArrayList<Integer>());
       go.a(new ArrayList<StringBuilder>());

    }

}*/
class Test02{
    public static void main(String[] args) {
        Collection<Object> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        Collection<Integer> c3 = new ArrayList<>();

//        c1 = c2;  不可以
//        c2 = c3;
        Collection<?> c = new ArrayList<>();
        c =c1;
        c = c2;
        c = c3;
        //可以看出A和B是父类子类的关系,但G<A>和G<B>并不是父子关系,而是并列的关系
        //但是加入通配符"?"后 G<?>就是G<A>和G<B>的父类

    }
}