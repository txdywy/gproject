package com.google.android.finsky.da;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.safetynet.C5321b;
import com.google.android.gms.safetynet.C5571a;
import java.security.SecureRandom;

public final class C2500d implements C1632q, C1634r {
    public final C2495w f13449a;
    public final C5089p f13450b;
    public final C5321b f13451c = C5571a.f28492d;
    public final SecureRandom f13452d = new SecureRandom();
    public C5058o f13453e;

    public C2500d(Context context, C2495w c2495w) {
        this.f13449a = c2495w;
        this.f13450b = new C5089p(context).m23647a(C5571a.f28491c).m23650a((C1634r) this).m23649a((C1632q) this);
    }

    public final void mo2363a(Bundle bundle) {
        byte[] bArr = new byte[32];
        this.f13452d.nextBytes(bArr);
        this.f13451c.mo4816a(this.f13453e, bArr).mo4490a(new C2501e(this, Base64.encodeToString(bArr, 0).trim()));
    }

    public final void mo2362a(int i) {
        m13400b(2001);
        this.f13453e.mo4559g();
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        m13400b(2000);
        this.f13453e.mo4559g();
    }

    final void m13400b(int i) {
        FinskyLog.m21662b("Device verification failed with statusCode=%d", Integer.valueOf(i));
        this.f13449a.m13371a(new C2474c(541).m13254g(i).f13342a, null);
    }

    final void m13399a(boolean z) {
        FinskyLog.m21662b("Device verification finished, success=%s", Boolean.valueOf(z));
        C0954a.aI.m5763a(Boolean.valueOf(z));
        C0954a.aJ.m5763a((String) C0955b.iJ.m28964b());
        this.f13449a.m13371a(new C2474c(542).f13342a, null);
    }
}
