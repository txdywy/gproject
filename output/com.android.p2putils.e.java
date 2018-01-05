package com.android.p2putils;

import java.security.cert.X509Certificate;

public final class com.android.p2putils.e extends com.android.p2putils.f
{

    public byte[] a;

    e(X509Certificate p0, byte[] p1) {
        com.android.p2putils.f(p0);
        this.a = p1;
    }

    public final byte[] getEncoded() {
        return this.a;
    }

}
