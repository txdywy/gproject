package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C5058o;
import java.util.concurrent.atomic.AtomicReference;

final class ae implements C1632q {
    public /* synthetic */ AtomicReference f25669a;
    public /* synthetic */ bt f25670b;
    public /* synthetic */ ac f25671c;

    ae(ac acVar, AtomicReference atomicReference, bt btVar) {
        this.f25671c = acVar;
        this.f25669a = atomicReference;
        this.f25670b = btVar;
    }

    public final void mo2362a(int i) {
    }

    public final void mo2363a(Bundle bundle) {
        this.f25671c.m23334a((C5058o) this.f25669a.get(), this.f25670b, true);
    }
}
