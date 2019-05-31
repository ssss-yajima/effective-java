public class DependencyInjection {
    private final Resource resource;

    // 依存するリソースをコンストラクタに引数またはファクトリーで注入する。
    // リソースの変更が容易。
    public DependencyInjection(Resource resource) {
        this.resource = resource;
    }
    public void useResourceMethod(){
        System.out.println("Procedure depends on resource:" + resource);
    }
}
