package com.google.android.finsky.scheduler;

import android.os.Message;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C4043u implements C0978f {
    public final Message f20334a;

    C4043u(Message message) {
        this.f20334a = message;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        Message message = this.f20334a;
        try {
            C4046x c4046x = (C4046x) c4809e.get();
            Collections.sort(c4046x.f20340a, C4045w.f20339a);
            message.obj = c4046x;
            message.sendToTarget();
            return;
        } catch (ExecutionException e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        FinskyLog.m21663b(e, "Could not get jobs ordered for state", new Object[0]);
    }
}
