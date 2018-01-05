package com.google.android.finsky.cg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.herrevad.C5246c;
import java.util.ArrayList;
import java.util.List;

public final class C2278e extends BroadcastReceiver {
    public static final List f11283a = new ArrayList();
    public static final Object f11284b = new Object();
    public static NetworkInfo f11285c;
    public C2277d f11286d;

    public C2278e() {
        ((C1365h) C3947d.m18649a(C1365h.class)).mo1782a(this);
    }

    public final void onReceive(Context context, Intent intent) {
        int i = 1;
        C2278e.m11748b(context);
        if (this.f11286d != null) {
            int i2;
            C1643x c1643x = this.f11286d;
            bb.m21791a();
            C1552e dj = c1643x.f11280b.dj();
            for (long a : C2277d.f11279d) {
                if (dj.mo2294a(a)) {
                    i2 = 1;
                    break;
                }
            }
            i2 = 0;
            if (i2 == 0) {
                dj = c1643x.f11282e.f11275e.dj();
                for (long a2 : C2274a.f11271a) {
                    if (dj.mo2294a(a2)) {
                        break;
                    }
                }
                i = 0;
                if (i == 0) {
                    FinskyLog.m21659a("Network quality prediction is disabled", new Object[0]);
                }
            }
            if (c1643x.f11281c == null) {
                c1643x.f11281c = new C5089p(context.getApplicationContext()).m23647a(C5246c.f26375c).m23652b();
            }
            c1643x.f11281c.mo4557e();
            C5246c.f26376d.mo4723a(c1643x.f11281c).mo4490a(c1643x);
        }
        for (int size = f11283a.size() - 1; size >= 0; size--) {
            ((C2267f) f11283a.get(size)).mo2832a(context);
        }
    }

    public static NetworkInfo m11746a(Context context) {
        NetworkInfo networkInfo;
        synchronized (f11284b) {
            if (f11285c == null) {
                C2278e.m11748b(context);
            }
            networkInfo = f11285c;
        }
        return networkInfo;
    }

    public static void m11747a() {
        synchronized (f11284b) {
            f11285c = null;
        }
    }

    private static void m11748b(Context context) {
        synchronized (f11284b) {
            f11285c = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }
}
