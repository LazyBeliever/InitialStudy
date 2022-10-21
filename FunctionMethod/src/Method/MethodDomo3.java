package Method;

public class MethodDomo3 {
    public static void main(String[] args){
        //学会方法定义的其他形式，并理解流程
        //方法可重名，但是参数要不一样

        //方法可以写在main方法上面，也可以写在main函数下面
        //写在下面也不用在主函数上面声明
        print();
        print(3);
    }
    //方法没有被调用时,在方法区中的字节码文件中存放

    //方法被调用时,需要进入栈内存中运行
    //无参数，无返回值的方法
    public static void print(){
        System.out.println("Hello world");

    }
    public static void print(int n){
        for(int i=0;i<n;i++){
            System.out.println("Hello world");
        }
    }
}
