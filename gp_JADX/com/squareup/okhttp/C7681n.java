package com.squareup.okhttp;

final class C7681n implements Runnable {
    public final /* synthetic */ C7680m f39775a;

    C7681n(C7680m c7680m) {
        this.f39775a = c7680m;
    }

    public final void run() {
        while (true) {
            long a = this.f39775a.m36998a(System.nanoTime());
            if (a != -1) {
                if (a > 0) {
                    long j = a / 1000000;
                    a -= j * 1000000;
                    synchronized (this.f39775a) {
                        try {
                            this.f39775a.wait(j, (int) a);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }
}
