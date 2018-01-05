package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.KeyAgreement;

public final class ta implements sy {
    public final /* synthetic */ Object mo4865a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
