package com.squareup.okhttp;

import com.squareup.okhttp.internal.C7600b;
import com.squareup.okhttp.internal.C7644c;
import com.squareup.okhttp.internal.C7676j;
import com.squareup.okhttp.internal.http.ad;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.internal.p525a.C7614e;
import com.squareup.okhttp.internal.p527b.C7641a;
import javax.net.ssl.SSLSocket;

final class ae extends C7600b {
    ae() {
    }

    public final void mo6413a(C7690w c7690w, String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            c7690w.m37024b(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            c7690w.m37024b("", str.substring(1));
        } else {
            c7690w.m37024b("", str);
        }
    }

    public final C7644c mo6410a(ad adVar) {
        return adVar.m;
    }

    public final boolean mo6414a(C7680m c7680m, C7641a c7641a) {
        if (c7641a.f39569k || c7680m.f39770c == 0) {
            c7680m.f39773f.remove(c7641a);
            return true;
        }
        c7680m.notifyAll();
        return false;
    }

    public final C7641a mo6409a(C7680m c7680m, C7599a c7599a, ad adVar) {
        for (C7641a c7641a : c7680m.f39773f) {
            int size = c7641a.f39568j.size();
            C7614e c7614e = c7641a.f39564f;
            if (size < (c7614e != null ? c7614e.m36786a() : 1) && c7599a.equals(c7641a.f39559a.f39325a) && !c7641a.f39569k) {
                adVar.m36914a(c7641a);
                return c7641a;
            }
        }
        return null;
    }

    public final void mo6415b(C7680m c7680m, C7641a c7641a) {
        if (c7680m.f39773f.isEmpty()) {
            c7680m.f39769b.execute(c7680m.f39772e);
        }
        c7680m.f39773f.add(c7641a);
    }

    public final C7676j mo6411a(C7680m c7680m) {
        return c7680m.f39774g;
    }

    public final void mo6412a(C7682o c7682o, SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (c7682o.f39782g != null) {
            strArr = (String[]) k.a(String.class, c7682o.f39782g, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (c7682o.f39783h != null) {
            strArr2 = (String[]) k.a(String.class, c7682o.f39783h, sSLSocket.getEnabledProtocols());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        if (z && k.a(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV")) {
            strArr = k.b(strArr, "TLS_FALLBACK_SCSV");
        }
        C7682o b = new C7683p(c7682o).m37004a(strArr).m37006b(strArr2).m37005b();
        if (b.f39783h != null) {
            sSLSocket.setEnabledProtocols(b.f39783h);
        }
        if (b.f39782g != null) {
            sSLSocket.setEnabledCipherSuites(b.f39782g);
        }
    }
}
