// インスタンス化できないユーティリティクラス
public class Utility {
    // インスタンス化できないようコンストラクタをprivateにする。
    // 抽象クラスにしてもサブクラスのインスタンスが生成できてしまう。
    private Utility(){
        throw new AssertionError();
    }
    public static void dummyUtilityMethod(){
        System.out.println("Utility method");
    }
}
