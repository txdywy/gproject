package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C5022m;

public final class aw extends C5059l {
    public final C5022m f25739c;

    public aw(C5022m c5022m) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f25739c = c5022m;
    }

    public final cn mo4544a(cn cnVar) {
        return this.f25739c.m23219a(cnVar);
    }

    public final cn mo4553b(cn cnVar) {
        return this.f25739c.m23219a(cnVar);
    }

    public final Looper mo4555c() {
        return this.f25739c.f25589e;
    }

    public final Context mo4552b() {
        return this.f25739c.f25585a;
    }
}
