package com.google.android.finsky.instantapps.p218e;

import android.graphics.Bitmap;

final class C3458f implements Runnable {
    public final /* synthetic */ C3426j f17641a;
    public final /* synthetic */ String f17642b;
    public final /* synthetic */ C3454b f17643c;

    C3458f(C3454b c3454b, C3426j c3426j, String str) {
        this.f17643c = c3454b;
        this.f17641a = c3426j;
        this.f17642b = str;
    }

    public final void run() {
        this.f17641a.mo3525a(this.f17642b, (Bitmap) this.f17643c.f17631f.get(C3454b.m17013b(this.f17642b)));
    }
}
