package com.google.android.finsky.activities;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.finsky.installapi.a;
import com.google.android.finsky.installapi.c;

public final class com.google.android.finsky.activities.ap implements ServiceConnection
{

    public final com.google.android.finsky.activities.t a;

    ap(com.google.android.finsky.activities.t p0) {
        this.a = p0;
    }

    public final void onServiceConnected(ComponentName p0, IBinder p1) {
        if (p1 == 0)
            v0 = 0;
        else {
            v0 = p1.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            if (v0 instanceof com.google.android.finsky.installapi.a)
                v0 = (com.google.android.finsky.installapi.a)v0;
            else
                v0 = new com.google.android.finsky.installapi.c(p1);
        }
        this.a.f = v0;
        this.a.b();
    }

    public final void onServiceDisconnected(ComponentName p0) {
        this.a.f = 0;
        this.a.b();
    }

}
