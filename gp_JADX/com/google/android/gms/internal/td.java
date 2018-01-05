package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Mac;

public final class td implements sy {
    public final /* synthetic */ Object mo4865a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
