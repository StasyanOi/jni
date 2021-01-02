javac -h . JNIHelloWorld.java
g++ -c -fPIC -I"$JAVA_HOME"/include -I"$JAVA_HOME"/include/linux JNIHelloWorld.cpp -o JNIHelloWorld.o
g++ -shared -fPIC -o libnative.so JNIHelloWorld.o -lc