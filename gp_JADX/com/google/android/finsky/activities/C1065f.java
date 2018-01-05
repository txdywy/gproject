package com.google.android.finsky.activities;

final class C1065f implements Runnable {
    public int f6777a = 0;
    public final /* synthetic */ boolean f6778b;
    public final /* synthetic */ C1036b f6779c;

    C1065f(C1036b c1036b, boolean z) {
        this.f6779c = c1036b;
        this.f6778b = z;
    }

    public final void run() {
        this.f6777a++;
        if (this.f6777a == 2) {
            this.f6779c.m6063c(this.f6778b);
        }
    }
}
