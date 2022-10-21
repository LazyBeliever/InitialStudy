package ShoppingTest;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args){

        //定义商品类.    定义购物车对象,目前使用数组，后期用集合
        Goods[] shopCar=new Goods[100];

        //搭建架构

        while (true) {
            System.out.println("您要做什么？");
            System.out.println("添加: add");
            System.out.println("查询:query");
            System.out.println("修改购买数量:update");
            System.out.println("结算购物车:pay");
            System.out.println("退出:exit");

            Scanner sc=new Scanner(System.in);
            String command=sc.next();

            switch(command){
                case "add":
                    addGoods(shopCar,sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar,sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("没有该功能");
                    break;
            }
        }
    }
    public static void addGoods(Goods[] shopCar,Scanner sc){
        Goods g=new Goods();
        System.out.println("编号(不重复)");
        g.id=sc.nextInt();
        System.out.println("名称");
        g.name=sc.next();
        System.out.println("数量");
        g.buyNumber=sc.nextInt();
        System.out.println("价格");
        g.price=sc.nextDouble();

        for(int i=0;i<shopCar.length;i++){
            if(shopCar[i]==null){
                shopCar[i]=g;
                break;
            }
        }
        System.out.println("商品添加完成");
    }
    public static void queryGoods(Goods[] shopCar){
        System.out.println("-------购物车信息如下-------");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量");
        for (int i=0;i<shopCar.length;i++) {
            Goods g=shopCar[i];
            if(g!=null){
                System.out.println(g.id+"\t\t"+g.name+"\t\t"+g.price+"\t\t"+g.buyNumber);
            }else {
                break;
            }
        }
    }
    public static void updateGoods(Goods[] shopCar,Scanner sc){
        while (true) {
            System.out.println("要修改的商品的id:");
            int id=sc.nextInt();
            Goods g=getGoodsById(shopCar,id);
            if(g==null){
                System.out.println("没有该商品");
            }else {
                System.out.println("请输入"+g.name+"的新的购买数量");
                g.buyNumber=sc.nextInt();
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }
    }
    public static Goods getGoodsById(Goods[] shopCar,int id){
        for(int i=0;i<shopCar.length;i++){
            if(shopCar[i]!=null){
                if(shopCar[i].id==id){
                    return shopCar[i];
                }
            }else {
                return null;
            }
        }
        return null;
    }
    public static void payGoods(Goods[] shopCar){
        queryGoods(shopCar);
        //求和变量累加金额
        double money=0;
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]!=null){
                money+=(shopCar[i].price*shopCar[i].buyNumber);
            }else {
                break;
            }
        }
        System.out.println("购物车中订单总金额"+money);
    }
}
