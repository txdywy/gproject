package com.google.android.finsky.zapp.utils;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class C4864b implements ServiceConnection {
    public boolean f25172a = false;
    public final BlockingQueue f25173b = new LinkedBlockingQueue();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25173b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final IBinder m22749a() {
        if (this.f25172a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f25172a = true;
        return (IBinder) this.f25173b.take();
    }
}
