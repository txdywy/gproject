package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.Provider;

public final class te implements sy {
    public final /* synthetic */ Object mo4865a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
