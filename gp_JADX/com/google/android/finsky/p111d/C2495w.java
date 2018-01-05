package com.google.android.finsky.p111d;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.p179a.p352a.ao;
import com.google.protobuf.nano.j;
import com.google.wireless.android.a.a.a.a.bp;
import com.google.wireless.android.a.a.a.a.br;
import com.google.wireless.android.a.a.a.a.bu;
import com.google.wireless.android.a.a.a.a.by;
import com.google.wireless.android.a.a.a.a.cb;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

public final class C2495w {
    public long f13431a;
    public final String f13432b;
    public final boolean f13433c;
    public final String f13434d;
    public C1463g f13435e;

    public C2495w(long j, String str, boolean z, String str2, C1463g c1463g) {
        String str3 = null;
        this.f13431a = j;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f13432b = str;
        this.f13433c = z;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str2;
        }
        this.f13434d = str3;
        this.f13435e = c1463g;
    }

    public static C2495w m13363a(String str, C1463g c1463g) {
        return new C2495w(-1, str, true, null, c1463g);
    }

    public final C2495w m13365a() {
        return new C2495w(m13378b(), this.f13432b, this.f13433c, this.f13434d, this.f13435e);
    }

    public final C2495w m13375a(String str) {
        return new C2495w(m13378b(), str, this.f13433c, this.f13434d, this.f13435e);
    }

    public final C2495w m13366a(Account account) {
        return new C2495w(m13378b(), this.f13432b, false, account == null ? null : account.name, this.f13435e);
    }

    public final C2495w m13380b(String str) {
        return new C2495w(m13378b(), this.f13432b, false, str, this.f13435e);
    }

    public final synchronized long m13378b() {
        return this.f13431a;
    }

    @Deprecated
    private final synchronized void m13364a(long j) {
        this.f13431a = j;
    }

    public final void m13377a(Bundle bundle) {
        bundle.putLong("com.google.android.finsky.analytics.LoggingContext.KEY_LAST_EVENT_ID", this.f13431a);
        if (this.f13432b != null) {
            bundle.putString("com.google.android.finsky.analytics.LoggingContext.KEY_REASON", this.f13432b);
        }
        bundle.putString("com.google.android.finsky.analytics.LoggingContext.KEY_ACCOUNT", this.f13434d);
        bundle.putString("com.google.android.finsky.analytics.LoggingContext.KEY_USE_DEFAULT_LOGGER", String.valueOf(this.f13433c));
    }

    public final void m13376a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        m13377a(extras);
        intent.putExtras(extras);
    }

    static C2495w m13361a(Bundle bundle, C2495w c2495w, C1463g c1463g) {
        if (bundle == null) {
            FinskyLog.m21665c("Null bundle, which breaks event chain!. Creating a new logging context.", new Object[0]);
            return c2495w;
        } else if (bundle.containsKey("com.google.android.finsky.analytics.LoggingContext.KEY_LAST_EVENT_ID")) {
            return new C2495w(bundle.getLong("com.google.android.finsky.analytics.LoggingContext.KEY_LAST_EVENT_ID", -1), bundle.getString("com.google.android.finsky.analytics.LoggingContext.KEY_REASON"), Boolean.parseBoolean(bundle.getString("com.google.android.finsky.analytics.LoggingContext.KEY_USE_DEFAULT_LOGGER")), bundle.getString("com.google.android.finsky.analytics.LoggingContext.KEY_ACCOUNT"), c1463g);
        } else {
            FinskyLog.m21665c("No LoggingContext in the bundle, which breaks event chain!. Creating a new logging context.", new Object[0]);
            return c2495w;
        }
    }

    static C2495w m13360a(Bundle bundle, Intent intent, C2495w c2495w, C1463g c1463g) {
        if (bundle != null) {
            return C2495w.m13361a(bundle, c2495w, c1463g);
        }
        if (intent == null) {
            return c2495w;
        }
        return C2495w.m13361a(intent.getExtras(), c2495w, c1463g);
    }

    public final C2470a m13381c() {
        C2470a c2470a = new C2470a();
        long j = this.f13431a;
        c2470a.f13306b |= 1;
        c2470a.f13307c = j;
        if (this.f13432b != null) {
            c2470a.m13172a(this.f13432b);
        }
        if (this.f13434d != null) {
            c2470a.m13177b(this.f13434d);
        }
        c2470a.m13173a(this.f13433c);
        return c2470a;
    }

    public final C2495w m13371a(bo boVar, ao aoVar) {
        if (!(boVar.m29002e() || !TextUtils.isEmpty(boVar.f31704d) || TextUtils.isEmpty(this.f13432b))) {
            boVar.m28999b(this.f13432b);
        }
        C2482j d = m13382d();
        synchronized (this) {
            m13364a(d.m13320a(boVar, aoVar, m13378b()));
        }
        return this;
    }

    public final C2495w m13367a(C2474c c2474c) {
        return m13371a(c2474c.f13342a, null);
    }

    public final C2495w m13369a(C2476e c2476e) {
        br brVar = c2476e.f13346a;
        C2482j d = m13382d();
        synchronized (this) {
            m13364a(d.m13322a(brVar, m13378b()));
        }
        return this;
    }

    public final C2495w m13373a(bu buVar, ao aoVar) {
        C2482j d = m13382d();
        synchronized (this) {
            m13364a(d.m13323a(buVar, aoVar, m13378b()));
        }
        return this;
    }

    public final C2495w m13370a(C2488p c2488p) {
        return m13373a(c2488p.m13344a(), null);
    }

    public final C2495w m13368a(C2475d c2475d) {
        if (c2475d.m13260b()) {
            return this;
        }
        return m13362a(c2475d.f13344b, c2475d.m13259a(), true);
    }

    public final C2495w m13379b(C2475d c2475d) {
        if (c2475d.m13260b()) {
            return this;
        }
        return m13362a(c2475d.f13344b, c2475d.m13259a(), false);
    }

    public final C2495w m13372a(bp bpVar, ao aoVar) {
        C2482j d = m13382d();
        synchronized (this) {
            m13364a(d.m13321a(bpVar, aoVar, m13378b()));
        }
        return this;
    }

    private final C2495w m13362a(ad adVar, bp bpVar, boolean z) {
        if (adVar != null) {
            C2482j.m13302b(adVar);
        }
        if (z) {
            return m13365a().m13372a(bpVar, null);
        }
        return m13372a(bpVar, null);
    }

    public final C2495w m13374a(cb cbVar) {
        C2482j d = m13382d();
        synchronized (this) {
            long b = m13378b();
            if (C2482j.m13307c() && C2482j.m13307c()) {
                FinskyLog.m21659a("Sending search event query=%s queryUrl=%s", cbVar.b, cbVar.c);
            }
            by b2 = d.f13385f.m13272b();
            b2.k = cbVar;
            if (b > 0) {
                b2.a(b);
            }
            m13364a(d.m13317a(5, b2, null));
        }
        return this;
    }

    public final String toString() {
        String a = j.a(m13381c());
        return new StringBuilder(String.valueOf(a).length() + 2).append("<").append(a).append(">").toString();
    }

    public final C2482j m13382d() {
        if (this.f13433c) {
            return this.f13435e.dc();
        }
        return this.f13435e.mo2242f(this.f13434d);
    }
}
