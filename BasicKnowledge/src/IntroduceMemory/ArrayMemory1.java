package IntroduceMemory;

public class ArrayMemory1 {
    //main方法在栈里面
    public static void main(String[] args){
        int a=12;
        //这个存放在栈内存
        //基本数据类型存的数据本身
        System.out.println(a);

        int[] arr={11,22,33};
        //引用数据的变量存的地址
        //数组的空间是开辟在堆内存的,栈内存中只有一个地址
        System.out.println(arr);
        //new出来的空间是放在堆内存的
    }
}
