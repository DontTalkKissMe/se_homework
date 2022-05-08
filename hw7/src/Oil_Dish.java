public class Oil_Dish implements Hp_order {
    public Oil_Dish(String dish, int price, int index) {
        if (index == 1) {
            System.out.print(dish + "已加入购物车");
        } else {
            System.out.print(dish + "已移除购物车");
        }
    }
}

