package com.google.android.finsky.instantapps.appmanagement;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@TargetApi(26)
public final class C3396o {
    public static IntentFilter f17401a;
    public final Context f17402b;
    public final PackageManager f17403c;

    public C3396o(Context context, PackageManager packageManager) {
        this.f17402b = context;
        this.f17403c = packageManager;
    }

    private final void m16896b(List list) {
        for (String str : list) {
            Intent intent = new Intent("com.google.android.finsky.instantapps.garbagecollection.action.UNINSTALL_COMPLETE").setPackage(this.f17402b.getPackageName());
            String valueOf = String.valueOf("package:");
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f17402b, 0, intent.setData(Uri.parse(valueOf2)), 268435456);
            try {
                this.f17403c.getPackageInfo(str, 8388608);
                this.f17403c.getPackageInstaller().uninstall(str, broadcast.getIntentSender());
            } catch (NameNotFoundException e) {
            }
        }
    }

    public final boolean m16897a(List list) {
        if (list.isEmpty()) {
            return true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Map concurrentHashMap = new ConcurrentHashMap(list.size());
        BroadcastReceiver c3397p = new C3397p(concurrentHashMap, countDownLatch);
        Context context = this.f17402b;
        if (f17401a == null) {
            IntentFilter intentFilter = new IntentFilter("com.google.android.finsky.instantapps.garbagecollection.action.UNINSTALL_COMPLETE");
            f17401a = intentFilter;
            intentFilter.addDataScheme("package");
        }
        context.registerReceiver(c3397p, f17401a);
        m16896b(list);
        boolean z = false;
        try {
            z = countDownLatch.await(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        if (!z) {
            Log.e("InstantAppUninstaller", "Timeout encountered, some apps may not have been garbage collected.");
        }
        this.f17402b.unregisterReceiver(c3397p);
        for (Entry entry : concurrentHashMap.entrySet()) {
            String str = "InstantAppUninstaller";
            String str2 = "Attempted but may have failed to uninstall ";
            String valueOf = String.valueOf((String) entry.getKey());
            Log.v(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            ((PendingIntent) entry.getValue()).cancel();
        }
        return z;
    }
}
