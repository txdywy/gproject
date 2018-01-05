package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class rb {
    public static final rb f27387a = new rb();
    public final ConcurrentMap f27388b = new ConcurrentHashMap();

    protected rb() {
    }

    final qn m25440a(String str) {
        qn qnVar = (qn) this.f27388b.get(str);
        if (qnVar != null) {
            return qnVar;
        }
        String str2 = "unsupported key type: ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public final vk m25442a(String str, vk vkVar) {
        return m25440a(str).mo4860b(vkVar);
    }

    final Object m25443a(String str, ud udVar) {
        return m25440a(str).mo4857a(udVar);
    }

    public final boolean m25444a(String str, qn qnVar) {
        return ((qn) this.f27388b.putIfAbsent(str, qnVar)) == null;
    }

    public final Object m25445b(String str, vk vkVar) {
        return m25440a(str).mo4858a(vkVar);
    }

    public final vk m25441a(rg rgVar) {
        return m25440a(rgVar.f27404a).mo4859b(rgVar.f27405b);
    }
}
