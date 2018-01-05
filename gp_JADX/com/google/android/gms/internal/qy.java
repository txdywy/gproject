package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

public final class qy {
    public static final qo m25439a(byte[] bArr) {
        try {
            uu a = uu.m25292a(ri.f27406d, bArr, uq.m25756a());
            if (a != null) {
                if ((a.mo4849a(vb.f27551a, Boolean.TRUE, null) != null ? 1 : null) == null) {
                    zzfxb a2 = new zzfxz().m26058a();
                    if (a2 == null) {
                        throw null;
                    }
                    throw a2;
                }
            }
            ri riVar = (ri) a;
            for (rk rkVar : riVar.f27410c) {
                if (rkVar.m25465a().m25450a() == rf.UNKNOWN_KEYMATERIAL || rkVar.m25465a().m25450a() == rf.SYMMETRIC) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                } else if (rkVar.m25465a().m25450a() == rf.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return new qo(riVar);
        } catch (zzfxb e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
