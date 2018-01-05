package com.google.android.youtube.player.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

final class ad implements ServiceConnection {
    public final /* synthetic */ C6850x f33840a;

    ad(C6850x c6850x) {
        this.f33840a = c6850x;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C6843o c6843o;
        C6850x c6850x = this.f33840a;
        if (iBinder == null) {
            c6843o = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            c6843o = (queryLocalInterface == null || !(queryLocalInterface instanceof C6843o)) ? new C6844p(iBinder) : (C6843o) queryLocalInterface;
        }
        try {
            c6850x.mo5736a(c6843o, new ac(c6850x));
        } catch (RemoteException e) {
            Log.w("YouTubeClient", "service died");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f33840a.f33867g = null;
        this.f33840a.m31205h();
    }
}
