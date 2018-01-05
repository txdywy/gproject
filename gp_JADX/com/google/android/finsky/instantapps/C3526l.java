package com.google.android.finsky.instantapps;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.packagemanager.C2554g;

public final class C3526l implements C2554g {
    public final Context f17777a;

    public C3526l(Context context) {
        this.f17777a = context;
    }

    public final void mo2943a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.f17777a, PackageReplacedReceiver.class));
        this.f17777a.sendBroadcast(intent);
    }
}
