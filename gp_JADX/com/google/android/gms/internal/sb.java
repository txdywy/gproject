package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class sb implements qn {
    sb() {
    }

    public final /* synthetic */ Object mo4857a(ud udVar) {
        return m25511d(udVar);
    }

    public final /* synthetic */ vk mo4859b(ud udVar) {
        return m25512e(udVar);
    }

    public final /* synthetic */ vk mo4860b(vk vkVar) {
        return m25510a((oz) vkVar);
    }

    public final rd mo4861c(ud udVar) {
        return (rd) rd.m25449b().m25456a("type.googleapis.com/google.cloud.crypto.tink.AesEaxKey").m25455a(m25512e(udVar).mo4845e()).m25454a(rf.SYMMETRIC).m25317d();
    }

    private static oh m25511d(ud udVar) {
        try {
            return m25509a((ox) uu.m25289a(ox.f27283d, udVar));
        } catch (zzfxb e) {
            throw new GeneralSecurityException("invalid AesEax key");
        }
    }

    private static oh m25509a(ox oxVar) {
        tj.m25584b(oxVar.f27285a);
        tj.m25581a(oxVar.f27287c.mo4892a());
        if (oxVar.m25348a().f27294a == 12 || oxVar.m25348a().f27294a == 16) {
            return new sp(oxVar.f27287c.m25664c(), oxVar.m25348a().f27294a);
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    private static ox m25512e(ud udVar) {
        try {
            return m25510a((oz) uu.m25289a(oz.f27288c, udVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid AesEax key format", e);
        }
    }

    private static ox m25510a(oz ozVar) {
        tj.m25581a(ozVar.f27291b);
        if (ozVar.m25352a().f27294a == 12 || ozVar.m25352a().f27294a == 16) {
            uu uuVar = ox.f27283d;
            uv uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
            uvVar.m25314a(uuVar);
            oy oyVar = (oy) uvVar;
            ud a = ud.m25653a(ti.m25580a(ozVar.f27291b));
            oyVar.m25315b();
            ox.m25347a((ox) oyVar.b, a);
            pb a2 = ozVar.m25352a();
            oyVar.m25315b();
            ox.m25346a((ox) oyVar.b, a2);
            oyVar.m25315b();
            ((ox) oyVar.b).f27285a = 0;
            return (ox) oyVar.m25317d();
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
}
