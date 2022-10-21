package JavaBean;

public class User {

    //成员变量建议使用private私有化修饰

    private String name;
    private double height;
    private double salary;


    /**
     * 要求提供无参构造器，有参构造器无所谓
     * 但是写了有参数构造器就一定要自己再写一个无参数构造器
     */
    //一键生成有参数构造器
    //流程：右键寻找"Generate",然后找"Constructor"即可，按住”shift“键选中需要的即可

    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }
    //一键生成无参数构造器
    //流程：右键寻找"Generate",然后找"Constructor"即可，最下面有个”select none“

    public User() {
    }

    /**
        必须为成员变量提供对应的setter和getter方法
     */

    //idea提供一键生成getter和setter方法
    //流程：右键寻找"Generate",然后找"Getter and Setter"即可，按住”shift“键选中需要的即可

    //实际中，一般送到这里的数据都是合法的，所以不需要加一些检验数据的操作
    //但是一些人能绕过前端限制，所以在这里写一些检验操作也是有用的

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
