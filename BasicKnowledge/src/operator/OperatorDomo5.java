package operator;

public class OperatorDomo5 {
    public static void main(String[] args){
        //三元运算符
        double score=18;
        String rs=score>=60?"考试通过":"挂科";
        System.out.println(rs);

        //
        int a=10,b=30,c=50;
        int max=(a>b?a:b)>c?(a>b?a:b):c;
        int max2=a>b?a>c?a:c:b>c?b:c;//三目运算符的嵌套
        System.out.println(max);
        System.out.println(max2);
    }
}
