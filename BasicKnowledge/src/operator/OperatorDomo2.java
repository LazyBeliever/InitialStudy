package operator;

public class OperatorDomo2 {
    public static void main(String[] args){
        //  "+"做连接符
        //能算则算，不能算就在一起
        int a=5;
        System.out.println("abc"+'a');//abca
        System.out.println("abc"+a);//abc5
        System.out.println(5+a);//10
        System.out.println("abc"+5+'a');//abc5a
        System.out.println(15+"abc"+15);//15abc15
        System.out.println(a+'a');//102
        System.out.println(a+""+'a');//5a
        System.out.println(a+'a'+"example");//102example
        System.out.println("example"+a+'a');//example5a
        System.out.println("example"+(a+'a'));//example102
        System.out.println('a'+15);//112


    }
}
