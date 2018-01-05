package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class sa implements qn {
    sa() {
    }

    public final /* synthetic */ Object mo4857a(ud udVar) {
        return m25502d(udVar);
    }

    public final /* synthetic */ Object mo4858a(vk vkVar) {
        return m25500a((op) vkVar);
    }

    public final /* synthetic */ vk mo4859b(ud udVar) {
        return m25503e(udVar);
    }

    public final /* synthetic */ vk mo4860b(vk vkVar) {
        return m25499a((or) vkVar);
    }

    public final rd mo4861c(ud udVar) {
        return (rd) rd.m25449b().m25456a("type.googleapis.com/google.cloud.crypto.tink.AesCtrKey").m25455a(m25503e(udVar).mo4845e()).m25454a(rf.SYMMETRIC).m25317d();
    }

    private static so m25502d(ud udVar) {
        try {
            return m25500a((op) uu.m25289a(op.f27270d, udVar));
        } catch (zzfxb e) {
            throw new GeneralSecurityException("invalid AesCtr Key");
        }
    }

    private static so m25500a(op opVar) {
        tj.m25584b(opVar.f27272a);
        tj.m25581a(opVar.f27274c.mo4892a());
        m25501a(opVar.m25333a());
        return new so(opVar.f27274c.m25664c(), opVar.m25333a().f27281a);
    }

    private static op m25503e(ud udVar) {
        try {
            return m25499a((or) uu.m25289a(or.f27275c, udVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid AesCtr key format", e);
        }
    }

    private static op m25499a(or orVar) {
        tj.m25581a(orVar.f27278b);
        m25501a(orVar.m25338a());
        uv b = op.m25332b();
        ot a = orVar.m25338a();
        b.m25315b();
        op.m25330a((op) b.b, a);
        b = b.m25337a(ud.m25653a(ti.m25580a(orVar.f27278b)));
        b.m25315b();
        ((op) b.b).f27272a = 0;
        return (op) b.m25317d();
    }

    private static void m25501a(ot otVar) {
        if (otVar.f27281a < 12 || otVar.f27281a > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
