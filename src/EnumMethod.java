public enum EnumMethod {
    // インスタンスフィールドの利用
    TARO(1.80, 70.0),
    JIRO(1.65, 55.0),
    GORO(1.90, 90.0);

    // Enumの値は固定値なのでfinalにする
    private final double height;
    private final double weight;

    EnumMethod(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    // Enumのメソッド利用
    // アクセサ
    public double height(){ return height;}
    public double weight(){ return weight;}

    // 計算値を返すメソッド
    public double bmi(){ return weight/(height*height);}
}
