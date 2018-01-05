package com.google.android.finsky.installer.p207a;

import android.os.Bundle;
import android.os.ResultReceiver;

final class C3293l implements Runnable {
    public final /* synthetic */ ResultReceiver f17045a;
    public final /* synthetic */ int f17046b;

    C3293l(ResultReceiver resultReceiver, int i) {
        this.f17045a = resultReceiver;
        this.f17046b = i;
    }

    public final void run() {
        this.f17045a.send(this.f17046b, new Bundle());
    }
}
