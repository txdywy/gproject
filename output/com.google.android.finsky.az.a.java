package com.google.android.finsky.az;

import android.os.SystemClock;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final synchronized class com.google.android.finsky.az.a
{

    public final com.google.android.finsky.volley.e a;
    public Map b;

    a(com.google.android.finsky.volley.e p0) {
        this.b = new ConcurrentHashMap();
        this.a = p0;
    }

    public final synchronized String a(String p0) {
        enter this;
        if (p0 == 0)
            v0 = 0;
        else {
            try {
                v0 = (String)com.google.android.finsky.aa.a.aK.b(p0).a();
                if (v0 == 0)
                    v0 = 0;
                else {
                    v4 = ((Long)com.google.android.finsky.aa.a.aL.b(p0).a()).longValue();
                    v6 = ((Long)com.google.android.finsky.aa.a.aM.b(p0).a()).longValue();
                    v8 = SystemClock.elapsedRealtime();
                    if (v8 > v4 + v6 || v8 < v4 && v8 > v6) {
                        com.google.android.finsky.aa.a.aK.b(p0).c();
                        v0 = 0;
                    }
                }
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
        }
        exit this;
        return v0;
    }

    public final synchronized void a(String p0, String p1, long p2) {
        enter this;
        if (p0 != 0) {
            try {
                com.google.android.finsky.aa.a.aK.b(p0).a(p1);
                com.google.android.finsky.aa.a.aL.b(p0).a(Long.valueOf(SystemClock.elapsedRealtime()));
                com.google.android.finsky.aa.a.aM.b(p0).a(Long.valueOf(p2));
                v1 = new Object[3];
                v1[0] = p0;
                v1[1] = p1;
                v1[2] = Long.valueOf(p2);
                FinskyLog.a("Received new enterprise store token: account= %s, token=%s, ttl=%d", v1);
                this.a.b(new com.google.android.finsky.az.b(this, p0), "new_enterprise_token");
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
        }
        exit this;
    }

    public final synchronized boolean b(String p0) {
        enter this;
        if (p0 == 0)
            v0 = 0;
        else {
            try {
                if (this.b.containsKey(p0) && ((Boolean)this.b.get(p0)).booleanValue()) {
                    this.b.put(p0, Boolean.valueOf(0));
                    v0 = 1;
                }
                else
                    v0 = 0;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
        }
        exit this;
        return v0;
    }

}
