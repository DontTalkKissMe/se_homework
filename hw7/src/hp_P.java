public enum hp_P implements Behaviour{
    B_HP1("鸳鸯火锅", 34,"b_hp1",1), B_HP2("羊肉火锅", 58,"b_hp2",1),
    OD1("蒜泥香菜葱", 1, "od1",1), OD2("香油", 6, "od2",1),
    PKG1("甜蜜双人餐", 168, "PKG1",1), PKG2("挚友四人餐", 268, "PKG2",1),D_S1("精品千层肚", 32, "D_S1",1), D_S2("巴蜀麻辣牛肉", 29, "D_S2",1),
    D_S3("薄荷虾滑", 36, "D_S3",1);
    // 成员变量
    private String name;
    private int price;
    private String index;
    private int number;
    // 构造方法
    private hp_P(String name,int price,String index,int number) {
        this.name = name;
        this.price = price;
        this.index=index;
        this.number=number;
    }
    //接口方法

    }
    public int getNumber() {
        return number;
    }
    public String getIndex() {
        return index;
    @Override
    public void print(String a) {

    }


    public int getPrice(String index) {
        for (hp_P c : hp_P.values()) {
            if (c.getIndex().equals(index)) {
                return c.price;
            }
        }
        return 0;
    }
    public String getName(String index) {
            for (hp_P c : hp_P.values()) {
                if (c.getIndex().equals(index)) {
                    return c.name;
                }
            }
            return null;
    }
    public void setNumber(String a_index,int a){
        for (hp_P c : hp_P.values()) {
            if (c.getIndex().equals(a_index)) {
               c.number=a;
            }
    }
    }
}
