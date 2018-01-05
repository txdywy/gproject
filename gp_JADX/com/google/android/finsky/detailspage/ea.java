package com.google.android.finsky.detailspage;

import android.graphics.Bitmap;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

final class ea implements y {
    public final /* synthetic */ int f14463a;
    public final /* synthetic */ int f14464b;
    public final /* synthetic */ dz f14465c;

    ea(dz dzVar, int i, int i2) {
        this.f14465c = dzVar;
        this.f14463a = i;
        this.f14464b = i2;
    }

    public final void m14223a(x xVar) {
        if (this.f14465c.f14450d != 2) {
            this.f14465c.f14452f[this.f14463a] = null;
            Bitmap b = xVar.b();
            if (b != null) {
                this.f14465c.f14457k[this.f14463a] = 2;
                this.f14465c.f14450d = 1;
                this.f14465c.f14454h[this.f14463a] = this.f14465c.m14207a(b);
                this.f14465c.u.mo3033a(this.f14465c, false);
            } else if (this.f14465c.m14212a(this.f14465c.t)) {
                this.f14465c.f14457k[this.f14463a] = 0;
                this.f14465c.u.mo3033a(this.f14465c, false);
            } else {
                dz dzVar = this.f14465c;
                int i = dzVar.f14458l + 1;
                dzVar.f14458l = i;
                if (i == this.f14464b) {
                    this.f14465c.f14450d = 3;
                    this.f14465c.u.mo3033a(this.f14465c, false);
                }
            }
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        m14223a((x) obj);
    }
}
