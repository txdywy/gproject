package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class sf {
    public final int f27451a;
    public final int f27452b;
    public pf f27453c;
    public oj f27454d;
    public int f27455e;

    public sf(rg rgVar) {
        String str = rgVar.f27404a;
        if (str.equals("type.googleapis.com/google.cloud.crypto.tink.AesGcmKey")) {
            try {
                ph a = ph.m25367a(rgVar.f27405b);
                this.f27451a = sg.f27456a;
                this.f27453c = (pf) rb.f27387a.m25441a(rgVar);
                this.f27452b = a.f27304b;
            } catch (Throwable e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (str.equals("type.googleapis.com/google.cloud.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                ol a2 = ol.m25323a(rgVar.f27405b);
                this.f27451a = sg.f27457b;
                this.f27454d = (oj) rb.f27387a.m25441a(rgVar);
                this.f27455e = a2.m25324a().f27278b;
                this.f27452b = a2.m25327b().f27362b + this.f27455e;
            } catch (Throwable e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String str2 = "unsupported AEAD DEM key type: ";
            str = String.valueOf(str);
            throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }
}
