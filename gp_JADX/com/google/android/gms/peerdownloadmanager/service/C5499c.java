package com.google.android.gms.peerdownloadmanager.service;

import android.app.Service;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.C5372b;
import com.google.android.gms.peerdownloadmanager.common.C5382m;
import com.google.android.gms.peerdownloadmanager.common.C5383n;
import com.google.android.gms.peerdownloadmanager.common.C5385p;
import com.google.android.gms.peerdownloadmanager.p302f.C5494b;
import com.google.android.gms.peerdownloadmanager.p303g.C5496b;
import java.lang.reflect.Method;
import java.util.List;

final class C5499c {
    public static WakeLock f28266a;
    public static long f28267b;

    static void m26386a() {
        if (f28266a != null && f28266a.isHeld()) {
            f28266a.release();
        }
    }

    static void m26389a(Context context, C5494b c5494b) {
        C5496b c5496b = new C5496b(context);
        List<C5382m> a = c5496b.m26382a(null, null, false);
        Log.d("PdmTransfer", "needs: " + a.size());
        try {
            for (C5382m c5382m : a) {
                C5383n c5383n = c5382m.f27960a;
                c5494b.m26380a(f28267b, c5383n.f27964a.toString(), c5383n.f27965b, false);
            }
        } catch (Throwable e) {
            Log.w("PdmTransfer", "sqlite error, 1+ needs not logged", e);
        }
        c5496b.f28256a.close();
    }

    static void m26392b(Context context, C5494b c5494b) {
        C5496b c5496b = new C5496b(context);
        List<C5382m> a = c5496b.m26382a(null, null, true);
        Log.d("PdmTransfer", "assets: " + a.size());
        try {
            for (C5382m c5382m : a) {
                C5383n c5383n = c5382m.f27960a;
                c5494b.m26380a(f28267b, c5383n.f27964a.toString(), c5383n.f27965b, true);
            }
        } catch (Throwable e) {
            Log.w("PdmTransfer", "sqlite error, 1+ assets not logged", e);
        }
        c5496b.f28256a.close();
    }

    static void m26388a(Context context, int i, long j) {
        C5494b c5494b = new C5494b(context);
        float f = C5372b.m26136a(context).f27937a;
        Log.d("PdmTransfer", "end: " + f + " " + i + " " + j);
        C5385p c5385p = new C5385p();
        c5385p.f27968a = f28267b;
        c5385p.f27970c = System.currentTimeMillis();
        c5385p.f27972e = i;
        c5385p.f27973f = j;
        c5385p.f27974g = f;
        try {
            SQLiteDatabase writableDatabase = c5494b.f28255a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("run_id", Long.valueOf(c5385p.f27968a));
            contentValues.put("end_time", Long.valueOf(c5385p.f27970c));
            contentValues.put("shutdown_reason", Integer.valueOf(c5385p.f27972e));
            contentValues.put("shutdown_duration", Long.valueOf(c5385p.f27973f));
            contentValues.put("battery_percent_end", Float.valueOf(c5385p.f27974g));
            writableDatabase.insert("stop", null, contentValues);
        } catch (Throwable e) {
            Log.w("PdmTransfer", "sqlite error, end not logged", e);
        }
        c5494b.f28255a.close();
    }

    static boolean m26391a(WifiManager wifiManager) {
        if (wifiManager == null) {
            return false;
        }
        try {
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("isWifiApEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(wifiManager, null)).booleanValue();
        } catch (Throwable th) {
            Log.w("PdmTransfer", "isWifiApEnabled unavailable", th);
            return false;
        }
    }

    static boolean m26390a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            Method declaredMethod = connectivityManager.getClass().getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Throwable e) {
            Log.w("PdmTransfer", "getMobileDataEnabled unavailable", e);
            return false;
        }
    }

    static void m26387a(Service service) {
        service.stopForeground(true);
        Log.d("PdmTransfer", "demoted to background service");
    }
}
