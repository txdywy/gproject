package com.google.android.finsky.ia2;

import com.google.wireless.android.finsky.dfe.nano.z;

public final class C3242v implements Runnable {
    public final /* synthetic */ z[] f16726a;
    public final /* synthetic */ int f16727b;
    public final /* synthetic */ int f16728c;
    public final /* synthetic */ C1072x f16729d;
    public final /* synthetic */ int f16730e;
    public final /* synthetic */ Ia2SubNavView f16731f;

    public C3242v(Ia2SubNavView ia2SubNavView, z[] zVarArr, int i, int i2, C1072x c1072x, int i3) {
        this.f16731f = ia2SubNavView;
        this.f16726a = zVarArr;
        this.f16727b = i;
        this.f16728c = i2;
        this.f16729d = c1072x;
        this.f16730e = i3;
    }

    public final void run() {
        this.f16731f.m16274a(this.f16726a, this.f16727b, this.f16728c, this.f16729d, this.f16730e);
        this.f16731f.f16561a.startAnimation(this.f16731f.f16569i);
    }
}
