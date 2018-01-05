package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;

class rz implements qn {
    public static final Logger f27446a = Logger.getLogger(rz.class.getName());

    static {
        try {
            rb.f27387a.m25444a("type.googleapis.com/google.cloud.crypto.tink.AesCtrKey", new sa());
            sn.m25557a();
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            f27446a.logp(Level.SEVERE, "com.google.cloud.crypto.tink.aead.AesCtrHmacAeadKeyManager", "<clinit>", new StringBuilder(String.valueOf(valueOf).length() + 30).append("cannot register key managers: ").append(valueOf).toString());
        }
    }

    rz() {
    }

    private static oj m25491a(ol olVar) {
        return (oj) oj.m25300d().m25321a((op) rb.f27387a.m25442a("type.googleapis.com/google.cloud.crypto.tink.AesCtrKey", olVar.m25324a())).m25322a((qf) rb.f27387a.m25442a("type.googleapis.com/google.cloud.crypto.tink.HmacKey", olVar.m25327b())).m25320a(0).m25317d();
    }

    private static oj m25493e(ud udVar) {
        try {
            return m25491a(ol.m25323a(udVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid AesCtrHmacAead key format", e);
        }
    }

    public final /* synthetic */ Object mo4857a(ud udVar) {
        return m25492d(udVar);
    }

    public final /* synthetic */ vk mo4859b(ud udVar) {
        return m25493e(udVar);
    }

    public final /* synthetic */ vk mo4860b(vk vkVar) {
        return m25491a((ol) vkVar);
    }

    public final rd mo4861c(ud udVar) {
        return (rd) rd.m25449b().m25456a("type.googleapis.com/google.cloud.crypto.tink.AesCtrHmacAeadKey").m25455a(m25493e(udVar).mo4845e()).m25454a(rf.SYMMETRIC).m25317d();
    }

    private static oh m25492d(ud udVar) {
        try {
            return m25490a((oj) uu.m25289a(oj.f27257d, udVar));
        } catch (zzfxb e) {
            throw new GeneralSecurityException("invalid AesCtrHmacAead key");
        }
    }

    private static oh m25490a(oj ojVar) {
        tj.m25584b(ojVar.f27259a);
        tg tgVar = (tg) rb.f27387a.m25445b("type.googleapis.com/google.cloud.crypto.tink.AesCtrKey", ojVar.m25301a());
        qx qxVar = (qx) rb.f27387a.m25445b("type.googleapis.com/google.cloud.crypto.tink.HmacKey", ojVar.m25304b());
        int i = ojVar.m25304b().m25407a().f27366b;
        return new sw(tgVar, qxVar);
    }
}
