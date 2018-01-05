package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class ax extends BroadcastReceiver {
    public Context f25740a;
    public final ay f25741b;

    public ax(ay ayVar) {
        this.f25741b = ayVar;
    }

    public final synchronized void m23465a() {
        if (this.f25740a != null) {
            this.f25740a.unregisterReceiver(this);
        }
        this.f25740a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        Object obj = null;
        if (data != null) {
            obj = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(obj)) {
            this.f25741b.mo4566a();
            m23465a();
        }
    }
}
