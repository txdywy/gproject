package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.am;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class C5109i implements ServiceConnection {
    public boolean f25973a = false;
    public final BlockingQueue f25974b = new LinkedBlockingQueue();

    public final IBinder m23712a() {
        am.m23745c("BlockingServiceConnection.getService() called on main thread");
        if (this.f25973a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f25973a = true;
        return (IBinder) this.f25974b.take();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25974b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
