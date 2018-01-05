package com.google.android.finsky.setup;

import android.os.Bundle;
import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import java.util.concurrent.ExecutionException;

public final class bw {
    public final C1463g f20883a;
    public final bs f20884b;

    public bw(C1463g c1463g, bs bsVar) {
        this.f20883a = c1463g;
        this.f20884b = bsVar;
    }

    public final Bundle m19363a(String str, Exception exception, String str2, int i) {
        this.f20884b.mo3960b(str2, i);
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("reason", str);
        } else if ((exception instanceof VolleyError) || (exception instanceof InterruptedException)) {
            bundle2.putString("reason", "network_failure");
        } else {
            bundle2.putString("reason", "unknown");
        }
        if (exception != null) {
            bundle2.putString("exception_type", exception.getClass().getSimpleName());
        }
        bundle.putBundle("error", bundle2);
        return bundle;
    }

    public final Object m19364a(C1254c c1254c, ag agVar, String str) {
        try {
            return m19365b(c1254c, agVar, str);
        } catch (VolleyError e) {
            return null;
        } catch (InterruptedException e2) {
            return null;
        } catch (ExecutionException e3) {
            return null;
        }
    }

    public final Object m19365b(C1254c c1254c, ag agVar, String str) {
        Throwable e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Object obj = agVar.get();
            m19362a(-1, null, c1254c, elapsedRealtime);
            return obj;
        } catch (Throwable e2) {
            FinskyLog.m21669e("%s, %s", str, e2);
            m19362a(1, e2, c1254c, elapsedRealtime);
            throw e2;
        } catch (Throwable e3) {
            e2 = e3.getCause();
            FinskyLog.m21667d("%s: %s", str, e2);
            m19362a(1, e2, c1254c, elapsedRealtime);
            if (e2 instanceof VolleyError) {
                throw ((VolleyError) e2);
            }
            throw new RuntimeException(e3);
        }
    }

    private final void m19362a(int i, Throwable th, C1254c c1254c, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        bo e = C2482j.m13310e();
        e.m28992a(125);
        if (i != -1) {
            e.m28998b(i);
        }
        if (th != null) {
            e.m29000c(th.getClass().getSimpleName());
        }
        if (j != 0) {
            e.m28993a(elapsedRealtime);
        }
        this.f20883a.mo2242f(c1254c.mo1636c()).m13319a(e, null);
    }
}
