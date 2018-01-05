package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

final class sl implements qn {
    sl() {
    }

    public final /* synthetic */ Object mo4857a(ud udVar) {
        return m25550d(udVar);
    }

    public final /* synthetic */ Object mo4858a(vk vkVar) {
        return m25548a((qf) vkVar);
    }

    public final /* synthetic */ vk mo4859b(ud udVar) {
        return m25551e(udVar);
    }

    public final /* synthetic */ vk mo4860b(vk vkVar) {
        return m25547a((qh) vkVar);
    }

    public final rd mo4861c(ud udVar) {
        return (rd) rd.m25449b().m25456a("type.googleapis.com/google.cloud.crypto.tink.HmacKey").m25455a(m25551e(udVar).mo4845e()).m25454a(rf.SYMMETRIC).m25317d();
    }

    private static qx m25550d(ud udVar) {
        try {
            return m25548a((qf) uu.m25289a(qf.f27354d, udVar));
        } catch (zzfxb e) {
            throw new GeneralSecurityException("invalid Hmac key");
        }
    }

    private static qx m25548a(qf qfVar) {
        tj.m25584b(qfVar.f27356a);
        if (qfVar.f27358c.mo4892a() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m25549a(qfVar.m25407a());
        pq a = qfVar.m25407a().m25416a();
        Key secretKeySpec = new SecretKeySpec(qfVar.f27358c.m25664c(), "HMAC");
        int i = qfVar.m25407a().f27366b;
        switch (sm.f27466a[a.ordinal()]) {
            case 1:
                return new th("HMACSHA1", secretKeySpec, i);
            case 2:
                return new th("HMACSHA256", secretKeySpec, i);
            case 3:
                return new th("HMACSHA512", secretKeySpec, i);
            default:
                throw new GeneralSecurityException("unknown hash");
        }
    }

    private static qf m25551e(ud udVar) {
        try {
            return m25547a((qh) uu.m25289a(qh.f27359c, udVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid Hmac key format", e);
        }
    }

    private static qf m25547a(qh qhVar) {
        if (qhVar.f27362b < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m25549a(qhVar.m25412a());
        uv b = qf.m25406b();
        b.m25315b();
        ((qf) b.b).f27356a = 0;
        qj a = qhVar.m25412a();
        b.m25315b();
        qf.m25404a((qf) b.b, a);
        return (qf) b.m25411a(ud.m25653a(ti.m25580a(qhVar.f27362b))).m25317d();
    }

    private static void m25549a(qj qjVar) {
        if (qjVar.f27366b < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch (sm.f27466a[qjVar.m25416a().ordinal()]) {
            case 1:
                if (qjVar.f27366b > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 2:
                if (qjVar.f27366b > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 3:
                if (qjVar.f27366b > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            default:
                throw new GeneralSecurityException("unknown hash type");
        }
    }
}
