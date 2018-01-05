package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1634r;

final class ap implements C1634r {
    public final /* synthetic */ ak f24815a;

    ap(ak akVar) {
        this.f24815a = akVar;
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        bb.m21791a();
        FinskyLog.m21667d("onConnectionFailed: %s", connectionResult);
        this.f24815a.f24792b = null;
        ak akVar = this.f24815a;
        int size = akVar.f24793c.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) akVar.f24793c.get(i)).run();
        }
        akVar.f24793c.clear();
    }
}
