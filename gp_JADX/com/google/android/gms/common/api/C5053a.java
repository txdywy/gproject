package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.am;

public final class C5053a {
    public final C4931e f25634a;
    public final C5085j f25635b;
    public final String f25636c;

    public C5053a(String str, C4931e c4931e, C5085j c5085j) {
        am.m23734a((Object) c4931e, (Object) "Cannot construct an Api with a null ClientBuilder");
        am.m23734a((Object) c5085j, (Object) "Cannot construct an Api with a null ClientKey");
        this.f25636c = str;
        this.f25634a = c4931e;
        this.f25635b = c5085j;
    }

    public final C4931e m23273a() {
        am.m23739a(this.f25634a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f25634a;
    }

    public final C5056g m23274b() {
        if (this.f25635b != null) {
            return this.f25635b;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
