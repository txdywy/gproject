package com.google.android.finsky.wear;

import android.content.Context;
import android.content.Intent;

final /* synthetic */ class am implements Runnable {
    public final Context f24806a;
    public final Intent f24807b;

    am(Context context, Intent intent) {
        this.f24806a = context;
        this.f24807b = intent;
    }

    public final void run() {
        this.f24806a.startService(this.f24807b);
    }
}
