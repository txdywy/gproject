package com.google.android.gms.peerdownloadmanager.p292c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.p293d.C5481a;
import com.google.android.gms.peerdownloadmanager.p293d.C5482b;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

final class C5365j implements ServiceConnection {
    public final BlockingQueue f27900a = new ArrayBlockingQueue(1);
    public final Context f27901b;
    public final Intent f27902c;
    public final long f27903d;
    public final TimeUnit f27904e;
    public C5481a f27905f;

    public C5365j(Context context, Intent intent, TimeUnit timeUnit) {
        this.f27901b = context;
        this.f27902c = intent;
        this.f27903d = 10;
        this.f27904e = timeUnit;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String valueOf = String.valueOf(componentName);
        String valueOf2 = String.valueOf(iBinder);
        Log.d("PdmBindHelper", new StringBuilder((String.valueOf(valueOf).length() + 22) + String.valueOf(valueOf2).length()).append("onServiceConnected: ").append(valueOf).append(", ").append(valueOf2).toString());
        if (componentName != null && iBinder != null) {
            try {
                Object obj;
                BlockingQueue blockingQueue = this.f27900a;
                if (iBinder == null) {
                    obj = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.peerdownloadmanager.internal.IResourceHost");
                    if (queryLocalInterface instanceof C5481a) {
                        C5481a c5481a = (C5481a) queryLocalInterface;
                    } else {
                        obj = new C5482b(iBinder);
                    }
                }
                blockingQueue.put(obj);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String valueOf = String.valueOf(componentName);
        Log.d("PdmBindHelper", new StringBuilder(String.valueOf(valueOf).length() + 20).append("onServiceConnected: ").append(valueOf).toString());
    }

    private final synchronized boolean m26104c() {
        return this.f27905f != null;
    }

    final synchronized C5481a m26105a() {
        C5481a c5481a;
        if (m26104c()) {
            c5481a = this.f27905f;
        } else {
            String valueOf = String.valueOf(this.f27902c);
            Log.d("PdmBindHelper", new StringBuilder(String.valueOf(valueOf).length() + 7).append(" bind: ").append(valueOf).toString());
            if (this.f27901b.bindService(this.f27902c, this, 1)) {
                Log.d("PdmBindHelper", "bind: bind succeeded, now waiting for the connection");
                try {
                    c5481a = (C5481a) this.f27900a.poll(this.f27903d, this.f27904e);
                    String valueOf2 = String.valueOf(c5481a);
                    Log.d("PdmBindHelper", new StringBuilder(String.valueOf(valueOf2).length() + 27).append("bind: connected to service ").append(valueOf2).toString());
                    this.f27905f = c5481a;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    c5481a = null;
                }
            } else {
                Log.d("PdmBindHelper", "bind: failure, no service available?");
                c5481a = null;
            }
        }
        return c5481a;
    }

    final synchronized void m26106b() {
        if (m26104c()) {
            this.f27901b.unbindService(this);
            this.f27905f = null;
        }
    }
}
