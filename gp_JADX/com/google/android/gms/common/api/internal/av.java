package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

final class av implements Runnable {
    public /* synthetic */ ConnectionResult f25736a;
    public /* synthetic */ au f25737b;

    av(au auVar, ConnectionResult connectionResult) {
        this.f25737b = auVar;
        this.f25736a = connectionResult;
    }

    public final void run() {
        if (this.f25736a.m23264b()) {
            this.f25737b.f25734e = true;
            if (this.f25737b.f25730a.mo4826l()) {
                this.f25737b.m23446a();
                return;
            } else {
                this.f25737b.f25730a.m23035a(null, Collections.emptySet());
                return;
            }
        }
        ((aq) this.f25737b.f25735f.f25709m.get(this.f25737b.f25731b)).mo2364a(this.f25736a);
    }
}
