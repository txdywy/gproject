package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class C5060b implements be {
    public /* synthetic */ cz f25743a;

    C5060b(cz czVar) {
        this.f25743a = czVar;
    }

    public final void mo4547a(Bundle bundle) {
        this.f25743a.f25839m.lock();
        try {
            cz czVar = this.f25743a;
            if (czVar.f25835i == null) {
                czVar.f25835i = bundle;
            } else if (bundle != null) {
                czVar.f25835i.putAll(bundle);
            }
            this.f25743a.f25836j = ConnectionResult.f25609a;
            cz czVar2 = this.f25743a;
            if (cz.m23556b(czVar2.f25836j)) {
                if (cz.m23556b(czVar2.f25837k) || czVar2.m23572h()) {
                    switch (czVar2.f25840n) {
                        case 1:
                            break;
                        case 2:
                            czVar2.f25828b.mo4547a(czVar2.f25835i);
                            break;
                        default:
                            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                            break;
                    }
                    czVar2.m23571g();
                    czVar2.f25840n = 0;
                } else if (czVar2.f25837k != null) {
                    if (czVar2.f25840n == 1) {
                        czVar2.m23571g();
                    } else {
                        czVar2.m23562a(czVar2.f25837k);
                        czVar2.f25830d.mo4575c();
                    }
                }
            } else if (czVar2.f25836j != null && cz.m23556b(czVar2.f25837k)) {
                czVar2.f25831e.mo4575c();
                czVar2.m23562a(czVar2.f25836j);
            } else if (!(czVar2.f25836j == null || czVar2.f25837k == null)) {
                ConnectionResult connectionResult = czVar2.f25836j;
                if (czVar2.f25831e.f25691m < czVar2.f25830d.f25691m) {
                    connectionResult = czVar2.f25837k;
                }
                czVar2.m23562a(connectionResult);
            }
            this.f25743a.f25839m.unlock();
        } catch (Throwable th) {
            this.f25743a.f25839m.unlock();
        }
    }

    public final void mo4548a(ConnectionResult connectionResult) {
        this.f25743a.f25839m.lock();
        try {
            this.f25743a.f25836j = connectionResult;
            cz czVar = this.f25743a;
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
            this.f25743a.f25839m.unlock();
        } catch (Throwable th) {
            this.f25743a.f25839m.unlock();
        }
    }

    public final void mo4546a(int i, boolean z) {
        this.f25743a.f25839m.lock();
        try {
            if (this.f25743a.f25838l || this.f25743a.f25837k == null || !this.f25743a.f25837k.m23264b()) {
                this.f25743a.f25838l = false;
                cz czVar = this.f25743a;
                czVar.f25828b.mo4546a(i, z);
                czVar.f25837k = null;
                czVar.f25836j = null;
                return;
            }
            this.f25743a.f25838l = true;
            this.f25743a.f25831e.mo2362a(i);
            this.f25743a.f25839m.unlock();
        } finally {
            this.f25743a.f25839m.unlock();
        }
    }
}
