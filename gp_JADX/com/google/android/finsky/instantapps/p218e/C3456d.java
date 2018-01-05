package com.google.android.finsky.instantapps.p218e;

import android.graphics.Bitmap;

final class C3456d implements Runnable {
    public final /* synthetic */ String f17635a;
    public final /* synthetic */ C3426j f17636b;
    public final /* synthetic */ C3454b f17637c;

    C3456d(C3454b c3454b, String str, C3426j c3426j) {
        this.f17637c = c3454b;
        this.f17635a = str;
        this.f17636b = c3426j;
    }

    public final void run() {
        String str = null;
        for (C3451h c3451h : this.f17637c.f17627b) {
            if (str != null) {
                break;
            }
            str = c3451h.mo3533b(this.f17635a);
        }
        if (str != null) {
            Bitmap a = this.f17637c.f17628c.m17019a(this.f17635a, str);
            if (a != null) {
                this.f17637c.f17631f.put(C3454b.m17013b(this.f17635a), a);
                this.f17637c.m17016b(this.f17635a, this.f17636b);
            }
        }
    }
}
