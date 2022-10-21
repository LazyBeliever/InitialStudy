package JavaBean;

public class Test {
    public static void main(String[] args){

        //无参构造
        User u1=new User();
        u1.setName("hyc");
        u1.setHeight(199);
        u1.setSalary(5000000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        //有参构造
        User u2=new User("hyc",168,17000);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
