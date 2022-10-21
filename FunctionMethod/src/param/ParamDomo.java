package param;

public class ParamDomo {
    public static void main(String[] args){
        int a=10;
        change(a);
        System.out.println(a);

        int arrs[]={10,20,30};
        change(arrs);
        System.out.println(arrs[1]);
        printarray(arrs);
    }
    public static int change(int a){
        a=70;
        return a;
    }
    //引用类型传递

    public static void change(int[] arrs){
        System.out.println(arrs[1]);
        arrs[1]=222;
        System.out.println(arrs[1]);
    }

    public static void printarray(int[] arr){
        if(arr!=null&arr.length>0){
            //严谨性,数组地址不能为null,且数组长度要大于0
            System.out.print("[");
            for(int i=0;i<arr.length-1;i++){
                System.out.print(arr[i]+",");
            }
            System.out.println(arr[arr.length-1]+"]");
        }
    }

}
