package com.google.android.finsky.zapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

final class C4853k implements ServiceConnection {
    public final BlockingQueue f25154a = new LinkedBlockingQueue();

    C4853k() {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25154a.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
