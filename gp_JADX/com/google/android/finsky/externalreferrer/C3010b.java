package com.google.android.finsky.externalreferrer;

final class C3010b implements Runnable {
    public int f15767a;
    public final /* synthetic */ String f15768b;
    public final /* synthetic */ boolean f15769c;
    public final /* synthetic */ C3009a f15770d;

    C3010b(C3009a c3009a, String str, boolean z) {
        this.f15770d = c3009a;
        this.f15768b = str;
        this.f15769c = z;
    }

    public final void run() {
        synchronized (this) {
            this.f15767a++;
        }
        if (this.f15767a == 2) {
            ((C3012d) this.f15770d.f15764a.mo1a()).m15598a(this.f15768b, this.f15769c);
        }
    }
}
