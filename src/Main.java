import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Utility
        Utility.dummyUtilityMethod();

        // EnumMethod
        for (EnumMethod e : EnumMethod.values()) {
            System.out.printf("%s's BMI :%f\n", e, e.bmi());
        }

        // EnumMap
        List<EnumMapTry> garden = null; // 書籍ではPlantのリストを持つgardenが対象
        Map<EnumMapTry.LifeCycle, Set<EnumMapTry>> plantsByLifeCycle =
                new EnumMap<>(EnumMapTry.LifeCycle.class);
        // LifeCycleをキーとするEnumMap
        for (EnumMapTry.LifeCycle lc : EnumMapTry.LifeCycle.values()) {
            plantsByLifeCycle.put(lc, new HashSet<>());
        }
        // LifeCycleごとに庭の植物を収集
        for (EnumMapTry p : garden) {
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }
        // Stream
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bBb");
        list.add("ccC");
        List<String> ans = list.stream()
                                .map(String::toUpperCase)
                                .filter(s -> s.startsWith("A"))
                                .collect(Collectors.toList());
        for (String s : ans) {
            System.out.println(s);
        }
        // stream でprintするイケてる方法？

    }
}
