package com.google.android.finsky.cm;

import android.graphics.Bitmap;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.utils.FinskyLog;

final class C2310q implements Runnable {
    public final /* synthetic */ String f11369a;
    public final /* synthetic */ long f11370b;
    public final /* synthetic */ String f11371c;
    public final /* synthetic */ Bitmap f11372d = null;
    public final /* synthetic */ int f11373e;
    public final /* synthetic */ int f11374f;
    public final /* synthetic */ es f11375g;
    public final /* synthetic */ int f11376h;
    public final /* synthetic */ C2298e f11377i;

    C2310q(C2298e c2298e, String str, long j, String str2, int i, int i2, es esVar, int i3) {
        this.f11377i = c2298e;
        this.f11369a = str;
        this.f11370b = j;
        this.f11371c = str2;
        this.f11373e = i;
        this.f11374f = i2;
        this.f11375g = esVar;
        this.f11376h = i3;
    }

    public final void run() {
        try {
            if (this.f11377i.f11332c.containsKey(this.f11369a)) {
                FinskyLog.m21659a("Session for %s already exists, skipping creation", this.f11369a);
                return;
            }
            this.f11377i.m11826a(this.f11369a, this.f11370b, this.f11371c, this.f11372d, this.f11373e, this.f11374f, this.f11375g, this.f11376h);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Couldn't create session for %s: %s", this.f11369a, e.getMessage());
        }
    }
}
