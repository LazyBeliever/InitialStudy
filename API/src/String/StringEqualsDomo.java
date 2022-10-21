package String;

import java.util.Scanner;

public class StringEqualsDomo {
    public static void main(String[]args){
        //登陆名称和密码比对

        //正确账号密码
        String okName="728";
        //okName指向常量池中的内容
        String okPassword="150";

        //登陆时用的账号密码
        Scanner sc=new Scanner(System.in);
        System.out.println("登录名：");
        String name=sc.next();
        //name指向堆内存中的数据
        System.out.println("密码：");
        String password=sc.next();

        System.out.println("--------1-------------");
        if(okName==name&&okPassword==password){
            System.out.println("loading successfully");
        }else {
            System.out.println("name or password is error");
        }
        //"=="在String中比较的是地址，不是比较的内容，而本例需要比较内容而不是比较地址
        //而在基本数据类型中，“==”比较的是内容;

        System.out.println("----------------2-----------");
        //equals是String提供的API，只关心内容是否一样，不关心地址
        //equals有两个，一个区分大小写，另一个不区分大小写

        //public boolean equals(Object anObject)
        // 将此字符串与指定对象比较，只关心字符串内容是否一致
        //账号密码登陆

        //public boolean equalsIgnoreCase(String anotherString);
        //将此字符串与指定对象比较，忽略大小写比较字符串，只关心字符串内容是否一致
        //忽略大小写比较内容的API一般用于验证码的比较

        if(okName.equals(name)&&okPassword.equals(password)){
            System.out.println("loading successfully");
        }else {
            System.out.println("name or password is error");
        }

        System.out.println("----------------3-----------");
        String syCode="23AsDfG";
        String code1="23aSdFg";
        System.out.println(syCode.equals(code1));

        System.out.println(syCode.equalsIgnoreCase(code1));


    }
}
