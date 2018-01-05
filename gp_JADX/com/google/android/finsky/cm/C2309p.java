package com.google.android.finsky.cm;

import android.graphics.Bitmap;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.utils.FinskyLog;

final class C2309p implements Runnable {
    public final /* synthetic */ String f11360a;
    public final /* synthetic */ long f11361b = 0;
    public final /* synthetic */ String f11362c;
    public final /* synthetic */ Bitmap f11363d;
    public final /* synthetic */ int f11364e;
    public final /* synthetic */ int f11365f;
    public final /* synthetic */ es f11366g;
    public final /* synthetic */ int f11367h;
    public final /* synthetic */ C2298e f11368i;

    C2309p(C2298e c2298e, String str, String str2, int i, int i2, es esVar, int i3) {
        this.f11368i = c2298e;
        this.f11360a = str;
        this.f11362c = str2;
        this.f11363d = null;
        this.f11364e = i;
        this.f11365f = i2;
        this.f11366g = esVar;
        this.f11367h = i3;
    }

    public final void run() {
        if (this.f11368i.f11332c.containsKey(this.f11360a)) {
            FinskyLog.m21665c("Cancelling already-existing session for %s", this.f11360a);
            this.f11368i.m11847c(this.f11360a);
        }
        try {
            this.f11368i.m11826a(this.f11360a, this.f11361b, this.f11362c, this.f11363d, this.f11364e, this.f11365f, this.f11366g, this.f11367h);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Couldn't create session for %s: %s", this.f11360a, e.getMessage());
        }
    }
}
