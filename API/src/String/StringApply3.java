package String;

import java.util.Scanner;

public class StringApply3 {
    public static void main(String[] args) {

        //method1
        Scanner sc=new Scanner(System.in);
        System.out.println("输入手机号：");
        String tel = sc.next();

        String before = tel.substring(0,3);
        String after = tel.substring(7);
        String rs = before+"****"+after;
        System.out.println(rs);


        //method2
        //我觉得这个更好
        System.out.println("输入手机号：");
        String tel2 = sc.next();

        String rs2=tel2.replace(tel2.substring(3,7),"****");
        System.out.println(rs2);



    }
}
