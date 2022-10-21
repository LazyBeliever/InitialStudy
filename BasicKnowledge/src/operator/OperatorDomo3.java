package operator;

public class OperatorDomo3 {
    public static void main(String[] args){
        //+= 加后赋值
        //等价于a=(a的数据类型)(a+b);将a+b的值进行强制类型转换(如果有需要)后再赋值给a
        int a=1;
        double b=2.3;//int b=2;都是一样的
        a+=b;   //等价于a=(a的数据类型)(a+b);将a+b的值进行强制类型转换(如果有需要)后再赋值给a

        byte i=10;
        byte j=20;
        //i=i+j;这是不对的,byte进行运算时就转换成了int型
        i=(byte)(i+j);
        i+=j;//也可以这样写，因为复合的赋值运算符自带强制类型转化
    }
}
