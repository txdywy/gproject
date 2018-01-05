package com.google.android.finsky.wear;

final class C4798s implements Runnable {
    public final /* synthetic */ int f25051a;
    public final /* synthetic */ C4797r f25052b;

    C4798s(C4797r c4797r, int i) {
        this.f25052b = c4797r;
        this.f25051a = i;
    }

    public final void run() {
        int i;
        switch (this.f25051a) {
            case 2:
                i = 940;
                break;
            case 3:
                i = 941;
                break;
            case 4:
                i = 942;
                break;
            case 5:
                i = 944;
                break;
            case 6:
                i = 945;
                break;
            default:
                i = 943;
                break;
        }
        this.f25052b.f25050b.m22567a(this.f25052b.f25049a, i);
    }
}
