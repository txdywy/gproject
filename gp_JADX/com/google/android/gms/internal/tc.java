package com.google.android.gms.internal;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class tc implements sy {
    public final /* synthetic */ Object mo4865a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
