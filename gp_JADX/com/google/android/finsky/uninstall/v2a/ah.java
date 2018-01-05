package com.google.android.finsky.uninstall.v2a;

import android.app.ActivityManager;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class ah extends AsyncTask {
    public final /* synthetic */ Method f23729a;
    public final /* synthetic */ ActivityManager f23730b;
    public final /* synthetic */ af f23731c;

    ah(af afVar, Method method, ActivityManager activityManager) {
        this.f23731c = afVar;
        this.f23729a = method;
        this.f23730b = activityManager;
    }

    private final Map m21466a() {
        try {
            Class cls = Class.forName("com.android.internal.os.PkgUsageStats");
            Field declaredField = cls.getDeclaredField("componentResumeTimes");
            Field declaredField2 = cls.getDeclaredField("packageName");
            Object[] objArr = (Object[]) this.f23729a.invoke(this.f23730b, new Object[0]);
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
            this.f23731c.m21459a(1509);
            return Collections.emptyMap();
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        synchronized (this) {
            this.f23731c.f23720c = map;
        }
        if (this.f23731c.f23719a != null) {
            this.f23731c.f23719a.mo4308h();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m21466a();
    }
}
