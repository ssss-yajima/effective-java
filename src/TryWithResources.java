import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    private TryWithResources(){}

    static String firstLineOfFile(String path) throws IOException {
        // try-with-resources Java7から
        // 対象リソースのクラスがAutoCloseableを実装している必要がある。
        // 複数のリソースを開くこともできる。
        try (BufferedReader br = new BufferedReader(
                new FileReader(path)
        )) {
            return br.readLine();
        }
    }
    // 古い方法
    // finallyブロックも例外をスローでき、try内の例外を覆い隠す可能性がある。
    static String clasicFirstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try{
            return br.readLine();
        }finally{
            br.close();
        }
    }
}
