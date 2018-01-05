package com.google.android.finsky.p225k;

final class C3642c implements Runnable {
    public final String f18011a;
    public final /* synthetic */ C3640a f18012b;

    C3642c(C3640a c3640a, String str) {
        this.f18012b = c3640a;
        this.f18011a = str;
    }

    public final void run() {
        for (C3641b a : (C3641b[]) this.f18012b.f18007b.toArray(new C3641b[this.f18012b.f18007b.size()])) {
            a.mo4133a(this.f18011a);
        }
    }
}
