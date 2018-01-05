package com.google.android.gms.common.api.internal;

import android.support.v4.p037h.C0305a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.C4751a;
import com.google.android.gms.tasks.C5587d;
import java.util.Collections;

final class C5065f implements C4751a {
    public /* synthetic */ C5064e f25863a;

    C5065f(C5064e c5064e) {
        this.f25863a = c5064e;
    }

    public final void mo4375a(C5587d c5587d) {
        this.f25863a.f25851f.lock();
        try {
            if (this.f25863a.f25858m) {
                if (c5587d.mo5060b()) {
                    this.f25863a.f25859n = new C0305a(this.f25863a.f25846a.size());
                    for (C5063d c5063d : this.f25863a.f25846a.values()) {
                        this.f25863a.f25859n.put(c5063d.f25588d, ConnectionResult.f25609a);
                    }
                } else if (c5587d.mo5062d() instanceof zza) {
                    zza com_google_android_gms_common_api_zza = (zza) c5587d.mo5062d();
                    if (this.f25863a.f25856k) {
                        this.f25863a.f25859n = new C0305a(this.f25863a.f25846a.size());
                        for (C5063d c5063d2 : this.f25863a.f25846a.values()) {
                            ch chVar = c5063d2.f25588d;
                            ConnectionResult a = com_google_android_gms_common_api_zza.m23654a(c5063d2);
                            if (C5064e.m23577a(this.f25863a, c5063d2, a)) {
                                this.f25863a.f25859n.put(chVar, new ConnectionResult(16));
                            } else {
                                this.f25863a.f25859n.put(chVar, a);
                            }
                        }
                    } else {
                        this.f25863a.f25859n = com_google_android_gms_common_api_zza.f25933a;
                    }
                    this.f25863a.f25862q = C5064e.m23576a(this.f25863a);
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", c5587d.mo5062d());
                    this.f25863a.f25859n = Collections.emptyMap();
                    this.f25863a.f25862q = new ConnectionResult(8);
                }
                if (this.f25863a.f25860o != null) {
                    this.f25863a.f25859n.putAll(this.f25863a.f25860o);
                    this.f25863a.f25862q = C5064e.m23576a(this.f25863a);
                }
                if (this.f25863a.f25862q == null) {
                    C5064e.m23578b(this.f25863a);
                    C5064e.m23579c(this.f25863a);
                } else {
                    this.f25863a.f25858m = false;
                    this.f25863a.f25850e.mo4548a(this.f25863a.f25862q);
                }
                this.f25863a.f25853h.signalAll();
                this.f25863a.f25851f.unlock();
            }
        } finally {
            this.f25863a.f25851f.unlock();
        }
    }
}
