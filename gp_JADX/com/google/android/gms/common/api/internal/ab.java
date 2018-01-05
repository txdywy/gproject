package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5053a;
import java.util.Collections;

public final class ab implements aj {
    public final ak f25641a;

    public ab(ak akVar) {
        this.f25641a = akVar;
    }

    public final cn mo4534a(cn cnVar) {
        this.f25641a.f25692n.f25650i.add(cnVar);
        return cnVar;
    }

    public final void mo4535a() {
        for (C4949i e : this.f25641a.f25684f.values()) {
            e.mo4510e();
        }
        this.f25641a.f25692n.f25658q = Collections.emptySet();
    }

    public final void mo4536a(int i) {
    }

    public final void mo4537a(Bundle bundle) {
    }

    public final void mo4538a(ConnectionResult connectionResult, C5053a c5053a, boolean z) {
    }

    public final cn mo4539b(cn cnVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final boolean mo4540b() {
        return true;
    }

    public final void mo4541c() {
        ak akVar = this.f25641a;
        akVar.f25679a.lock();
        try {
            akVar.f25689k = new C5075p(akVar, akVar.f25686h, akVar.f25687i, akVar.f25688j, akVar.f25679a, akVar.f25681c);
            akVar.f25689k.mo4535a();
            akVar.f25680b.signalAll();
        } finally {
            akVar.f25679a.unlock();
        }
    }
}
