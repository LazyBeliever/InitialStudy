package Constructor;

public class Attention {

    //所有类都默认有一个无参构造器,写不写都有
    /*
    格式为:
            public class 类名(){}
     */

    //一旦定义了有参数构造器，那么无参数构造器就消失了
    //如果此时还想用无参数构造器，就必须自己写一个，格式参见上边
}


    //////////this指针的用途

class Car{
    String name;
    double price;

    /////////this在构造器中
    /*public Car(String n,int p){
        name=n;
        price=p;
        //这样写并不好
    }*/

    //应该这样写：应用this指针，能够更容易读懂
    public Car(String name,int price){
        //name=name 并不能给当前对象中的name赋值，因为两个name都是形参中的name
        //左值name（形参中的）就近赋值给形参中的name，赋值无效(自己给自己赋值)
        this.name=name;
        this.price=price;
    }

    ///////////this在成员方法中

   /* public void goWith(String name){
        System.out.println(name+"正在和"+name+"比赛");
        //此处两个name都是形参中的name
    }*/

    //应该改成
    public void goWith(String name){
        System.out.println(this.name+"正在和"+name+"比赛");
    }

}
