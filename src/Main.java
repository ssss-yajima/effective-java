public class Main {

    public static void main(String[] args) {
        // Utility
        Utility.dummyUtilityMethod();

        // EnumMethod
        for (EnumMethod e : EnumMethod.values()) {
            System.out.printf("%s's BMI :%f\n", e, e.bmi());
        }
    }
}
