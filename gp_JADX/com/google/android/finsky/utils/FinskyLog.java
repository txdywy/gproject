package com.google.android.finsky.utils;

import android.util.Log;
import com.google.android.flib.log.C4878a;
import com.google.android.flib.log.WhatATerribleException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class FinskyLog {
    public static final SimpleDateFormat f24021a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    public static final List f24022b = new ArrayList();
    public static long f24023c = System.currentTimeMillis();
    public static C1474r f24024d;

    public static void m21657a(C1474r c1474r) {
        f24024d = c1474r;
    }

    public static void m21659a(String str, Object... objArr) {
        C4878a.m22887a("Finsky", str, objArr);
        m21666c(null, str, objArr);
    }

    public static void m21662b(String str, Object... objArr) {
        C4878a.m22892b("Finsky", str, objArr);
        m21666c(null, str, objArr);
    }

    public static void m21665c(String str, Object... objArr) {
        C4878a.m22895c("Finsky", str, objArr);
        m21666c(null, str, objArr);
    }

    public static void m21667d(String str, Object... objArr) {
        C4878a.m22896d("Finsky", str, objArr);
        m21666c(null, str, objArr);
    }

    public static void m21660a(Throwable th, String str, Object... objArr) {
        C4878a.m22888a("Finsky", th, str, objArr);
        m21666c(th, str, objArr);
    }

    private static boolean m21664b() {
        return f24024d.dv();
    }

    public static void m21669e(String str, Object... objArr) {
        m21666c(null, str, objArr);
        if (m21664b()) {
            C4878a.m22896d("Finsky", str, objArr);
            throw new WhatATerribleException(String.format(str, objArr));
        } else {
            C4878a.m22897e("Finsky", str, objArr);
        }
    }

    public static void m21663b(Throwable th, String str, Object... objArr) {
        m21666c(th, str, objArr);
        if (m21664b()) {
            C4878a.m22888a("Finsky", th, str, objArr);
            throw new WhatATerribleException(String.format(str, objArr), th);
        } else {
            C4878a.m22893b("Finsky", th, str, objArr);
        }
    }

    public static String m21655a(String str) {
        return C4878a.m22886a((Object) str, f24024d.dw());
    }

    public static void m21656a() {
        f24023c = System.currentTimeMillis();
    }

    public static void m21670f(String str, Object... objArr) {
        if (Log.isLoggable("Finsky", 2)) {
            String format = String.format(Locale.US, str, objArr);
            Object[] objArr2 = new Object[]{Long.valueOf(System.currentTimeMillis() - f24023c), format};
        }
    }

    private static void m21666c(Throwable th, String str, Object[] objArr) {
        if (f24024d.dx()) {
            m21668d(th, str, objArr);
        }
    }

    private static synchronized void m21668d(Throwable th, String str, Object[] objArr) {
        synchronized (FinskyLog.class) {
            for (C4686s a : f24022b) {
                a.mo4331a(th, str, objArr);
            }
        }
    }

    public static synchronized void m21658a(C4686s c4686s) {
        synchronized (FinskyLog.class) {
            f24022b.remove(c4686s);
        }
    }

    public static synchronized void m21661b(C4686s c4686s) {
        synchronized (FinskyLog.class) {
            f24022b.add(c4686s);
        }
    }

    static {
        C4878a.m22891a();
        C4878a.m22894b();
    }
}
