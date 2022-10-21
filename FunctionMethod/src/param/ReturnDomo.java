package param;

public class ReturnDomo {
    public static void main(String[] args){
        //明确return关键字作用
        devide(10,0);
    }
    public static void devide(int a,int b){
        if(b==0){
            System.out.println("error");
            return;//立即跳出当前方法,并结束当前方法的执行
            //return单独使用的作用
        }
        System.out.println(a/b);
    }
}
