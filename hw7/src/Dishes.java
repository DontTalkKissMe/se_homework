public class Dishes implements Hp_order{
    //菜品类
    public Dishes(String dish, int price, int index) {
        if (index==0){
            System.out.print(dish+"已加入购物车");
        }
        else
            System.out.print(dish+"已移除购物车");
    }
    }

