package Method;

public class MethodDomo1 {
    public static void main(String[] args){

        int a=10;
        int b=20;
        int c=sum(10,20);
        int d=sum(a,b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(sum(a,b));
        System.out.println(recursion(6));


    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int recursion(int n){
        return n==1?1:n+recursion(n-1);
    }
}
