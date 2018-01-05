package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class sc implements qn {
    sc() {
    }

    private static pf m25520e(ud udVar) {
        try {
            return m25518a(ph.m25367a(udVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid AesGcm key format", e);
        }
    }

    public final /* synthetic */ Object mo4857a(ud udVar) {
        return m25519d(udVar);
    }

    public final /* synthetic */ vk mo4859b(ud udVar) {
        return m25520e(udVar);
    }

    public final /* synthetic */ vk mo4860b(vk vkVar) {
        return m25518a((ph) vkVar);
    }

    public final rd mo4861c(ud udVar) {
        return (rd) rd.m25449b().m25456a("type.googleapis.com/google.cloud.crypto.tink.AesGcmKey").m25455a(m25520e(udVar).mo4845e()).m25454a(rf.SYMMETRIC).m25317d();
    }

    private static oh m25519d(ud udVar) {
        try {
            return new sq(((pf) uu.m25289a(pf.f27296d, udVar)).f27300c.m25664c());
        } catch (zzfxb e) {
            throw new GeneralSecurityException("invalid AesGcm key");
        }
    }

    private static pf m25518a(ph phVar) {
        pj pjVar;
        tj.m25581a(phVar.f27304b);
        uv a = pf.m25359a().m25366a(ud.m25653a(ti.m25580a(phVar.f27304b)));
        if (phVar.f27303a == null) {
            pjVar = pj.f27305a;
        } else {
            pjVar = phVar.f27303a;
        }
        a.m25315b();
        pf.m25361a((pf) a.b, pjVar);
        a.m25315b();
        ((pf) a.b).f27298a = 0;
        return (pf) a.m25317d();
    }

    public final /* synthetic */ Object mo4858a(vk vkVar) {
        pf pfVar = (pf) vkVar;
        tj.m25584b(pfVar.f27298a);
        tj.m25581a(pfVar.f27300c.mo4892a());
        return new sq(pfVar.f27300c.m25664c());
    }
}
