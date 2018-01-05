package com.google.android.finsky.uninstall;

import android.app.ActivityManager;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class bn extends AsyncTask {
    public final /* synthetic */ Method f23581a;
    public final /* synthetic */ ActivityManager f23582b;
    public final /* synthetic */ bl f23583c;

    bn(bl blVar, Method method, ActivityManager activityManager) {
        this.f23583c = blVar;
        this.f23581a = method;
        this.f23582b = activityManager;
    }

    private final Map m21387a() {
        try {
            Class cls = Class.forName("com.android.internal.os.PkgUsageStats");
            Field declaredField = cls.getDeclaredField("componentResumeTimes");
            Field declaredField2 = cls.getDeclaredField("packageName");
            Object[] objArr = (Object[]) this.f23581a.invoke(this.f23582b, new Object[0]);
            Map hashMap = new HashMap();
            for (Object obj : objArr) {
                long j = 0;
                for (Long longValue : ((HashMap) declaredField.get(obj)).values()) {
                    j = Math.max(j, longValue.longValue());
                }
                hashMap.put((String) declaredField2.get(obj), Long.valueOf(j));
            }
            return hashMap;
        } catch (Exception e) {
            FinskyLog.m21665c("Unable to invoke method: %s", e.getMessage());
            this.f23583c.m21379a(1509);
            return Collections.emptyMap();
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        synchronized (this) {
            this.f23583c.f23572c = map;
        }
        if (this.f23583c.f23571a != null) {
            this.f23583c.f23571a.mo4284d();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m21387a();
    }
}
