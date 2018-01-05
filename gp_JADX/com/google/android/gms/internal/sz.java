package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Cipher;

public final class sz implements sy {
    public final /* synthetic */ Object mo4865a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
