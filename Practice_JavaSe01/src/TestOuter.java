/**
 * @Auther: sunzhen
 * @Date: 2020/10/29 - 10 - 29 - 19:15
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
/*
*1.一个类包括: 属性,方法,构造器,代码块(普通块,静态块,构造块,同步款),内部类
*2.一个类TestOut的内部类SubTest叫内部类; 内部类:SubTest  外部类:TestOuter
*3.成员内部类 : 静态的和非静态的;     局部内部类(方法内,块内,构造器内)
*4.成员内部类:
    *组成:属性,方法,构造器等
    *修饰符:public private default protect final abstract
*/
public class TestOuter {
    int age = 10; //属性;
    static String name = "pig";
    public class D { //非静态的成员内部类
        int num = 1;
        int age = 20;
        public void method(){
            //5.内部类可以访问外部类的内容
            System.out.println(age);
            a();
            int age = 30;

            //8.当有大量变量名字重复时如何去进行调用:
            System.out.println(age);//离得最近的  30
            System.out.println(this.age);//当前类的age =20;
            System.out.println(TestOuter.this.age); //10

        }
    }
    static class E{
        public void method(){
            //System.out.println(age);//这里是错的,6.静态方法只能访问静态变量和static修饰的内容
            System.out.println(name);
           // a();
        }
    }

    public  void a(){
        class A{};


        System.out.println("这是一个方法");
        {
            System.out.println("这是一个代码块");
            class B {
            }
        }
        //7.要想访问内部类的内容,需要创建内部类的对象然后进行调用;
        D d = new D();
        System.out.println(d.num);
        d.method();



    }

    public TestOuter(){
        class C{}; //构造器中的内部类;
    }
}
class Demo{
    public static void main(String[] args) {
        TestOuter to = new TestOuter();
        to.a();

        //9.创建内部类的对象:
        //静态的成员内部类创建对象:
        TestOuter.E e = new TestOuter.E();
        //非静态成员内部类创建对象:
        //错误 TestOuter.D dd = new TestOuter.D();
        TestOuter t= new TestOuter();
        TestOuter.D d = t.new D();
    }
}
