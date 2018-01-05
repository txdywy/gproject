package com.google.android.finsky.p111d;

import android.content.Context;
import com.google.android.finsky.ai.C1188a;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cg.C2278e;
import com.google.android.finsky.volley.C1470a;
import com.google.android.play.p179a.C6216a;
import com.google.wireless.android.a.a.a.a.ac;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

public final class C2492t {
    public boolean f13417a;
    public boolean f13418b;
    public final C1470a f13419c;
    public final C1461c f13420d;
    public final Context f13421e;

    public C2492t(C1470a c1470a, C1461c c1461c, Context context) {
        this.f13419c = c1470a;
        this.f13420d = c1461c;
        this.f13421e = context;
    }

    public final void m13355a() {
        if (this.f13420d.dj().mo2294a(12627947) && this.f13417a) {
            this.f13418b = true;
        }
    }

    public final C2495w m13350a(C2495w c2495w, int i) {
        return m13352a(c2495w, i, -1, null);
    }

    public final C2495w m13351a(C2495w c2495w, int i, int i2) {
        return m13352a(c2495w, i, i2, null);
    }

    public final C2495w m13352a(C2495w c2495w, int i, int i2, String str) {
        return m13347a(c2495w, i, i2, str, null, null);
    }

    public final C2495w m13353a(C2495w c2495w, int i, int i2, byte[] bArr, byte[] bArr2) {
        return m13347a(c2495w, i, i2, null, bArr, bArr2);
    }

    private final C2495w m13347a(C2495w c2495w, int i, int i2, String str, byte[] bArr, byte[] bArr2) {
        if (!m13357b()) {
            return c2495w;
        }
        bo boVar;
        C2474c c2474c = new C2474c(i);
        if (i2 != -1) {
            c2474c.m13250e(i2);
        }
        if (str != null) {
            c2474c.m13244b(str);
        }
        c2474c.m13252f(m13349d());
        if (!(bArr == null || bArr == null)) {
            boVar = c2474c.f13342a;
            if (bArr == null) {
                throw new NullPointerException();
            }
            boVar.f31701a |= 268435456;
            boVar.az = bArr;
        }
        if (!(bArr2 == null || bArr2 == null)) {
            boVar = c2474c.f13342a;
            if (bArr2 == null) {
                throw new NullPointerException();
            }
            boVar.f31701a |= 536870912;
            boVar.aA = bArr2;
        }
        if (this.f13420d.dj().mo2294a(12627544)) {
            ac acVar = new ac();
            acVar.a(((Integer) C1189b.f7268d.m5760a()).intValue());
            acVar.a(((Long) C1189b.f7274j.m5760a()).longValue());
            if (this.f13419c.dl() != null) {
                acVar.a(C1188a.m7140a(this.f13419c.dl()));
            }
            c2474c.m13215a(acVar);
        }
        return c2495w.m13371a(c2474c.f13342a, null);
    }

    public final boolean m13357b() {
        return (this.f13420d.dj().mo2294a(12626588) || this.f13418b) ? false : true;
    }

    public final C2495w m13354a(C2495w c2495w, String str) {
        return c2495w.m13367a(m13348c().m13244b(str));
    }

    public final C2495w m13356b(C2495w c2495w, String str) {
        C2474c c = m13348c();
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_started");
        return c2495w.m13371a(c.m13244b(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).f13342a, null);
    }

    public final C2495w m13358c(C2495w c2495w, String str) {
        C2474c c = m13348c();
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_finished");
        return c2495w.m13371a(c.m13244b(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).f13342a, null);
    }

    private final C2474c m13348c() {
        return new C2474c(640).m13252f(m13349d());
    }

    private final int m13349d() {
        return C6216a.m28694a(C2278e.m11746a(this.f13421e));
    }
}
