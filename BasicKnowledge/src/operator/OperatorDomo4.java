package operator;

public class OperatorDomo4 {
    public static void main(String[] args){
        //关系运算符，表达式为布尔结果 即true  或者false

        /*
        int a=10;
        int b=10;
        boolean rs=a==b;
        System.out.println(rs);
        System.out.println(a<b);
         */

        //逻辑运算符     & | ^无论左边怎样，右边的都会执行
        // & 逻辑与
        // | 逻辑或
        // ! 逻辑非
        // ^  (异或,两个都是true或者两个都是false则表达式为假)
        // ^  (异或,两个的真假性不同表达式才为真)

        /*
        double size=6.95;
        int storage=6;

        boolean rs=size>=6.95&storage>8;
        System.out.println(rs);
        System.out.println(size>=6.95&storage>1);

        System.out.println(true|false);
        System.out.println(!true);
        System.out.println(true^false);
        */
        //单逻辑运算符优先级比短路逻辑运算符高
        //短路逻辑运算符
        // && 短路与   判断结果和& 一样,但是左边为假,则右边不执行
        // || 短路或   判断结果和| 一样,但是左边为真,则右边不执行

        System.out.println("--- && & || | 的区别------");

        int a=10,b=20;
        System.out.println(a>100 && ++b>10);
        System.out.println(b);
        System.out.println(a>100 & ++b>10);
        System.out.println(b);

        int i=10,j=20;
        System.out.println(i>2 || ++j>10);
        System.out.println(j);
        System.out.println(i>2 | ++j>10);
        System.out.println(j);








    }
}
