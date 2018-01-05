package com.google.android.finsky.cg;

import android.support.v4.h.h;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.w;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import com.google.android.gms.herrevad.e;
import com.google.android.play.image.bf;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.b.j;
import com.google.android.play.utils.c.a;
import com.google.android.play.utils.c.b;
import com.google.android.play.utils.c.c;

public final class com.google.android.finsky.cg.d implements com.google.android.finsky.ba.f, com.google.android.gms.common.api.x
{

    public static int a;
    public static final long[] d;
    public com.google.android.finsky.ba.c b;
    public com.google.android.gms.common.api.o c;
    public com.google.android.finsky.cg.a e;

    static {
        com.google.android.finsky.cg.d.a = -1;
        com.google.android.finsky.cg.d.d = new long[9]{12604072, 12604073, 12604074, 12604075, 12604076, 12604164, 12604165, 12604166, 12604167};
    }

    d(com.google.android.finsky.ba.c p0) {
        ((com.google.android.finsky.cg.h)com.google.android.finsky.providers.d.a(com.google.android.finsky.cg.h)).a(this);
        this.b = p0;
        p0.dj().a(this);
        this.b();
    }

    public static int a() {
        if (((Integer)com.google.android.play.utils.b.j.B.b()).intValue() == 1)
            v0 = ((Integer)com.google.android.play.utils.b.j.C.b()).intValue();
        else if (((Integer)com.google.android.play.utils.b.j.B.b()).intValue() == 2)
            v0 = ((Integer)com.google.android.play.utils.b.j.D.b()).intValue();
        else if (((Integer)com.google.android.play.utils.b.j.B.b()).intValue() == 3)
            v0 = ((Integer)com.google.android.play.utils.b.j.E.b()).intValue();
        else if (((Integer)com.google.android.play.utils.b.j.B.b()).intValue() == 4)
            v0 = ((Integer)com.google.android.play.utils.b.j.F.b()).intValue();
        else
            v0 = 0;
        return v0 / 1000;
    }

    private static com.google.android.play.utils.c.c a(long p0) {
        if (p0 == 12604072)
            v1 = 0;
        else if (p0 == 12604073)
            v1 = 500;
        else if (p0 == 12604074)
            v1 = 1000;
        else if (p0 == 12604075)
            v1 = 1500;
        else if (p0 == 12604076)
            v1 = 2000;
        else if (p0 == 12604164)
            v1 = 2500;
        else if (p0 == 12604165)
            v1 = 3000;
        else if (p0 == 12604166)
            v1 = 3500;
        else {
            if (p0 != 12604167) {
                v0 = 0;
                return v0;
            }
            v1 = 4000;
        }
        v0 = new com.google.android.play.utils.c.a(new com.google.android.play.utils.c.b(v1, ((Float)com.google.android.finsky.aa.b.fL.b()).floatValue(), ((Integer)com.google.android.finsky.aa.b.fN.b()).intValue() + v1, ((Float)com.google.android.finsky.aa.b.fM.b()).floatValue()), ((Integer)com.google.android.finsky.aa.b.fO.b()).intValue());
        return v0;
    }

    private final synchronized void b() {
  0:    enter this;
 10:    v0 = 0;
 11:    if (v0 >= com.google.android.finsky.cg.d.d.length) goto 33;
 19:    if (!this.b.dj().a(com.google.android.finsky.cg.d.d[v0])) goto 30;
 21:    v0 = com.google.android.finsky.cg.d.a(com.google.android.finsky.cg.d.d[v0]);
 25:    com.google.android.play.image.bf.a(v0);
 28:    exit this;
 29:    return;
 30:    v0 = v0 + 1;
 32:    goto 11;
 33:    v0 = 0;
 34:    goto 25;
 36:    exit this;
 37:    throw ex;
 38:    try
            run 1...28
        catch (Throwable ex) {
  1:        goto 35;
        }
    }

    public final synchronized void a(android.support.v4.h.h p0, android.support.v4.h.h p1) {
  0:    v0 = 0;
  1:    enter this;
  5:    v1 = 0;
  6:    if (v1 >= com.google.android.finsky.cg.d.d.length) goto 25;
 14:    if (p1.c(com.google.android.finsky.cg.d.d[v1]) < 0) goto 22;
 17:    com.google.android.play.image.bf.a(0);
 20:    exit this;
 21:    return;
 22:    v1 = v1 + 1;
 24:    goto 6;
 28:    if (v0 >= com.google.android.finsky.cg.d.d.length) {
 20:        exit this;
 21:        return;
        }
 36:    if (p0.c(com.google.android.finsky.cg.d.d[v0]) < 0) goto 49;
 42:    com.google.android.play.image.bf.a(com.google.android.finsky.cg.d.a(com.google.android.finsky.cg.d.d[v0]));
 45:    goto 20;
 47:    exit this;
 48:    throw ex;
 49:    v0 = v0 + 1;
 51:    goto 28;
 52:    try
            run 25...45
        catch (Throwable ex) {
 25:        goto 46;
        }
 53:    try
            run 2...20
        catch (Throwable ex) {
  2:        goto 46;
        }
    }

    public final void a(com.google.android.gms.common.api.w p0) {
        if (((com.google.android.gms.herrevad.e)p0).b().a()) {
            v0 = ((com.google.android.gms.herrevad.e)p0).a();
            if (v0 == 0)
                v0 = -1;
            else
                v0 = v0.b;
            com.google.android.finsky.cg.d.a = v0;
        }
        else
            FinskyLog.d("Failed to fetch PredictedNetworkQuality", new Object[0]);
        if (this.c != 0) {
            this.c.g();
            this.c = 0;
        }
    }

    public final void a(boolean p0) {
    }

}
