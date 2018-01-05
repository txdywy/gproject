package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.a.w;
import android.support.v4.h.u;
import android.util.Log;
import java.util.LinkedList;
import java.util.Queue;

public final class C7143q {
    public static C7143q f34888a;
    public final u f34889b = new u();
    public Boolean f34890c = null;
    public final Queue f34891d = new LinkedList();
    public Queue f34892e = new LinkedList();

    private C7143q() {
    }

    public static synchronized C7143q m32400a() {
        C7143q c7143q;
        synchronized (C7143q.class) {
            if (f34888a == null) {
                f34888a = new C7143q();
            }
            c7143q = f34888a;
        }
        return c7143q;
    }

    private final int m32401b(Context context, Intent intent) {
        String str;
        ComponentName a;
        synchronized (this.f34889b) {
            str = (String) this.f34889b.get(intent.getAction());
        }
        if (str == null) {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null || resolveService.serviceInfo == null) {
                Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                if (this.f34890c == null) {
                    this.f34890c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
                }
                if (this.f34890c.booleanValue()) {
                    a = w.a(context, intent);
                } else {
                    a = context.startService(intent);
                    Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                }
                if (a == null) {
                    return -1;
                }
                Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                String str2 = serviceInfo.packageName;
                str = serviceInfo.name;
                Log.e("FirebaseInstanceId", new StringBuilder((String.valueOf(str2).length() + 94) + String.valueOf(str).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(str2).append("/").append(str).toString());
                if (this.f34890c == null) {
                    if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    }
                    this.f34890c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
                }
                if (this.f34890c.booleanValue()) {
                    a = context.startService(intent);
                    Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                } else {
                    a = w.a(context, intent);
                }
                if (a == null) {
                    return -1;
                }
                Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            str = serviceInfo.name;
            if (str.startsWith(".")) {
                String valueOf = String.valueOf(context.getPackageName());
                str = String.valueOf(str);
                str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            }
            synchronized (this.f34889b) {
                this.f34889b.put(intent.getAction(), str);
            }
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            str2 = "FirebaseInstanceId";
            String str3 = "Restricting intent to a specific service: ";
            valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        intent.setClassName(context.getPackageName(), str);
        try {
            if (this.f34890c == null) {
                if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                }
                this.f34890c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            }
            if (this.f34890c.booleanValue()) {
                a = w.a(context, intent);
            } else {
                a = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (a == null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (Throwable e) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            str = String.valueOf(e2);
            Log.e("FirebaseInstanceId", new StringBuilder(String.valueOf(str).length() + 45).append("Failed to start service while in background: ").append(str).toString());
            return 402;
        }
    }

    public final int m32402a(Context context, String str, Intent intent) {
        Object obj = -1;
        switch (str.hashCode()) {
            case -842411455:
                if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
                    obj = null;
                    break;
                }
                break;
            case 41532704:
                if (str.equals("com.google.firebase.MESSAGING_EVENT")) {
                    obj = 1;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                this.f34891d.offer(intent);
                break;
            case 1:
                this.f34892e.offer(intent);
                break;
            default:
                String str2 = "FirebaseInstanceId";
                String str3 = "Unknown service action: ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return 500;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return m32401b(context, intent2);
    }

    public final void m32403a(Context context, Intent intent) {
        m32402a(context, "com.google.firebase.INSTANCE_ID_EVENT", intent);
    }
}
