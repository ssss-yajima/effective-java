import java.util.Comparator;


public final class ComparatorConstruction implements Comparable<ComparatorConstruction>{
    int id;
    int phone;
    // コンパレータ構築メソッドを利用 Java8から
    int age;
    private static final Comparator<ComparatorConstruction> COMPARATOR =
            Comparator.comparingInt((ComparatorConstruction c) -> c.id)
                    .thenComparingInt(c -> c.phone)
                    .thenComparingInt(c -> c.age);

    public int compareTo(ComparatorConstruction c) {
        // 上記メソッドをstaticにしておくとメソッド名で直接呼べるので便利
        return COMPARATOR.compare(this, c);

    }
}
