package com.google.android.finsky.p198f;

import android.content.Context;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p264x.C4806a;

public final class C3027b {
    public final Context f15838a;
    public final C3646a f15839b;
    public final C2206c f15840c;
    public final C1461c f15841d;
    public final C3028c f15842e;
    public final C4806a f15843f;

    public C3027b(Context context, C3646a c3646a, C2206c c2206c, C1461c c1461c, C3028c c3028c, C4806a c4806a) {
        this.f15838a = context;
        this.f15839b = c3646a;
        this.f15840c = c2206c;
        this.f15841d = c1461c;
        this.f15842e = c3028c;
        this.f15843f = c4806a;
    }

    public final C3026a m15626a(String str) {
        return new C3026a(this.f15838a, str, this.f15839b, this.f15840c, this.f15841d, this.f15842e, this.f15843f);
    }

    public final C3026a m15627b(String str) {
        this.f15839b.f18022b.m11209c();
        this.f15840c.mo2820c();
        return m15626a(str);
    }
}
