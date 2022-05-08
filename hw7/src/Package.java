public class Package implements Hp_order{
    //定义套餐
    public Package(String dish, int price, int index) {
        if (index==0){
            System.out.print(dish+"已加入购物车");
        }
        else
            System.out.print(dish+"已移除购物车");
    }
    }
