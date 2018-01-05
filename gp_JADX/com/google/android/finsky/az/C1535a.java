package com.google.android.finsky.az;

import android.os.SystemClock;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.C4774e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class C1535a {
    public final C4774e f8270a;
    public Map f8271b = new ConcurrentHashMap();

    public C1535a(C4774e c4774e) {
        this.f8270a = c4774e;
    }

    public final synchronized void m8965a(String str, String str2, long j) {
        if (str != null) {
            C0954a.aK.m5777b(str).m5763a((Object) str2);
            C0954a.aL.m5777b(str).m5763a(Long.valueOf(SystemClock.elapsedRealtime()));
            C0954a.aM.m5777b(str).m5763a(Long.valueOf(j));
            FinskyLog.m21659a("Received new enterprise store token: account= %s, token=%s, ttl=%d", str, str2, Long.valueOf(j));
            this.f8270a.mo4382b(new C1536b(this, str), "new_enterprise_token");
        }
    }

    public final synchronized String m8964a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = (String) C0954a.aK.m5777b(str).m5760a();
            if (str2 == null) {
                str2 = null;
            } else {
                long longValue = ((Long) C0954a.aL.m5777b(str).m5760a()).longValue();
                long longValue2 = ((Long) C0954a.aM.m5777b(str).m5760a()).longValue();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > longValue + longValue2 || (elapsedRealtime < longValue && elapsedRealtime > longValue2)) {
                    C0954a.aK.m5777b(str).m5765c();
                    str2 = null;
                }
            }
        }
        return str2;
    }

    public final synchronized boolean m8966b(String str) {
        boolean z;
        if (str == null) {
            z = false;
        } else if (this.f8271b.containsKey(str) && ((Boolean) this.f8271b.get(str)).booleanValue()) {
            this.f8271b.put(str, Boolean.valueOf(false));
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
