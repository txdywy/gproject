package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class C7688u {
    public final String f39790a;
    public final List f39791b;
    public final List f39792c;

    private C7688u(String str, List list, List list2) {
        this.f39790a = str;
        this.f39791b = list;
        this.f39792c = list2;
    }

    public static C7688u m37012a(SSLSession sSLSession) {
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        Object[] peerCertificates;
        List a;
        List a2;
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException e) {
            peerCertificates = null;
        }
        if (peerCertificates != null) {
            a = k.a(peerCertificates);
        } else {
            a = Collections.emptyList();
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            a2 = k.a(localCertificates);
        } else {
            a2 = Collections.emptyList();
        }
        return new C7688u(cipherSuite, a, a2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7688u)) {
            return false;
        }
        C7688u c7688u = (C7688u) obj;
        if (this.f39790a.equals(c7688u.f39790a) && this.f39791b.equals(c7688u.f39791b) && this.f39792c.equals(c7688u.f39792c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f39790a.hashCode() + 527) * 31) + this.f39791b.hashCode()) * 31) + this.f39792c.hashCode();
    }
}
