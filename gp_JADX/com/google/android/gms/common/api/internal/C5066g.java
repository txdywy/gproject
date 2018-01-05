package com.google.android.gms.common.api.internal;

import android.support.v4.p037h.C0305a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.C4751a;
import com.google.android.gms.tasks.C5587d;
import java.util.Collections;

final class C5066g implements C4751a {
    public bo f25864a;
    public /* synthetic */ C5064e f25865b;

    C5066g(C5064e c5064e, bo boVar) {
        this.f25865b = c5064e;
        this.f25864a = boVar;
    }

    final void m23594a() {
        this.f25864a.mo4477f();
    }

    public final void mo4375a(C5587d c5587d) {
        this.f25865b.f25851f.lock();
        try {
            if (this.f25865b.f25858m) {
                if (c5587d.mo5060b()) {
                    this.f25865b.f25860o = new C0305a(this.f25865b.f25847b.size());
                    for (C5063d c5063d : this.f25865b.f25847b.values()) {
                        this.f25865b.f25860o.put(c5063d.f25588d, ConnectionResult.f25609a);
                    }
                } else if (c5587d.mo5062d() instanceof zza) {
                    zza com_google_android_gms_common_api_zza = (zza) c5587d.mo5062d();
                    if (this.f25865b.f25856k) {
                        this.f25865b.f25860o = new C0305a(this.f25865b.f25847b.size());
                        for (C5063d c5063d2 : this.f25865b.f25847b.values()) {
                            ch chVar = c5063d2.f25588d;
                            ConnectionResult a = com_google_android_gms_common_api_zza.m23654a(c5063d2);
                            if (C5064e.m23577a(this.f25865b, c5063d2, a)) {
                                this.f25865b.f25860o.put(chVar, new ConnectionResult(16));
                            } else {
                                this.f25865b.f25860o.put(chVar, a);
                            }
                        }
                    } else {
                        this.f25865b.f25860o = com_google_android_gms_common_api_zza.f25933a;
                    }
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", c5587d.mo5062d());
                    this.f25865b.f25860o = Collections.emptyMap();
                }
                if (this.f25865b.mo4576d()) {
                    this.f25865b.f25859n.putAll(this.f25865b.f25860o);
                    if (C5064e.m23576a(this.f25865b) == null) {
                        C5064e.m23578b(this.f25865b);
                        C5064e.m23579c(this.f25865b);
                        this.f25865b.f25853h.signalAll();
                    }
                }
                this.f25864a.mo4477f();
                this.f25865b.f25851f.unlock();
                return;
            }
            this.f25864a.mo4477f();
        } finally {
            this.f25865b.f25851f.unlock();
        }
    }
}
