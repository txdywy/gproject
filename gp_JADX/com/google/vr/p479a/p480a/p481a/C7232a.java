package com.google.vr.p479a.p480a.p481a;

import com.google.vr.p479a.p480a.C7241d;
import java.util.UUID;

public final class C7232a {
    public final C7241d f35515a;
    public final String f35516b = UUID.randomUUID().toString();

    public C7232a(C7241d c7241d) {
        this.f35515a = c7241d;
    }

    public final long m33813a() {
        try {
            return this.f35515a.mo6308a();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
