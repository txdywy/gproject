package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.api.C4925b;

public final class C4926b implements C4925b {
    public final String f25345a;
    public final PasswordSpecification f25346b;

    private C4926b(C4927c c4927c) {
        this.f25345a = c4927c.f25347a;
        this.f25346b = c4927c.f25348b;
    }

    static {
        C4926b c4926b = new C4926b(new C4927c());
    }
}
