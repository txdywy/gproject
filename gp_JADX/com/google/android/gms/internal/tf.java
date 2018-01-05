package com.google.android.gms.internal;

import java.security.Provider;
import java.security.Signature;

public final class tf implements sy {
    public final /* synthetic */ Object mo4865a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
