package String;

public class StringDomo {
    public static void main(String[] args){

        /**
         * 创建字符串对象的两种方法
         */
        /**
         * //一：直接定义
          */
        String name="你好";
        System.out.println(name);


        /**
         *  //二：通过String类的构造器创建对象
          */
        // 常见String的构造器
         //  1. public String();创建一个空白字符串对象，不含有任何内容//几乎不用
        String s1=new String();
        System.out.println(s1);

         // 2. public Sting(String original);根据传入的字符串内容来创建字符串对象//几乎不用
        String s2=new String("您好");
        System.out.println(s2);

         //  3.  public Sting(char[] chs);根据字符数组的内容创建字符串对象
        char[] chs={'a','b','中'};
        String s3=new String(chs);
        System.out.println(s3);

         // 4.  public Sting(byte[] chs);根据字节数组的内容创建字符串对象
        byte[] chs2={97,98,99,100};
        String s4=new String(chs2);
        System.out.println(s4);


        /**
         * 两种方法的区别
         * 以“”方式（方法一）给出的字符串对象，在字符串常量池中存储，
                    且相同内容只存储一份
         *通过构造器new对象，每new一次都会产生一个新的对象，放在堆内存中
         */

        /**
         *  == 在String类中是比较地址的，而不是比较内容
         */
        System.out.println("----------1----------");
        String ss1="abc";
        String ss2="abc";
        System.out.println(ss1 == ss2);

        char[] chars1={'a','b','c'};
        String ss3=new String(chars1);
        String ss4=new String(chars1);
        System.out.println(ss3 == ss4);


        System.out.println("-------2---------");
        String sss2=new String("abc");
        //该代码创建两个对象，一个是“abc”，一个是new出来的

        String sss1="abc";
        //有上一行代码，该代码不会创建对象，（因为常量池中已经存在了“abc”）
        // 没有上一行代码，该代码会创建一个对象

        System.out.println(s1 == s2);
        //sss1指向常量池  sss2指向堆内存

        System.out.println("--------3--------");
        String ssss1="abc";
        //放在常量池
        String ssss2="ab";
        String ssss3=ssss1+"c";
        //ssss1是个变量，编译阶段不能确定其值，所以不能优化
        //只要不是由""直接给出来的，都是放在堆内存的
        System.out.println(ssss1 == ssss3);
        //false

        System.out.println("---------4-------");
        String st1="abc";
        String st2="a"+"b"+"c";
        //Java存在编译优化机制，程序在编译时，"a"+"b"+"c"会直接转成“abc”
        //而"a"+"b"+"c"在编译阶段就能确定其确切的值，所以可以优化
        System.out.println(st1 == st2);
        //true

    }
}
