public class EnumMapTry {
    enum LifeCycle { ANNUAL, REPENNIAL, BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    EnumMapTry(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

}
