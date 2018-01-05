package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class C5061c implements be {
    public /* synthetic */ cz f25786a;

    C5061c(cz czVar) {
        this.f25786a = czVar;
    }

    public final void mo4547a(Bundle bundle) {
        this.f25786a.f25839m.lock();
        try {
            this.f25786a.f25837k = ConnectionResult.f25609a;
            cz czVar = this.f25786a;
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
            this.f25786a.f25839m.unlock();
        } catch (Throwable th) {
            this.f25786a.f25839m.unlock();
        }
    }

    public final void mo4548a(ConnectionResult connectionResult) {
        this.f25786a.f25839m.lock();
        try {
            this.f25786a.f25837k = connectionResult;
            cz czVar = this.f25786a;
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
                ConnectionResult connectionResult2 = czVar.f25836j;
                if (czVar.f25831e.f25691m < czVar.f25830d.f25691m) {
                    connectionResult2 = czVar.f25837k;
                }
                czVar.m23562a(connectionResult2);
            }
            this.f25786a.f25839m.unlock();
        } catch (Throwable th) {
            this.f25786a.f25839m.unlock();
        }
    }

    public final void mo4546a(int i, boolean z) {
        this.f25786a.f25839m.lock();
        try {
            if (this.f25786a.f25838l) {
                this.f25786a.f25838l = false;
                cz czVar = this.f25786a;
                czVar.f25828b.mo4546a(i, z);
                czVar.f25837k = null;
                czVar.f25836j = null;
                return;
            }
            this.f25786a.f25838l = true;
            this.f25786a.f25830d.mo2362a(i);
            this.f25786a.f25839m.unlock();
        } finally {
            this.f25786a.f25839m.unlock();
        }
    }
}
