package com.google.android.finsky.externalreferrer;

import android.content.Context;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.utils.FinskyLog;

public final class C3025s implements C0983h {
    public final Context f15807a;
    public final C3009a f15808b;
    public final C2127b f15809c;
    public final C1463g f15810d;
    public final C1461c f15811e;
    public final C3011c f15812f;

    public C3025s(Context context, C3009a c3009a, C3011c c3011c, C2127b c2127b, C1463g c1463g, C1461c c1461c) {
        this.f15807a = context;
        this.f15808b = c3009a;
        this.f15809c = c2127b;
        this.f15810d = c1463g;
        this.f15811e = c1461c;
        this.f15812f = c3011c;
    }

    public final void mo1175b(String str, boolean z) {
        if (this.f15811e.dj().mo2294a(12643392)) {
            m15612a(567, str);
            this.f15808b.m15587a(str, true);
            return;
        }
        ExternalReferrerService.m15582a(this.f15807a, str, true);
    }

    public final void mo1176c(String str, boolean z) {
        if (this.f15811e.dj().mo2294a(12640411) && !z) {
            this.f15812f.m15590a(str, this.f15809c);
        }
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
        FinskyLog.m21659a("Package first launch for %s", str);
        if (this.f15811e.dj().mo2294a(12643392)) {
            m15612a(568, str);
            this.f15808b.m15587a(str, false);
            return;
        }
        ExternalReferrerService.m15582a(this.f15807a, str, false);
    }

    private final void m15612a(int i, String str) {
        this.f15810d.dc().m13319a(new C2474c(i).m13236a(str).f13342a, null);
    }
}
