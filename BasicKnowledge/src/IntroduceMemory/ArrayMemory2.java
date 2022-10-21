package IntroduceMemory;

public class ArrayMemory2 {
    public static void main(String[] args){
        int[] arr1={11,22,33};
        int[] arr2=arr1;
        //两个数组相等，即是把数组地址赋给另一个数组变量
        //两个数组拥有同一个地址，所以互通

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(arr1[2]);
        System.out.println(arr2[2]);

        arr2[2]=-11;

        System.out.println(arr1[2]);
        System.out.println(arr2[2]);


    }
}
