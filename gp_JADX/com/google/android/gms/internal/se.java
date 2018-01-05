package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class se implements qn {
    se() {
    }

    public final /* synthetic */ Object mo4857a(ud udVar) {
        return m25529d(udVar);
    }

    public final /* synthetic */ vk mo4859b(ud udVar) {
        return m25530e(udVar);
    }

    public final /* synthetic */ vk mo4860b(vk vkVar) {
        return m25528a((qs) vkVar);
    }

    public final rd mo4861c(ud udVar) {
        return (rd) rd.m25449b().m25456a("type.googleapis.com/google.cloud.crypto.tink.KmsEnvelopeAeadKey").m25455a(m25530e(udVar).mo4845e()).m25454a(rf.REMOTE).m25317d();
    }

    private static oh m25529d(ud udVar) {
        try {
            return m25527a((qq) uu.m25289a(qq.f27369c, udVar));
        } catch (zzfxb e) {
            throw new GeneralSecurityException("invalid KMSEnvelopeAead key");
        }
    }

    private static oh m25527a(qq qqVar) {
        rd rdVar;
        rg rgVar;
        tj.m25584b(qqVar.f27371a);
        rb rbVar = rb.f27387a;
        qu a = qqVar.m25428a();
        if (a.f27378a == null) {
            rdVar = rd.f27389d;
        } else {
            rdVar = a.f27378a;
        }
        oh ohVar = (oh) rbVar.m25443a(rdVar.f27391a, rdVar.f27392b);
        qu a2 = qqVar.m25428a();
        if (a2.f27379b == null) {
            rgVar = rg.f27402c;
        } else {
            rgVar = a2.f27379b;
        }
        return new sd(rgVar, ohVar);
    }

    private static qq m25530e(ud udVar) {
        try {
            return m25528a((qs) uu.m25289a(qs.f27373b, udVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid KmsEnvelopeAead key format", e);
        }
    }

    private static qq m25528a(qs qsVar) {
        qu quVar;
        uu uuVar = qq.f27369c;
        uv uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
        uvVar.m25314a(uuVar);
        qr qrVar = (qr) uvVar;
        if (qsVar.f27375a == null) {
            quVar = qu.f27376c;
        } else {
            quVar = qsVar.f27375a;
        }
        qrVar.m25315b();
        qq.m25427a((qq) qrVar.b, quVar);
        qrVar.m25315b();
        ((qq) qrVar.b).f27371a = 0;
        return (qq) qrVar.m25317d();
    }
}
