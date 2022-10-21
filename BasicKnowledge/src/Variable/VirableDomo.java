package Variable;

public class VirableDomo {
    public static void main(String[] args){
        //学会使用变量
        double money=6.66;
        System.out.println(money);

        money+=4;
        System.out.println(money);
        char ch='a';
        System.out.println(ch);

        int i=0X62;
        System.out.println(i);

        //整数
        //byte 1字节(字节型)(-128~127)
        //short 2字节(短整型)

        //int 4字节(默认)
        //随便写一个整数字面量，默认int型
        //long l=123123123123123123123;//这里这个整数就太大了
        //如果希望写的整型的字面量为long，最后应加L/l
        long l=134123541453454l;
        // long 8字节


        //浮点数
        //随便写一个小数，默认为double类型
        //同理，为了使输入的浮点数为float型，应在数字末尾加F/f;
        //float 4字节     double 8字节(默认)

        //字符
        //char      1字节

        //布尔
        //boolean       1字节
        boolean  a=true;
        //boolean    b=1;//int无法转换为boolean

        System.out.println("------引用数据类型(先介绍字符串)---------");
        String  name="贺亚崇";
        System.out.println(name);

    }
}
