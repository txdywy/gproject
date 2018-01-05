package org.chromium.net;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.X509TrustManager;

final class bb implements bc {
    public final X509TrustManager f40675a;

    public bb(X509TrustManager x509TrustManager) {
        this.f40675a = x509TrustManager;
    }

    public final List mo6588a(X509Certificate[] x509CertificateArr, String str, String str2) {
        this.f40675a.checkServerTrusted(x509CertificateArr, str);
        return Collections.emptyList();
    }
}
