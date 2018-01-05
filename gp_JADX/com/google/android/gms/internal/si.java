package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

final class si implements qn {
    si() {
    }

    public final /* synthetic */ Object mo4857a(ud udVar) {
        return m25538d(udVar);
    }

    public final /* synthetic */ vk mo4859b(ud udVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final /* synthetic */ vk mo4860b(vk vkVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final rd mo4861c(ud udVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    private static qm m25538d(ud udVar) {
        try {
            return m25537a((pz) uu.m25289a(pz.f27340e, udVar));
        } catch (zzfxb e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdfPublicKey.");
        }
    }

    private static qm m25537a(pz pzVar) {
        tj.m25584b(pzVar.f27342a);
        px a = pzVar.m25390a();
        rw.m25488a(a.m25384a().m25398a());
        rw.m25487a(a.m25384a().m25401b());
        if (a.m25389d() == pm.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        rb rbVar = rb.f27387a;
        rg a2 = a.m25387b().m25380a();
        rbVar.m25440a(a2.f27404a).mo4861c(a2.f27405b);
        qb a3 = pzVar.m25390a().m25384a();
        po a4 = a3.m25398a();
        byte[] c = pzVar.f27344c.m25664c();
        byte[] c2 = pzVar.f27345d.m25664c();
        ECParameterSpec a5 = rw.m25488a(a4);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, c), new BigInteger(1, c2));
        sr.m25567a(eCPoint, a5.getCurve());
        return new sh((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, a5)), a3.f27352c.m25664c(), rw.m25487a(a3.m25401b()), pzVar.m25390a().m25387b().m25380a(), pzVar.m25390a().m25389d());
    }
}
