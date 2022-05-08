public class Bottom_HP implements Hp_order{

    //火锅锅底
    public Bottom_HP(String dish, int price, int index){
        if (index==0){
           System.out.print(dish+"已加入购物车");
        }
        else
            System.out.print(dish+"已移除购物车");
        }
    }

