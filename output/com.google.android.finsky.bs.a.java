package com.google.android.finsky.bs;

import android.support.v4.os.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.d;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.installqueue.k;
import com.google.android.finsky.r.a;
import com.google.android.finsky.r.b;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.bs.a implements com.google.android.finsky.r.c
{

    public final com.google.android.finsky.ba.c a;
    public final com.google.android.finsky.r.a b;

    a(com.google.android.finsky.ba.c p0, com.google.android.finsky.r.a p1) {
        this.a = p0;
        this.b = p1;
    }

    public static boolean a() {
        if (!((Boolean)com.google.android.finsky.aa.b.gy.b()).booleanValue())
            v0 = 0;
        else if (android.support.v4.os.a.b())
            v0 = 0;
        else
            v0 = 1;
        return v0;
    }

    public final void a(com.google.android.finsky.r.b p0) {
 15:    if (!"com.google.android.instantapps.supervisor".equals(p0.a.cf()))
 17:        return;
 22:    p0.l = p0.l | 1;
 28:    p0.k = p0.k | 1;
 32:    this.a.dj();
 39:    if (!com.google.android.finsky.bs.a.a()) {
 45:        p0.h = p0.h | 256;
 47:        return;
        }
 50:    if (p0.c != 0 && p0.c.b == 2) {
 62:        p0.h = p0.h | 4;
 64:        return;
        }
 80:    p0.e = new com.google.android.finsky.installqueue.j(p0.d.a("auto_update"), p0.a);
 87:    p0.f = new com.google.android.finsky.installqueue.d();
102:    if (this.a.dj().a(12630207))
108:        p0.e.a(com.google.android.finsky.installqueue.k.c);
        else
215:        p0.e.a(com.google.android.finsky.installqueue.k.b);
113:    p0.g = 68;
127:    if (((Boolean)com.google.android.finsky.aa.b.du.b()).booleanValue())
133:        p0.g = p0.g | 128;
148:    if (!this.a.dj().a(12633462)) goto 219;
156:    if (!this.b.b()) goto 219;
160:    if (p0.c == 0) goto 219;
170:    v2 = System.currentTimeMillis() - p0.c.D;
173:    if (p0.c.D < 0) goto 219;
177:    if (v2 < 0) goto 219;
193:    if (v2 >= ((Long)com.google.android.finsky.aa.b.gY.b()).longValue()) goto 219;
195:    v0 = 1;
196:    if (v0 != 0) {
202:        p0.g = p0.g | 272;
206:        p0.f.a(2);
        }
209:    return;
219:    v0 = 0;
220:    goto 196;
    }

}
