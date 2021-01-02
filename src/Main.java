import java.nio.file.Paths;

public class Main {
    static JNIHelloWorld jniHelloWorld = new JNIHelloWorld();;

    static {
        System.load(Paths.get("libnative.so").toAbsolutePath().toString());
    }

    public static void main(String[] args) {
        jniHelloWorld.printHelloWorld();
    }
}


