package com.google.android.finsky.cl;

import a.a;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.TimeWindow;
import com.google.android.finsky.installqueue.d;
import com.google.android.finsky.installqueue.f;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.android.finsky.utils.i;
import com.google.android.finsky.z.e;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.l.a.a;
import com.google.wireless.android.finsky.dfe.l.a.b;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.cl.a implements com.android.volley.x
{

    public a.a a;

    a(a.a p0) {
        this.a = p0;
    }

    public static InstallRequest a(InstallRequest p0, com.google.wireless.android.finsky.dfe.l.a.a p1) {
        v1 = new com.google.android.finsky.installqueue.d().a(3);
        v1.b = new TimeWindow(TimeUnit.SECONDS.toMillis(p1.e), TimeUnit.SECONDS.toMillis(p1.f));
        v3 = new InstallConstraint[2];
        v3[0] = new com.google.android.finsky.installqueue.d().a(2).e();
        v3[1] = v1.e();
        return new com.google.android.finsky.installqueue.j(p0).a(1).a(v3).a("offpeak").a();
    }

    public static com.google.wireless.android.finsky.dfe.l.a.a a() {
        v0 = (String)com.google.android.finsky.aa.a.aV.a();
        if (TextUtils.isEmpty(v0))
            v0 = 0;
        else {
            v2 = new com.google.wireless.android.finsky.dfe.l.a.b();
            if (com.google.android.finsky.utils.ab.a(v0, v2))
                v0 = v2;
            else {
                FinskyLog.e("Could not de-serialize the cached DataPlanResponse.", new Object[0]);
                v0 = 0;
            }
        }
        if (v0 == 0) {
            FinskyLog.c("Cannot get next flex time window. Cache is empty.", new Object[0]);
            v0 = 0;
        }
        else {
            v6 = com.google.android.finsky.utils.i.a();
            v3 = 0;
            while (v3 < v0.a.length) {
                v2 = v0.a[v3];
                if (v6 < v2.f) {
                    if (v2.f - v6 >= TimeUnit.MINUTES.toSeconds((long)((Integer)com.google.android.finsky.aa.b.id.b()).intValue()))
                        v0 = 1;
                    else
                        v0 = 0;
                    if (v0 != 0) {
                        v0 = v2;
                        return v0;
                    }
                }
                v3 = v3 + 1;
            }
            v0 = 0;
        }
        return v0;
    }

    public final void b_(Object p0) {
        v1 = com.google.android.finsky.cl.a.a();
        if (v1 != 0) {
            v0 = new com.google.android.finsky.installqueue.f().a("offpeak");
            v0.b = Collections.singleton(Integer.valueOf(0));
            ((com.google.android.finsky.installqueue.g)this.a.a()).a(v0.a()).a(new com.google.android.finsky.cl.b(this, v1));
        }
    }

}
