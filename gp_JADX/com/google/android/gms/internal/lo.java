package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.C5320c;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

final class lo implements C5320c {
    public final Status f27157a;
    public final PseudonymousIdToken f27158b;

    lo(Status status, PseudonymousIdToken pseudonymousIdToken) {
        this.f27157a = status;
        this.f27158b = pseudonymousIdToken;
    }

    public final PseudonymousIdToken mo4797a() {
        return this.f27158b;
    }

    public final Status mo4505b() {
        return this.f27157a;
    }
}
