public enum B_hp implements Behaviour {
    B_HP1("鸳鸯火锅", 34,"b_hp1"), B_HP2("羊肉火锅", 58,"b_hp2");
    // 成员变量
    private String name;
    private int price;
    private String index;
    // 构造方法
    private B_hp(String name,int price,String index) {
        this.name = name;
        this.price = price;
        this.index=index;
    }
    //接口方法
    public String getIndex() {
        return index;
    }
    public String getName(String index) {
        for (B_hp c : B_hp.values()) {
            if (c.getIndex().equals(index)) {
                return c.name;
            }
        }
        return null;
    }
    public int getPrice(String index) {
        for (B_hp c : B_hp.values()) {
            if (c.getIndex().equals(index)) {
                return c.price;
            }
        }
        return 0;
    }

    @Override
    public void setNumber(String a, int b) {

    }

    //接口方法
    @Override
    public void print(String index) {
        for (B_hp c : B_hp.values()) {
            if (c.getIndex().equals(index)) {
                System.out.println("菜品名称："+this.name+"，价格为："+this.price);
            }
        }
    }
}
