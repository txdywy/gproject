package com.google.android.gms.internal;

import java.security.KeyFactory;
import java.security.Provider;

public final class tb implements sy {
    public final /* synthetic */ Object mo4865a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
