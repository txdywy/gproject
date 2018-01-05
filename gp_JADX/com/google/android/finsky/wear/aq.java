package com.google.android.finsky.wear;

import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.api.C1632q;

final class aq implements C1632q {
    public final /* synthetic */ ak f24816a;

    aq(ak akVar) {
        this.f24816a = akVar;
    }

    public final void mo2363a(Bundle bundle) {
        bb.m21791a();
        ak akVar = this.f24816a;
        int size = akVar.f24793c.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) akVar.f24793c.get(i)).run();
        }
        akVar.f24793c.clear();
    }

    public final void mo2362a(int i) {
        bb.m21791a();
        FinskyLog.m21659a("onConnectionSuspended: %d", Integer.valueOf(i));
        this.f24816a.f24792b = null;
        ak akVar = this.f24816a;
        int size = akVar.f24793c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Runnable) akVar.f24793c.get(i2)).run();
        }
        akVar.f24793c.clear();
    }
}
