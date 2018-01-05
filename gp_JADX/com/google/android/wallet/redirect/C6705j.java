package com.google.android.wallet.redirect;

import com.google.a.a.a.a.b.a.a.h.a.c;

final class C6705j implements Runnable {
    public final /* synthetic */ int f33071a;
    public final /* synthetic */ C6677m f33072b;
    public final /* synthetic */ String f33073c;
    public final /* synthetic */ C6699e f33074d;
    public final /* synthetic */ c f33075e;

    C6705j(int i, C6677m c6677m, String str, C6699e c6699e, c cVar) {
        this.f33071a = i;
        this.f33072b = c6677m;
        this.f33073c = str;
        this.f33074d = c6699e;
        this.f33075e = cVar;
    }

    public final void run() {
        switch (this.f33071a) {
            case 1:
                this.f33072b.mo5596b(this.f33073c, this.f33074d);
                return;
            case 2:
                this.f33072b.mo5594a(this.f33073c, this.f33074d);
                return;
            case 3:
                this.f33072b.mo5595b();
                return;
            case 4:
                this.f33072b.mo5593a(this.f33075e, this.f33073c);
                return;
            default:
                throw new IllegalArgumentException("Unknown interception type: " + this.f33071a);
        }
    }
}
