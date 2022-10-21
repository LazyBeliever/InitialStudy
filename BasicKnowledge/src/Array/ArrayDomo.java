package Array;

public class ArrayDomo {
    public static void main(String[] args){

        //静态初始化数组格式：
        //  标准格式：数据类型[] 数组名称=new 数据类型[]{元素1，元素2};
        //      标准格式可以拆分为两步： int[] arr;  arr=new int[]{元素1，元素2};
        //  省略格式：数据类型[] 数组名称={元素1，元素2};




        //动态初始化数组的默认值
        int[] arr=new int[10];
        //整型数组默认值数字0
        System.out.println(arr[0]);

        char[] ch=new char[10];
        //ASCII值是0
        System.out.println(ch[0]);

        double[] score=new double[10];
        //默认值为0.0
        System.out.println(score[0]);

        boolean[] bl=new boolean[10];
        //默认值为false
        System.out.println(bl[0]);

        String[] st=new String[10];
        //默认值为null
        System.out.println(st[0]);
    }
}
