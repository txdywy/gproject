package com.google.android.finsky.by.p132a;

import com.google.android.finsky.utils.FinskyLog;

final class C2226y implements Runnable {
    public final /* synthetic */ C2224w f11099a;

    C2226y(C2224w c2224w) {
        this.f11099a = c2224w;
    }

    public final void run() {
        if (this.f11099a.f11096b.f11080j == null) {
            FinskyLog.m21669e("Expected pending replication request.", new Object[0]);
            return;
        }
        if (this.f11099a.f11096b.f11080j.f10994b != null) {
            this.f11099a.f11096b.f11074d.post(this.f11099a.f11096b.f11080j.f10994b);
        }
        this.f11099a.f11096b.f11080j = null;
        this.f11099a.f11096b.m11625a(C2219r.f11071a);
    }
}
