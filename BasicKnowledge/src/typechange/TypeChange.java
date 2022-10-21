package typechange;

public class TypeChange {
    public static void main(String[] args){

       /*

        //自动类型转换
        byte a=20;
        int b=a;
        //byte->short->int->long->float->double
        //char->int;
        System.out.println(a);
        System.out.println(a);

        int age=23;
        double b2=age;
        System.out.println(b2);

        char c='a';
        int csa=c;
        System.out.println(csa);

        */



        /*
        //表达式的自动类型转换规则
        //byte,short,char->int->long->float->double
        //表达式的最终结果类型由表达式中的最高类型决定。
        byte x=10;
        int y=20;
        double z=1.0;
        double re=x+y+z;
        System.out.println(re);

        double re2=x+y+3.333;
        System.out.println(re2);

        //在表达式中byte,short,char是直接转换成int参与运算的。
        byte i=10;
        byte j=20;
        int k=i+j;

        */

        //强制类型转换(可能导致数据丢失/溢出)
        //格式:       数据类型 变量=(数据类型)其他的类型的变量/数据
        //浮点型转换为整型，直接丢掉小数部分，保留整数部分返回
        int a=128;
        byte b=(byte)a;//a=128,此时b=-128;
        a=1500;
        b=(byte)a;

        System.out.println(b);







    }
}
