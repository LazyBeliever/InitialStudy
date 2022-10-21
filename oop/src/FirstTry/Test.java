package FirstTry;

public class Test {
    public static void main(String[] args){
        //创建类的对象



        Car c=new Car();
        c.name="bmw";
        c.price=233.3;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();

        Car c2=new Car();
        c2.name="bc";
        c2.price=33.33;
        System.out.println(c2.name);
        System.out.println(c2.price);

        c2.start();
        c2.run();
        System.out.println(c);
        System.out.println(c2);
    }
}
