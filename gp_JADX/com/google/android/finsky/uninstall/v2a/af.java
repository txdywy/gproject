package com.google.android.finsky.uninstall.v2a;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.co.C2323a;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class af {
    public static af f23718b;
    public aj f23719a;
    public Map f23720c = Collections.emptyMap();
    public ArrayList f23721d = new ArrayList();
    public boolean f23722e = true;
    public final C1463g f23723f = C1473m.f7980a.az();
    public final C1503a f23724g = C1473m.f7980a.mo2036P();
    public final C1461c f23725h = C1473m.f7980a.aN();
    public final C2323a f23726i = C1473m.f7980a.by();

    protected af() {
    }

    public static synchronized af m21457a() {
        af afVar;
        synchronized (af.class) {
            if (f23718b == null) {
                f23718b = new af();
            }
            afVar = f23718b;
        }
        return afVar;
    }

    final void m21459a(int i) {
        this.f23723f.dc().m13319a(new C2474c(154).m13254g(i).f13342a, null);
    }

    final synchronized boolean m21462b() {
        boolean z = false;
        synchronized (this) {
            if (!this.f23724g.f8182f) {
                if (this.f23725h.dj().mo2294a(12603367)) {
                    if (this.f23726i.f11439i) {
                        z = this.f23722e;
                    } else {
                        this.f23723f.dc().m13319a(new C2474c(135).m13254g(1500).f13342a, null);
                    }
                }
            }
        }
        return z;
    }

    public final synchronized boolean m21461a(C2323a c2323a, String str, C2332j c2332j) {
        boolean z;
        if (c2323a.f11439i) {
            c2323a.m11892a(str, new ai(this, c2332j));
            z = true;
        } else {
            this.f23723f.dc().m13319a(new C2474c(135).m13254g(1500).f13342a, null);
            z = false;
        }
        return z;
    }

    final synchronized boolean m21463c() {
        return !this.f23720c.isEmpty();
    }

    final synchronized long m21458a(String str) {
        long currentTimeMillis;
        if (this.f23720c.containsKey(str)) {
            currentTimeMillis = System.currentTimeMillis() - ((Long) this.f23720c.get(str)).longValue();
        } else {
            currentTimeMillis = Long.MAX_VALUE;
        }
        return currentTimeMillis;
    }

    final synchronized void m21460a(ArrayList arrayList) {
        this.f23721d = arrayList;
    }

    final synchronized ArrayList m21464d() {
        return this.f23721d;
    }
}
