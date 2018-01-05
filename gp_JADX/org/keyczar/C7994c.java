package org.keyczar;

import org.keyczar.p571c.C7990b;
import org.keyczar.p571c.C7991c;

public enum C7994c implements C7990b {
    AES,
    HMAC_SHA1,
    DSA_PRIV,
    DSA_PUB,
    RSA_PRIV,
    RSA_PUB,
    EC_PRIV,
    EC_PUB,
    TEST;

    public final String mo6652a() {
        return name();
    }

    public final C7991c mo6653b() {
        return new C7997d(this);
    }
}
