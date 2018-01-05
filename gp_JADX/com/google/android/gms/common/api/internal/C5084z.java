package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;

final class C5084z implements C1632q, C1634r {
    public /* synthetic */ C5075p f25912a;

    C5084z(C5075p c5075p) {
        this.f25912a = c5075p;
    }

    public final void mo2362a(int i) {
    }

    public final void mo2363a(Bundle bundle) {
        this.f25912a.f25887j.mo4825a(new C5082w(this.f25912a));
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        this.f25912a.f25879b.lock();
        try {
            if (this.f25912a.m23625a(connectionResult)) {
                this.f25912a.m23634f();
                this.f25912a.m23633e();
            } else {
                this.f25912a.m23627b(connectionResult);
            }
            this.f25912a.f25879b.unlock();
        } catch (Throwable th) {
            this.f25912a.f25879b.unlock();
        }
    }
}
