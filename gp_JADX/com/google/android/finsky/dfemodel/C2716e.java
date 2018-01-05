package com.google.android.finsky.dfemodel;

import com.google.wireless.android.finsky.dfe.nano.cy;
import com.google.wireless.android.finsky.dfe.nano.cz;

final class C2716e implements Runnable {
    public final /* synthetic */ C2713b f14920a;

    C2716e(C2713b c2713b) {
        this.f14920a = c2713b;
    }

    public final void run() {
        C2713b c2713b = this.f14920a;
        if (c2713b.f14914c != null) {
            int size = c2713b.f14913a.size();
            if (size != 0) {
                cz czVar = new cz();
                czVar.a = (cy[]) c2713b.f14913a.toArray(new cy[0]);
                c2713b.f14913a.clear();
                c2713b.f14914c.mo1573a(czVar, new C2714c(size), new C2715d(size));
            }
        }
    }
}
