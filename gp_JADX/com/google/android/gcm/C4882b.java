package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public final class C4882b {
    public static GCMBroadcastReceiver f25235a;
    public static String f25236b;

    public static void m22905a(Context context, String... strArr) {
        String a = C4882b.m22902a(strArr);
        Log.v("GCMRegistrar", "Registering app " + context.getPackageName() + " of senders " + a);
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra("sender", a);
        context.startService(intent);
    }

    static String m22902a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringBuilder = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            stringBuilder.append(',').append(strArr[i]);
        }
        return stringBuilder.toString();
    }

    static synchronized void m22903a(Context context) {
        synchronized (C4882b.class) {
            if (f25235a == null) {
                if (f25236b == null) {
                    Log.e("GCMRegistrar", "internal error: retry receiver class not set yet");
                    f25235a = new GCMBroadcastReceiver();
                } else {
                    try {
                        f25235a = (GCMBroadcastReceiver) Class.forName(f25236b).newInstance();
                    } catch (Exception e) {
                        Log.e("GCMRegistrar", "Could not create instance of " + f25236b + ". Using " + GCMBroadcastReceiver.class.getName() + " directly.");
                        f25235a = new GCMBroadcastReceiver();
                    }
                }
                String packageName = context.getPackageName();
                IntentFilter intentFilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
                intentFilter.addCategory(packageName);
                packageName = packageName + ".permission.C2D_MESSAGE";
                Log.v("GCMRegistrar", "Registering receiver");
                context.registerReceiver(f25235a, intentFilter, packageName, null);
            }
        }
    }

    public static String m22906b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gcm", 0);
        String string = sharedPreferences.getString("regId", "");
        int i = sharedPreferences.getInt("appVersion", Integer.MIN_VALUE);
        int d = C4882b.m22908d(context);
        if (i == Integer.MIN_VALUE || i == d) {
            return string;
        }
        Log.v("GCMRegistrar", "App version changed from " + i + " to " + d + "; resetting registration id");
        C4882b.m22901a(context, "");
        return "";
    }

    static String m22901a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gcm", 0);
        String string = sharedPreferences.getString("regId", "");
        int d = C4882b.m22908d(context);
        Log.v("GCMRegistrar", "Saving regId on app version " + d);
        Editor edit = sharedPreferences.edit();
        edit.putString("regId", str);
        edit.putInt("appVersion", d);
        edit.commit();
        return string;
    }

    private static int m22908d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Coult not get package name: " + e);
        }
    }

    public static void m22907c(Context context) {
        Log.d("GCMRegistrar", "resetting backoff for " + context.getPackageName());
        C4882b.m22904a(context, 3000);
    }

    static void m22904a(Context context, int i) {
        Editor edit = context.getSharedPreferences("com.google.android.gcm", 0).edit();
        edit.putInt("backoff_ms", i);
        edit.commit();
    }
}
