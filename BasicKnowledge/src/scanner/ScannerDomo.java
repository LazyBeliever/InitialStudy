package scanner;
//1.导包操作(并不需要自己想，通过工具进行导入更方便)
import java.util.Scanner;

public class ScannerDomo {
    public static void main(String[] args){
        //学会使用键盘录入技术
        //2.得到一个键盘扫描器对象
        Scanner sc=new Scanner(System.in);

        //3.调用sc对象的功能，等待接收用户输入的数据


        System.out.println("提示,");
        int age=sc.nextInt();//这个代码会等待用户输入数据,直到用户输入数据并按了回车键就会得到数据
        System.out.println("你的年龄是"+age);

        System.out.println("提示,");
        String name=sc.next();
        System.out.println("欢迎"+name);
    }
}
