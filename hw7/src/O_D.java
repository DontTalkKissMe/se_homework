public enum O_D implements Behaviour {

    OD1("蒜泥香菜葱", 1, "od1"), OD2("香油", 6, "od2");
    // 成员变量
    private String name;
    private int price;
    private String index;

    // 构造方法
    private O_D(String name, int price, String index) {
        this.name = name;
        this.price = price;
        this.index = index;
    }

    //接口方法
    public String getIndex() {
        return index;
    }

    @Override
    public void print(String a) {
        for (O_D c : O_D.values()) {
            if (c.getIndex().equals(index)) {
                System.out.println("菜品名称：" + this.name + "，价格为：" + this.price);
            }
        }
    }

    public String getName(String index) {
        for (O_D c : O_D.values()) {
            if (c.getIndex().equals(index)) {
                return c.name;
            }
        }
        return null;
    }

    public int getPrice(String index) {
        for (O_D c : O_D.values()) {
            if (c.getIndex().equals(index)) {
                return c.price;
            }
        }
        return 0;
    }

    @Override
    public void setNumber(String a, int b) {

    }
}
