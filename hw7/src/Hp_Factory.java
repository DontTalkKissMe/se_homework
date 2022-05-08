public class Hp_Factory {
    public static Hp_order Hp_Factory(String orderName, String dish, int price, int index) throws Exception{
        if(orderName.equals("Bottom_HP")){
            return new Bottom_HP(dish,price,index);
        }else if(orderName.equals("Oil_Dish")){
            return new Oil_Dish(dish,price,index);
        }else if(orderName.equals("Dishes")){
            return new Dishes(dish,price,index);
        } else if(orderName.equals("Package")){
            return new Package(dish,price,index);
        }else{
            throw new Exception("输入出错");
        }
    }
}
