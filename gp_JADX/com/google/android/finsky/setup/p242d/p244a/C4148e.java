package com.google.android.finsky.setup.p242d.p244a;

import android.os.ResultReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

final class C4148e implements Runnable {
    public final /* synthetic */ ResultReceiver f20998a;
    public final /* synthetic */ C4147d f20999b;

    C4148e(C4147d c4147d, ResultReceiver resultReceiver) {
        this.f20999b = c4147d;
        this.f20998a = resultReceiver;
    }

    public final void run() {
        C4147d c4147d = this.f20999b;
        ResultReceiver resultReceiver = this.f20998a;
        bb.m21791a();
        if (c4147d.f20991h != null) {
            FinskyLog.m21667d("Already running early update", new Object[0]);
            resultReceiver.send(7, null);
            return;
        }
        c4147d.f20991h = resultReceiver;
        c4147d.f20988e = new C4154k(c4147d);
        c4147d.f20992i.mo3481a(c4147d.f20988e);
        c4147d.m19432c();
    }
}
