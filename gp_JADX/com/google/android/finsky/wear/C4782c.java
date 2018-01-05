package com.google.android.finsky.wear;

final class C4782c implements Runnable {
    public int f24922a;
    public final /* synthetic */ Runnable f24923b;

    C4782c(Runnable runnable) {
        this.f24923b = runnable;
    }

    public final void run() {
        this.f24922a++;
        if (this.f24922a == 2) {
            this.f24923b.run();
        }
    }
}
