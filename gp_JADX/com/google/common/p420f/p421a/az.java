package com.google.common.p420f.p421a;

final class az implements Runnable {
    public final /* synthetic */ Runnable f34403a;
    public final /* synthetic */ ay f34404b;

    az(ay ayVar, Runnable runnable) {
        this.f34404b = ayVar;
        this.f34403a = runnable;
    }

    public final void run() {
        this.f34404b.f34400a = false;
        this.f34403a.run();
    }
}
