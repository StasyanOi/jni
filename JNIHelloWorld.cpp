#include <iostream>
#include "JNIHelloWorld.h"

JNIEXPORT void JNICALL Java_JNIHelloWorld_printHelloWorld
  (JNIEnv *, jobject) {
    std::cout << "Hello from C++ !!" << std::endl;
}