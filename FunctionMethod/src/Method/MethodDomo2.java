package Method;

public class MethodDomo2 {
    public static void main(String[] args){
       double rs;
        //学习方法的完整定义格式,并理解其调用和执行流程
        rs=add(100,200);
        System.out.println(rs);
        System.out.println(fn(10));
    }

    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static int fn(int n){
        return n==1?1:n+fn(n-1);
    }
}
