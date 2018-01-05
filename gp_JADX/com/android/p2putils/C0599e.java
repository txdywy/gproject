package com.android.p2putils;

import java.security.cert.X509Certificate;

final class C0599e extends C0598f {
    public byte[] f3940a;

    public C0599e(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f3940a = bArr;
    }

    public final byte[] getEncoded() {
        return this.f3940a;
    }
}
