package com.google.android.finsky.installapi;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final class C3274i implements C0978f {
    public final /* synthetic */ ResultReceiver f16848a;

    C3274i(ResultReceiver resultReceiver) {
        this.f16848a = resultReceiver;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            Bundle bundle = (Bundle) c4809e.get();
            this.f16848a.send(bundle.getInt("status_code"), bundle);
            return;
        } catch (InterruptedException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            e = e3;
        }
        FinskyLog.m21660a(e, "Failed to get ListenableFuture for installSplit:", new Object[0]);
    }
}
