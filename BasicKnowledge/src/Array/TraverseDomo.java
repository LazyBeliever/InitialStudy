package Array;

public class TraverseDomo {
    public static void main(String[] args){
        int[] arr={21,34,54,67,56};

        //数组长度可以直接由  数组名.length  获得,不一定要知道定义时使用的长度
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            //arr.fori可以快速写出for循环
            System.out.println(arr[i]);
            //arr[i]。sout可以快速写出这行
        }

    }
}
