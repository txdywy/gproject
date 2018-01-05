package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p526e.C7728j;

public final class C7607h {
    public static final C7607h f39363a = new C7607h(new C7608i());
    public final Map f39364b;

    private C7607h(C7608i c7608i) {
        this.f39364b = k.a(c7608i.f39365a);
    }

    public final void m36678a(String str, List list) {
        Collection collection;
        Set set = null;
        Set set2 = (Set) this.f39364b.get(str);
        int indexOf = str.indexOf(46);
        if (indexOf != str.lastIndexOf(46)) {
            collection = (Set) this.f39364b.get("*." + str.substring(indexOf + 1));
        } else {
            collection = null;
        }
        if (!(set2 == null && collection == null)) {
            if (set2 != null && collection != null) {
                Set linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(set2);
                linkedHashSet.addAll(collection);
                set = linkedHashSet;
            } else if (set2 != null) {
                set = set2;
            } else {
                Collection collection2 = collection;
            }
        }
        if (r3 != null) {
            int size = list.size();
            indexOf = 0;
            while (indexOf < size) {
                if (!r3.contains(C7607h.m36676a((X509Certificate) list.get(indexOf)))) {
                    indexOf++;
                } else {
                    return;
                }
            }
            StringBuilder append = new StringBuilder("Certificate pinning failure!").append("\n  Peer certificate chain:");
            int size2 = list.size();
            for (indexOf = 0; indexOf < size2; indexOf++) {
                Certificate certificate = (X509Certificate) list.get(indexOf);
                append.append("\n    ").append(C7607h.m36677a(certificate)).append(": ").append(certificate.getSubjectDN().getName());
            }
            append.append("\n  Pinned certificates for ").append(str).append(":");
            for (C7728j b : r3) {
                append.append("\n    sha1/").append(b.mo6519b());
            }
            throw new SSLPeerUnverifiedException(append.toString());
        }
    }

    public static String m36677a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha1/" + C7607h.m36676a((X509Certificate) certificate).mo6519b();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private static C7728j m36676a(X509Certificate x509Certificate) {
        return k.a(C7728j.m37413a(x509Certificate.getPublicKey().getEncoded()));
    }
}
