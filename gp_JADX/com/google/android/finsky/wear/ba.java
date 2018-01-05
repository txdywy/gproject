package com.google.android.finsky.wear;

final class ba implements Runnable {
    public int f24859a = 0;
    public final /* synthetic */ String[] f24860b;
    public final /* synthetic */ az f24861c;

    ba(az azVar, String[] strArr) {
        this.f24861c = azVar;
        this.f24860b = strArr;
    }

    public final void run() {
        this.f24859a++;
        if (this.f24859a == 2) {
            this.f24861c.f24853d.f24823g.m22456a(new bb(this), this.f24861c.f24850a, this.f24861c.f24852c, this.f24861c.f24851b);
        }
    }
}
