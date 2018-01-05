package com.google.android.finsky.ca;

import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.foregroundcoordinator.C3138b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.dd;
import com.google.wireless.android.finsky.dfe.nano.dj;

public final class C2251c {
    public final C2206c f11178a;
    public final C3646a f11179b;
    public final C1287h f11180c;
    public final C2127b f11181d;
    public final C2249a f11182e;
    public final ForegroundCoordinator f11183f;
    public final C1461c f11184g;
    public final C1463g f11185h;
    public C3138b f11186i;

    public C2251c(C2206c c2206c, C3646a c3646a, C1287h c1287h, C2127b c2127b, C2249a c2249a, ForegroundCoordinator foregroundCoordinator, C1461c c1461c, C1463g c1463g) {
        this.f11178a = (C2206c) aj.m21700a(c2206c);
        this.f11179b = (C3646a) aj.m21700a(c3646a);
        this.f11180c = (C1287h) aj.m21700a(c1287h);
        this.f11181d = (C2127b) aj.m21700a(c2127b);
        this.f11182e = (C2249a) aj.m21700a(c2249a);
        this.f11183f = (ForegroundCoordinator) aj.m21700a(foregroundCoordinator);
        this.f11184g = (C1461c) aj.m21700a(c1461c);
        this.f11185h = (C1463g) aj.m21700a(c1463g);
    }

    public final void m11686a(dj[] djVarArr, String str, Runnable runnable) {
        aj.m21700a(djVarArr);
        aj.m21700a(str);
        if (this.f11184g.mo2249j(str).mo2294a(12609726)) {
            m11687b(djVarArr, str, runnable);
        } else if (this.f11183f.m16017a()) {
            this.f11186i = this.f11183f.m16016a(2, this.f11184g.mo2249j(str), new C2253e(this, djVarArr, str, runnable));
        } else {
            m11687b(djVarArr, str, runnable);
        }
    }

    final void m11687b(dj[] djVarArr, String str, Runnable runnable) {
        aj.m21700a(djVarArr);
        aj.m21700a(str);
        if (djVarArr.length != 0) {
            dd ddVar = new dd();
            ddVar.a = djVarArr;
            this.f11180c.mo2016a(str).mo1574a(ddVar, new C2254f(this, str, runnable), new C2255g(this, str, runnable));
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final dj m11684a(String str, String str2) {
        int i = -1;
        aj.m21700a(str);
        aj.m21700a(str2);
        C3647b a = this.f11179b.m17243a(str);
        if (a == null) {
            m11685a(str2, 1304, null, 6, null, str);
            return null;
        }
        int i2;
        dj djVar = new dj();
        djVar.a(str);
        if (a.f18029d != null) {
            i2 = a.f18029d.f10809c;
        } else {
            i2 = -1;
        }
        if (a.f18028c != null) {
            i = a.f18028c.f11419d;
        }
        if (i2 <= i) {
            i2 = i;
        }
        if (i2 > 0) {
            djVar.a(i2);
        }
        C2129c a2 = this.f11181d.mo2657a(str);
        if (a2 == null) {
            m11685a(str2, 1304, null, 7, null, str);
        } else {
            byte[] bArr = a2.f10830x;
            if (bArr != null) {
                if (bArr == null) {
                    throw new NullPointerException();
                }
                djVar.b |= 4;
                djVar.e = bArr;
            }
        }
        return djVar;
    }

    public final void m11685a(String str, int i, String str2, int i2, Exception exception, String str3) {
        this.f11185h.mo2242f(str).m13319a(new C2474c(i).m13244b(str2).m13238a((Throwable) exception).m13210a(i2).m13236a(str3).f13342a, null);
    }
}
