package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.os.UserManager;
import android.support.v4.p037h.C0305a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.iid.C5254a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class C5195a {
    public static C5195a f26227a;
    public Context f26228b;
    public final PendingIntent f26229c;
    public Boolean f26230d;
    public final Map f26231e = new C0305a();

    private C5195a(Context context) {
        this.f26228b = context;
        this.f26229c = PendingIntent.getBroadcast(this.f26228b, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    public static C5195a m23967a(Context context) {
        C5195a c5195a;
        synchronized (C5195a.class) {
            if (f26227a == null) {
                f26227a = new C5195a(context.getApplicationContext());
            }
            c5195a = f26227a;
        }
        return c5195a;
    }

    public static void m23969a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (100 < str.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    private final synchronized boolean m23970b() {
        if (this.f26230d == null) {
            this.f26230d = Boolean.valueOf(this.f26228b.checkPermission("android.permission.INTERACT_ACROSS_USERS", Process.myPid(), Process.myUid()) == 0);
        }
        return this.f26230d.booleanValue();
    }

    public final Intent m23971a() {
        String a = C5254a.m24074a(this.f26228b);
        int i = -1;
        if (a != null) {
            i = C5198e.m23980a(this.f26228b);
        }
        if (a == null || i < C5198e.f26238a) {
            Log.e("GcmNetworkManager", "Google Play Services is not available, dropping GcmNetworkManager request. code=" + i);
            return null;
        }
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage(a);
        intent.putExtra("app", this.f26229c);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", 11200000);
        return intent;
    }

    public final synchronized void m23972a(Task task) {
        if (m23975b(task.f26214c)) {
            Intent a = m23971a();
            if (a != null) {
                Bundle extras = a.getExtras();
                extras.putString("scheduler_action", "SCHEDULE_TASK");
                task.mo4637a(extras);
                a.putExtras(extras);
                this.f26228b.sendBroadcast(a);
                Map map = (Map) this.f26231e.get(task.f26214c);
                if (map != null && map.containsKey(task.f26215d)) {
                    map.put(task.f26215d, Boolean.valueOf(true));
                }
            }
        }
    }

    final synchronized boolean m23973a(String str, String str2) {
        Map map;
        map = (Map) this.f26231e.get(str2);
        if (map == null) {
            map = new C0305a();
            this.f26231e.put(str2, map);
        }
        return map.put(str, Boolean.valueOf(false)) == null;
    }

    final synchronized void m23974b(String str, String str2) {
        Map map = (Map) this.f26231e.get(str2);
        if (map != null) {
            if ((map.remove(str) != null ? 1 : null) != null && map.isEmpty()) {
                this.f26231e.remove(str2);
            }
        }
    }

    final synchronized boolean m23976c(String str) {
        return this.f26231e.containsKey(str);
    }

    final synchronized boolean m23977c(String str, String str2) {
        boolean booleanValue;
        Map map = (Map) this.f26231e.get(str2);
        if (map != null) {
            Boolean bool = (Boolean) map.get(str);
            booleanValue = bool == null ? false : bool.booleanValue();
        } else {
            booleanValue = false;
        }
        return booleanValue;
    }

    public final boolean m23975b(String str) {
        am.m23734a((Object) str, (Object) "GcmTaskService must not be null.");
        PackageManager packageManager = this.f26228b.getPackageManager();
        List list;
        if (packageManager == null) {
            list = null;
        } else {
            boolean z = VERSION.SDK_INT < 17;
            boolean z2 = VERSION.SDK_INT < 24;
            if (z || (z2 && !m23970b())) {
                z = true;
            } else {
                UserManager userManager = (UserManager) this.f26228b.getSystemService("user");
                z = userManager == null || userManager.isUserRunning(Process.myUserHandle());
            }
            if (z) {
                list = C5195a.m23968a(packageManager, str != null ? new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(this.f26228b, str) : new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(this.f26228b.getPackageName()));
                if (list == null) {
                    list = Collections.emptyList();
                }
            } else {
                String str2 = "GcmNetworkManager";
                String str3 = str == null ? "unknown service" : str;
                Log.w(str2, new StringBuilder(String.valueOf(str3).length() + 51).append("Dropping request for ").append(str3).append(" because user is shutting down").toString());
                list = null;
            }
        }
        if (r0 == null) {
            return false;
        }
        for (ResolveInfo resolveInfo : r0) {
            if (resolveInfo.serviceInfo.name.equals(str)) {
                return true;
            }
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 118).append("The GcmTaskService class you provided ").append(str).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY").toString());
    }

    private static List m23968a(PackageManager packageManager, Intent intent) {
        List list = null;
        int i = 0;
        while (i < 2) {
            list = packageManager.queryIntentServices(intent, 0);
            if (list == null ? true : list.isEmpty()) {
                i++;
            } else {
                if (i > 0) {
                    Log.i("GcmNetworkManager", "validation query succeeded on try #2");
                }
                return list;
            }
        }
        return list;
    }
}
