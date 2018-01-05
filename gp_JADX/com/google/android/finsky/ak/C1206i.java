package com.google.android.finsky.ak;

import java.util.concurrent.Callable;

final class C1206i implements Callable {
    public final /* synthetic */ C1215q f7325a;
    public final /* synthetic */ String f7326b;
    public final /* synthetic */ String f7327c;
    public final /* synthetic */ C1205h f7328d;

    C1206i(C1205h c1205h, C1215q c1215q, String str, String str2) {
        this.f7328d = c1205h;
        this.f7325a = c1215q;
        this.f7326b = str;
        this.f7327c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f7328d.m7176b(this.f7325a, this.f7326b, this.f7327c);
    }
}
