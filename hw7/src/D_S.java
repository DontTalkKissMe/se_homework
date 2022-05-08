public enum D_S implements Behaviour {

    D_S1("精品千层肚", 32, "D_S1"), D_S2("巴蜀麻辣牛肉", 29, "D_S2"),
    D_S3("薄荷虾滑", 36, "D_S3");
    // 成员变量
    private String name;
    private int price;
    private String index;

    // 构造方法
    private D_S(String name, int price, String index) {
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
        for (D_S c : D_S.values()) {
            if (c.getIndex().equals(index)) {
                System.out.println("菜品名称：" + this.name + "，价格为：" + this.price);
            }
        }
    }

    public String getName(String index) {
        for (D_S c : D_S.values()) {
            if (c.getIndex().equals(index)) {
                return c.name;
            }
        }
        return null;
    }

    public int getPrice(String index) {
        for (D_S c : D_S.values()) {
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
