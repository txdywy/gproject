package com.google.android.finsky.da;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4677h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.safetynet.C5321b;
import com.google.android.gms.safetynet.C5571a;
import java.security.SecureRandom;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class C2498a extends C0971t implements C1632q, C1634r {
    public C2495w B_;
    public Context f13441a;
    public C5058o f13442c;
    public C5321b f13443d;
    public C5089p f13444g;
    public SecureRandom f13445i;
    public CountDownLatch f13446j;

    protected final void mo1167a() {
        super.mo1167a();
        ((C1373c) C3947d.m18649a(C1373c.class)).mo1795a(this);
        this.f13444g = new C5089p(this.f13441a).m23647a(C5571a.f28491c).m23650a((C1634r) this).m23649a((C1632q) this);
        this.f13445i = new SecureRandom();
        if (this.f13443d == null) {
            this.f13443d = C5571a.f28492d;
        }
    }

    protected final void mo1170a(C1254c c1254c, C2495w c2495w) {
        bb.m21793b();
        this.B_ = c2495w;
        String str = (String) C0954a.aJ.m5760a();
        String str2 = (String) C0955b.iJ.m28964b();
        int i = ((Boolean) C0954a.aI.m5760a()) != null ? 1 : 0;
        if (i == 0 || !TextUtils.equals(str, str2)) {
            int i2;
            FinskyLog.m21662b("Device verification run, previous result %s, local='%s', remote='%s'", r0, str, str2);
            if (i != 0) {
                i2 = 552;
            } else {
                i2 = 551;
            }
            this.B_.m13371a(new C2474c(i2).f13342a, null);
            if (this.f13442c == null) {
                this.f13442c = this.f13444g.m23652b();
            }
            this.f13446j = new CountDownLatch(1);
            this.f13442c.mo4557e();
            try {
                if (!this.f13446j.await(((Long) C0955b.dg.m28964b()).longValue(), TimeUnit.SECONDS)) {
                    m13390a(2009, 0);
                    return;
                }
                return;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                FinskyLog.m21669e("Thread was interrupted", new Object[0]);
                m13390a(2010, 0);
                return;
            }
        }
        FinskyLog.m21662b("Device verification skipped, previous result %s, local='%s', remote='%s'", r0, str, str2);
    }

    public final void mo2363a(Bundle bundle) {
        byte[] bArr = new byte[32];
        this.f13445i.nextBytes(bArr);
        this.f13443d.mo4816a(this.f13442c, bArr).mo4490a(new C2499b(this, Base64.encodeToString(bArr, 0).trim()));
    }

    public final void mo2362a(int i) {
        m13390a(2001, i);
        this.f13442c.mo4559g();
        this.f13446j.countDown();
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        m13390a(2000, connectionResult.f25611c);
        this.f13442c.mo4559g();
        this.f13446j.countDown();
    }

    static String m13387a(String str) {
        String[] split = str.split("\\.");
        if (split.length == 3) {
            try {
                return new String(Base64.decode(split[1], 0), C4677h.f24059a);
            } catch (IllegalArgumentException e) {
                FinskyLog.m21669e("IllegalArgumentException - Failed to decode SafetyNet payload", new Object[0]);
            }
        }
        return null;
    }

    final void m13390a(int i, int i2) {
        FinskyLog.m21662b("Device verification failed with statusCode=%s, externalStatusCode=%s", Integer.valueOf(i), Integer.valueOf(i2));
        this.B_.m13371a(new C2474c(541).m13211a(i, i2).f13342a, null);
    }

    final void m13394b(int i) {
        boolean z = i == 0;
        C0954a.aI.m5763a(Boolean.valueOf(z));
        C0954a.aJ.m5763a((String) C0955b.iJ.m28964b());
        FinskyLog.m21662b("Device verification finished, success=%s", Boolean.valueOf(z));
        if (z) {
            this.B_.m13371a(new C2474c(542).m13254g(i).f13342a, null);
        } else {
            m13390a(i, 0);
        }
        this.f13446j.countDown();
    }
}
