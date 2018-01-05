package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

class C7128a extends BroadcastReceiver {
    public static BroadcastReceiver f34844a;
    public int f34845b;

    private C7128a(int i) {
        this.f34845b = i;
    }

    static synchronized void m32374a(Context context, int i) {
        synchronized (C7128a.class) {
            if (f34844a == null) {
                f34844a = new C7128a(i);
                context.getApplicationContext().registerReceiver(f34844a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        synchronized (C7128a.class) {
            if (f34844a != this) {
            } else if (FirebaseInstanceIdService.m32369b(context)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "connectivity changed. starting background sync.");
                }
                context.getApplicationContext().unregisterReceiver(this);
                f34844a = null;
                C7143q.m32400a().m32403a(context, FirebaseInstanceIdService.m32368b(this.f34845b));
            }
        }
    }
}
