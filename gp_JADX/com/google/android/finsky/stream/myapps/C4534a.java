package com.google.android.finsky.stream.myapps;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.finsky.cv.p177a.C2442o;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import java.util.HashSet;
import java.util.Set;

final class C4534a implements C0983h, ad {
    public final PackageManager f23204a;
    public final C3851f f23205b;
    public final ax[] f23206c;
    public final ax[] f23207d;
    public final Set f23208e = new HashSet();
    public C4549n f23209f;
    public boolean f23210g;

    C4534a(C2442o c2442o, PackageManager packageManager, C3851f c3851f) {
        int i = 0;
        this.f23206c = c2442o.f13187a;
        this.f23207d = c2442o.f13188b;
        for (ax axVar : this.f23206c) {
            this.f23208e.add(axVar.f11833b);
        }
        ax[] axVarArr = this.f23207d;
        int length = axVarArr.length;
        while (i < length) {
            this.f23208e.add(axVarArr[i].f11833b);
            i++;
        }
        this.f23204a = packageManager;
        this.f23205b = c3851f;
        this.f23205b.mo3818a((C0983h) this);
        this.f23210g = m21132c();
    }

    private final boolean m21132c() {
        for (ax a : this.f23206c) {
            if (!m21130a(a)) {
                return false;
            }
        }
        for (ax a2 : this.f23207d) {
            if (m21130a(a2)) {
                return false;
            }
        }
        return true;
    }

    private final boolean m21130a(ax axVar) {
        try {
            if (this.f23204a.getApplicationInfo(axVar.f11833b, 0).enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public final void mo4258a(C4549n c4549n) {
        this.f23209f = c4549n;
    }

    public final boolean mo4259a() {
        return this.f23210g;
    }

    public final void mo4260b() {
        this.f23205b.mo3819b(this);
    }

    public final void mo1175b(String str, boolean z) {
        m21131a(str);
    }

    public final void mo1176c(String str, boolean z) {
        m21131a(str);
    }

    public final void mo1174a(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length && !m21131a(strArr[i])) {
            i++;
        }
    }

    public final void mo1178e(String str) {
    }

    public final void mo1177d(String str) {
    }

    private final boolean m21131a(String str) {
        if (!this.f23208e.contains(str)) {
            return false;
        }
        this.f23210g = m21132c();
        if (this.f23209f != null) {
            this.f23209f.m21163a();
        }
        return true;
    }
}
