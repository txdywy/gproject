package org.chromium.net;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

final class bd implements bc {
    public final X509TrustManagerExtensions f40676a;

    @SuppressLint({"NewApi"})
    public bd(X509TrustManager x509TrustManager) {
        this.f40676a = new X509TrustManagerExtensions(x509TrustManager);
    }

    @SuppressLint({"NewApi"})
    public final List mo6588a(X509Certificate[] x509CertificateArr, String str, String str2) {
        return this.f40676a.checkServerTrusted(x509CertificateArr, str, str2);
    }
}
