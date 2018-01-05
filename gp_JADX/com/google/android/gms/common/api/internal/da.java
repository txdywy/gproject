package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class da implements Runnable {
    public /* synthetic */ cz f25845a;

    da(cz czVar) {
        this.f25845a = czVar;
    }

    public final void run() {
        this.f25845a.f25839m.lock();
        try {
            cz czVar = this.f25845a;
            if (cz.m23556b(czVar.f25836j)) {
                if (cz.m23556b(czVar.f25837k) || czVar.m23572h()) {
                    switch (czVar.f25840n) {
                        case 1:
                            break;
                        case 2:
                            czVar.f25828b.mo4547a(czVar.f25835i);
                            break;
                        default:
                            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                            break;
                    }
                    czVar.m23571g();
                    czVar.f25840n = 0;
                } else if (czVar.f25837k != null) {
                    if (czVar.f25840n == 1) {
                        czVar.m23571g();
                    } else {
                        czVar.m23562a(czVar.f25837k);
                        czVar.f25830d.mo4575c();
                    }
                }
            } else if (czVar.f25836j != null && cz.m23556b(czVar.f25837k)) {
                czVar.f25831e.mo4575c();
                czVar.m23562a(czVar.f25836j);
            } else if (!(czVar.f25836j == null || czVar.f25837k == null)) {
                ConnectionResult connectionResult = czVar.f25836j;
                if (czVar.f25831e.f25691m < czVar.f25830d.f25691m) {
                    connectionResult = czVar.f25837k;
                }
                czVar.m23562a(connectionResult);
            }
            this.f25845a.f25839m.unlock();
        } catch (Throwable th) {
            this.f25845a.f25839m.unlock();
        }
    }
}
