public class Main {
    static JNIHelloWorld jniHelloWorld = new JNIHelloWorld();

    static {
        System.load("/home/stanislav/IdeaProjects/java/libnative.so");
    }

    public static void main(String[] args) {
        jniHelloWorld.printHelloWorld();
    }
}


