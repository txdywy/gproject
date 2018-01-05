package com.google.android.finsky.wear;

import com.google.android.finsky.p107l.C3648c;

final /* synthetic */ class as implements Runnable {
    public final ar f24831a;
    public final C3648c f24832b;
    public final String f24833c;
    public final int f24834d;
    public final String f24835e;
    public final cc f24836f;

    as(ar arVar, C3648c c3648c, String str, int i, String str2, cc ccVar) {
        this.f24831a = arVar;
        this.f24832b = c3648c;
        this.f24833c = str;
        this.f24834d = i;
        this.f24835e = str2;
        this.f24836f = ccVar;
    }

    public final void run() {
        this.f24832b.m17254a(new au(this.f24831a, this.f24833c, this.f24834d, this.f24835e, this.f24836f));
    }
}
