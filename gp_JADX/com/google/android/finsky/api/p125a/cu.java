package com.google.android.finsky.api.p125a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.C0656n;
import com.android.volley.C0684b;
import com.android.volley.C0691y;
import com.android.volley.C0692g;
import com.android.volley.C0697m;
import com.android.volley.C0704v;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

public final class cu implements C0691y {
    public final C0692g f7507a = new C0692g(this.f7508b);
    public final Handler f7508b = new Handler(Looper.getMainLooper());

    public final void mo1081a(C0656n c0656n, C0704v c0704v) {
        m7381b(c0656n, c0704v, null);
    }

    public final void mo1082a(C0656n c0656n, C0704v c0704v, Runnable runnable) {
        if (!(c0656n instanceof cp)) {
            m7381b(c0656n, c0704v, runnable);
        } else if (runnable == null) {
            m7381b(c0656n, c0704v, runnable);
        } else {
            C0684b c0684b = c0656n.f4039n;
            if (c0684b == null || c0684b.f4137g == null) {
                FinskyLog.m21669e("Soft/Firm TTL request posted response without cache entry.", new Object[0]);
                m7381b(c0656n, c0704v, runnable);
                return;
            }
            String str = (String) c0684b.f4137g.get("Cache-Firm-TTL");
            String str2 = (String) c0684b.f4137g.get("X-DFE-Firm-Rpc-Timeout");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                ((cp) c0656n).m7355a(2);
                m7381b(c0656n, c0704v, runnable);
                return;
            }
            long parseLong = Long.parseLong(str);
            long parseLong2 = Long.parseLong(str2);
            if (parseLong == 0 || parseLong >= System.currentTimeMillis() || parseLong2 <= 0) {
                ((cp) c0656n).m7355a(2);
                m7381b(c0656n, c0704v, runnable);
                return;
            }
            c0656n.m4366a("firm-ttl-hit");
            c0704v.f4194d = false;
            ((cp) c0656n).f7481U = true;
            this.f7508b.post(runnable);
            this.f7508b.postDelayed(new cv(this, c0656n, c0704v), parseLong2);
        }
    }

    public final void mo1080a(C0656n c0656n, VolleyError volleyError) {
        C0684b c0684b = c0656n.f4039n;
        synchronized (c0656n) {
            if (c0684b != null) {
                if (!(c0684b.m4487a() || !(c0656n instanceof cp) || c0656n.mo1539q())) {
                    c0656n.m4366a("error-on-firmttl");
                    m7381b(c0656n, ((cp) c0656n).mo1055a(new C0697m(c0684b.f4131a, c0684b.f4137g)), null);
                    return;
                }
            }
            this.f7507a.mo1080a(c0656n, volleyError);
        }
    }

    private final void m7381b(C0656n c0656n, C0704v c0704v, Runnable runnable) {
        synchronized (c0656n) {
            this.f7507a.mo1082a(c0656n, c0704v, runnable);
        }
    }
}
