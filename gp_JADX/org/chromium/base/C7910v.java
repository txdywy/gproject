package org.chromium.base;

final class C7910v implements Runnable {
    C7910v() {
    }

    public final void run() {
        throw new RuntimeException("Intentional exception not caught by JNI");
    }
}
