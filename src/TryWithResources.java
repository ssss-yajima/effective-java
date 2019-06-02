import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Javadoc書いてみる
/**
 * @author hogetaro
 * @version 1.00
 * @since 1.00
 */
public class TryWithResources {
    private TryWithResources(){}

    /**
     * 概要説明：Javadoc1行目
     *
     * 詳細説明：2行目以降。
     * コードブロック{@code String s = "hoge"}
     * @param path 読み込むファイルのフルパス
     * @return 読み込んだファイルの1行目を返す
     * @throws IOException
     */
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
