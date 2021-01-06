package com.Test_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 16:16
 * @Description: com.Test_Junit
 * @version: 1.0
 */
public class CalculatorTest {
    @Before
    public void init(){
        System.out.println("测试开始了");
    }
    @After
    public void close(){
        System.out.println("测试结束了");
    }

    @Test
    public void TestAdd(){
        System.out.println("测试加法");
        System.out.println(Calculator.add(9,10));
    }
    @Test
    public void TestSub(){

        System.out.println("测试减法");
        System.out.println(Calculator.sub(9,10));
    }
}
