package com.google.android.finsky.stream.myapps;

import android.app.Application;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.p107l.C3646a;

public final class aa {
    public Application f23211a;
    public C1461c f23212b;
    public C2206c f23213c;
    public C2906h f23214d;
    public C3646a f23215e;

    public aa(Application application, C1461c c1461c, C2206c c2206c, C2906h c2906h, C3646a c3646a) {
        this.f23211a = application;
        this.f23212b = c1461c;
        this.f23213c = c2206c;
        this.f23214d = c2906h;
        this.f23215e = c3646a;
    }

    public final C4552s m21141a(String str) {
        return C4552s.m21168a(str, this.f23211a, this.f23212b, this.f23213c, this.f23214d, this.f23215e);
    }
}
