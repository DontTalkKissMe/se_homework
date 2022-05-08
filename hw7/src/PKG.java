public enum PKG implements Behaviour {

    PKG1("甜蜜双人餐", 168, "PKG1"), PKG2("挚友四人餐", 268, "PKG2");
    // 成员变量
    private String name;
    private int price;
    private String index;

    // 构造方法
    private PKG(String name, int price, String index) {
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
        for (PKG c : PKG.values()) {
            if (c.getIndex().equals(index)) {
                System.out.println("菜品名称：" + this.name + "，价格为：" + this.price);
            }
        }
    }

    public String getName(String index) {
        for (PKG c : PKG.values()) {
            if (c.getIndex().equals(index)) {
                return c.name;
            }
        }
        return null;
    }

    public int getPrice(String index) {
        for (PKG c : PKG.values()) {
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
