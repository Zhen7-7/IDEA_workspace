package com.sunzhen.File.list_set;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/10 - 11 - 10 - 15:24
 * @Description: com.sunzhen.List
 * @version: 1.0
 */
public class TestLinkedList {
    public static void main(String[] args) {
        /*
        * 增:addFirst(E e)   addLast(E e)    offer(E e)  offerFirst(E e) offerLast(E e)
         * 删:poll()
            pollFirst() pollLast()  ---》JDK1.6以后新出的方法，提高了代码的健壮性
            removeFirst() removeLast()
        * 改:
        * 查:element()
             getFirst()  getLast()
             indexOf(Object o)   lastIndexOf(Object o)
             peek()
         * 判断:
         */
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        list.add("ddddd");
        list.add("eeeee");
        list.add("bbbbb");
        list.add("fffff");

        /*list.addFirst("0000");
        list.addLast("1111");

        list.offer("0");
        list.offerFirst("1");
        list.offerLast("11");
        System.out.println(list);
        LinkedList<Integer> list1 = new LinkedList<>();
        //list1.remove();会出现异常
        System.out.println(list1.poll());
        System.out.println(list1);
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list.remove("aaaaa"));
        System.out.println();

        System.out.println(list);
        System.out.println(list.element());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf("0"));
        System.out.println(list.indexOf("bbb"));
        System.out.println(list.peek());*/
        //结合的遍历:
        //1.普通for循环:
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();
        //2.增强for循环:
        for(String str:list){
            System.out.print(str+"\t");
        }
        System.out.println();
        //3.迭代器:
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }
        System.out.println();
        //4for+迭代器
        for (Iterator<String> it1 = list.iterator();it1.hasNext();){
            System.out.print(it1.next()+"\t");
        }


    }
}
