package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.a.b;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class C7138l implements ServiceConnection {
    public final Context f34874a;
    public final Intent f34875b;
    public final ScheduledExecutorService f34876c;
    public final Queue f34877d;
    public C7136j f34878e;
    public boolean f34879f;

    public C7138l(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0));
    }

    private C7138l(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f34877d = new LinkedList();
        this.f34879f = false;
        this.f34874a = context.getApplicationContext();
        this.f34875b = new Intent(str).setPackage(this.f34874a.getPackageName());
        this.f34876c = scheduledExecutorService;
    }

    private final synchronized void m32392a() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "flush queue called");
        }
        while (!this.f34877d.isEmpty()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "found intent to be delivered");
            }
            if (this.f34878e == null || !this.f34878e.isBinderAlive()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "binder is dead. start connection? " + (!this.f34879f));
                }
                if (!this.f34879f) {
                    this.f34879f = true;
                    try {
                        b.a();
                        if (!b.b(this.f34874a, this.f34875b, this, 65)) {
                            Log.e("EnhancedIntentService", "binding to the service failed");
                            while (!this.f34877d.isEmpty()) {
                                ((C7134h) this.f34877d.poll()).m32391a();
                            }
                        }
                    } catch (Throwable e) {
                        Log.e("EnhancedIntentService", "Exception while binding the service", e);
                    }
                }
            } else {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
                }
                C7134h c7134h = (C7134h) this.f34877d.poll();
                C7136j c7136j = this.f34878e;
                if (Binder.getCallingUid() != Process.myUid()) {
                    throw new SecurityException("Binding only allowed within app");
                }
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "service received new intent via bind strategy");
                }
                if (c7136j.f34871a.mo6017a(c7134h.f34865a)) {
                    c7134h.m32391a();
                } else {
                    if (Log.isLoggable("EnhancedIntentService", 3)) {
                        Log.d("EnhancedIntentService", "intent being queued for bg execution");
                    }
                    c7136j.f34871a.f34836d.execute(new C7137k(c7136j, c7134h));
                }
            }
        }
    }

    public final synchronized void m32393a(Intent intent, PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f34877d.add(new C7134h(intent, pendingResult, this.f34876c));
        m32392a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f34879f = false;
            this.f34878e = (C7136j) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                Log.d("EnhancedIntentService", new StringBuilder(String.valueOf(valueOf).length() + 20).append("onServiceConnected: ").append(valueOf).toString());
            }
            m32392a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            Log.d("EnhancedIntentService", new StringBuilder(String.valueOf(valueOf).length() + 23).append("onServiceDisconnected: ").append(valueOf).toString());
        }
        m32392a();
    }
}
