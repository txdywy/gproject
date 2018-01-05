package com.google.android.finsky.instantapps.install;

import com.google.android.instantapps.common.p221d.p222a.af;
import java.util.concurrent.Callable;

final /* synthetic */ class C3519v implements Callable {
    public final C3518u f17760a;
    public final C3503c f17761b;
    public final af f17762c;

    C3519v(C3518u c3518u, C3503c c3503c, af afVar) {
        this.f17760a = c3518u;
        this.f17761b = c3503c;
        this.f17762c = afVar;
    }

    public final Object call() {
        C3518u c3518u = this.f17760a;
        C3503c c3503c = this.f17761b;
        return new ag(c3518u.f17759e.f17753b.m17066a(c3503c.f17726b), this.f17762c);
    }
}
