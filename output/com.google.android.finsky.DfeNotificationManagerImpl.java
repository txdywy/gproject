package com.google.android.finsky;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.as.e;
import com.google.android.finsky.az.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.bn.h;
import com.google.android.finsky.by.l;
import com.google.android.finsky.ca.c;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.family.remoteescalation.a.a;
import com.google.android.finsky.family.remoteescalation.a.d;
import com.google.android.finsky.family.remoteescalation.a.e;
import com.google.android.finsky.family.remoteescalation.p;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.l.a;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.notification.d;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.c;
import com.google.android.finsky.utils.i;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ak;
import com.google.wireless.android.finsky.b.ab;
import com.google.wireless.android.finsky.b.t;
import com.google.wireless.android.finsky.b.w;
import com.google.wireless.android.finsky.dfe.j.a.b;
import com.google.wireless.android.finsky.dfe.j.a.c;
import com.google.wireless.android.finsky.dfe.j.a.e;
import com.google.wireless.android.finsky.dfe.j.a.f;
import com.google.wireless.android.finsky.dfe.j.a.g;
import com.google.wireless.android.finsky.dfe.j.a.i;
import java.util.ArrayList;
import java.util.List;

final class DfeNotificationManagerImpl implements com.google.android.finsky.api.i
{

    public static final List a;
    public final List b;
    public final List c;
    public final com.google.android.finsky.installer.k d;
    public final com.google.android.finsky.notification.ab e;
    public final Context f;
    public final com.google.android.finsky.l.a g;
    public final com.google.android.finsky.by.l h;
    public final com.google.android.finsky.accounts.c i;
    public final com.google.android.finsky.ca.c j;
    public final com.google.android.finsky.az.a k;
    public final com.google.android.finsky.dx.a l;
    public final com.google.android.finsky.d.a m;
    public final com.google.android.finsky.accounts.a n;
    public com.google.android.finsky.notification.d o;

    static {
        v0 = new Integer[6];
        v0[0] = Integer.valueOf(6);
        v0[1] = Integer.valueOf(10);
        v0[2] = Integer.valueOf(1);
        v0[3] = Integer.valueOf(2);
        v0[4] = Integer.valueOf(14);
        v0[5] = Integer.valueOf(8);
        DfeNotificationManagerImpl.a = com.google.android.finsky.utils.c.a(v0);
    }

    DfeNotificationManagerImpl(Context p0, com.google.android.finsky.installer.k p1, com.google.android.finsky.notification.ab p2, com.google.android.finsky.l.a p3, com.google.android.finsky.by.l p4, com.google.android.finsky.accounts.c p5, com.google.android.finsky.ca.c p6, com.google.android.finsky.az.a p7) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.l = com.google.android.finsky.m.a.au();
        this.m = com.google.android.finsky.m.a.aR();
        this.n = com.google.android.finsky.m.a.U();
        ((com.google.android.finsky.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.o)).a(this);
        this.d = p1;
        this.e = p2;
        this.f = p0;
        this.g = p3;
        this.h = p4;
        this.i = p5;
        this.j = p6;
        this.k = p7;
        this.c();
    }

    static void a(com.google.wireless.android.finsky.dfe.j.a.b p0) {
        v0 = "Error getting rich user notification.";
        if (p0.g() != 0) {
            if (p0.g().a & 1)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0) {
                v0 = String.valueOf("Error getting rich user notification.");
                v1 = p0.g().b;
                v0 = (String.valueOf(v0).length() + 11 + String.valueOf(v1).length()) + v0 + " [reason: " + v1 + "]";
            }
        }
        FinskyLog.d(v0, new Object[0]);
    }

    private final void a(com.google.wireless.android.finsky.dfe.j.a.e p0, String p1) {
        this.o.a(p0, p1);
    }

    private final void b() {
        if (!this.c.isEmpty()) {
            v0 = new ArrayList(this.c);
            v1 = com.google.android.finsky.m.a.cZ();
            if (v1 == 0) {
                v2 = new Object[1];
                v2[0] = v0;
                FinskyLog.c("Current account null, not ack'ing notifications: [%s]", v2);
            }
            else
                com.google.android.finsky.m.a.b(v1).a(v0, new com.google.android.finsky.j(this, v0), new com.google.android.finsky.k(v0));
        }
    }

    private final void c() {
        v0 = (String)com.google.android.finsky.aa.a.A.a();
        if (!TextUtils.isEmpty(v0)) {
            v1 = com.google.android.finsky.utils.k.a(v0);
            v0 = 0;
            while (v0 < v1.length) {
                this.c.add(v1[v0]);
                this.b.add(v1[v0]);
                v0 = v0 + 1;
            }
        }
    }

    static boolean d(com.google.wireless.android.finsky.b.ab p0) {
        if (!TextUtils.isEmpty(p0.h)) {
            com.google.android.finsky.m.a.cw().a(p0.h);
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

    static boolean e(com.google.wireless.android.finsky.b.ab p0) {
        if (TextUtils.isEmpty(p0.h))
            v7 = com.google.android.finsky.m.a.cZ();
        else
            v7 = p0.h;
        com.google.android.finsky.family.remoteescalation.p.a(v7, p0.u);
        v5 = new com.google.android.finsky.family.remoteescalation.a.a(com.google.android.finsky.m.a.b, v7, com.google.android.finsky.family.remoteescalation.a.d.e, com.google.android.finsky.family.remoteescalation.a.d.e.b.a(0));
        v5.d.a(((Long)com.google.android.finsky.aa.a.aW.b(v5.c).a()).longValue(), p0.u, v5, v5);
        if (com.google.android.finsky.family.remoteescalation.a.d.e.d != 0)
            com.google.android.finsky.family.remoteescalation.a.d.e.d.a(p0.c, v7);
        return 1;
    }

    final void a() {
        if (this.c.isEmpty())
            com.google.android.finsky.aa.a.A.c();
        else if (this.c.size() == 1)
            com.google.android.finsky.aa.a.A.a((String)this.c.get(0));
        else
            com.google.android.finsky.aa.a.A.a(com.google.android.finsky.utils.k.a(this.c));
    }

    public final void a(com.google.wireless.android.finsky.b.ab p0) {
        if (!com.google.android.finsky.m.a.O().a()) {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(p0.c);
            FinskyLog.a("Dropping notification type=%d because store type invalid", v1);
        }
        else if (Looper.myLooper() == Looper.getMainLooper() && this.g.b.b())
            this.b(p0);
        else
            this.g.a(new com.google.android.finsky.b(this, p0));
    }

    final void a(com.google.wireless.android.finsky.dfe.j.a.f p0, com.google.android.finsky.cv.a.ax p1, String p2) {
        if (p1 != 0)
            v0 = p1.d;
        else
            v0 = 0;
        this.e.a(p0, v0, this.m.a(0));
        if (p0.n != 0)
            this.a(p0.n, p2);
    }

    final void a(com.google.wireless.android.finsky.dfe.j.a.g p0) {
        this.m.a(0).a(new com.google.android.finsky.d.c(3102).a(p0.b).a, 0);
    }

    final void a(com.google.wireless.android.finsky.dfe.j.a.i p0, String p1) {
        this.m.a(0).a(new com.google.android.finsky.d.c(3101).a(p0.c).a, 0);
        if (p0.b != 0)
            this.a(p0.b, p1);
    }

    final void b(com.google.wireless.android.finsky.b.ab p0) {
 11:    if (this.b.contains(p0.d)) {
 15:        v2 = new Object[1];
 17:        v2[0] = p0.d;
 19:        FinskyLog.a("Notification [%s] ignored, already handled.", v2);
 22:        this.b();
 25:        return;
        }
 38:    if (((Boolean)com.google.android.finsky.aa.b.hG.b()).booleanValue() && DfeNotificationManagerImpl.a.contains(Integer.valueOf(p0.c)) && !this.n.c(p0.h)) {
 66:        v2 = new Object[2];
 68:        v2[0] = p0.d;
 72:        v2[1] = p0.h;
 74:        FinskyLog.a("Notification [%s] ignored, unknown account %s", v2);
 77:        this.f(p0);
 80:        return;
        }
 83:    v2 = new Object[2];
 91:    v2[0] = Integer.valueOf(p0.c);
 93:    v2[1] = p0.d;
 95:    FinskyLog.a("Handling notification type=[%s], id=[%s]", v2);
101:    v6 = this.m.a(0);
118:    if (com.google.android.finsky.m.a.dj().a(12638123)) {
122:        v0 = new com.google.wireless.android.a.a.a.a.ak();
127:        v0.a(p0.c);
141:        v6.a(new com.google.android.finsky.d.c(2800).a(v0));
        }
152:    v1 = new com.google.android.finsky.c(this, p0, com.google.android.finsky.utils.i.b(), v6);
157:    if (p0.i == 0) {
217:        v1.run();
220:        return;
        }
163:    v2 = this.i.e(p0.h);
167:    if (v2 == 0) goto 287;
173:    FinskyLog.a("Processing notification library update.", new Object[0]);
181:    v0 = 0;
182:    if (v0 >= p0.i.g.length) goto 225;
192:    if (!com.google.android.finsky.dfemodel.q.a(p0.i.g[v0].c)) goto 222;
196:    v4 = new Object[1];
202:    v4[0] = p0.i.g[v0].c.b;
204:    FinskyLog.a("Encountered IAB item in notification: %s.", v4);
207:    v0 = 1;
208:    if (v0 == 0) {
278:        v5 = new w[1];
280:        v5[0] = p0.i;
282:        this.h.a(v2, (String.valueOf(p0.d).length() + 39) + "notification (type=[" + p0.c + "],id=[" + p0.d + "])", v1, v5);
285:        return;
        }
214:    FinskyLog.e("Ignoring notification LibraryUpdate with IAB mutations.", new Object[0]);
217:    v1.run();
220:    return;
222:    v0 = v0 + 1;
224:    goto 182;
225:    v0 = 0;
226:    goto 208;
291:    FinskyLog.a("Could not process library update for unknown account.", new Object[0]);
294:    goto 217;
    }

    final boolean c(com.google.wireless.android.finsky.b.ab p0) {
        v0 = 0;
        v2 = this.n.b(p0.h);
        if (v2 == 0) {
            v3 = new Object[2];
            v3[0] = p0.d;
            v3[1] = FinskyLog.a(p0.h);
            FinskyLog.d("UserSettingsDirty notification has invalid account: id=%s, account=%s", v3);
        }
        else {
            if (p0.p != 0) {
                v5 = new lf[1];
                v5[0] = p0.p;
                this.l.a(v2.name, v5);
            }
            else
                this.l.a(v2.name, 7);
            v0 = 1;
        }
        return v0;
    }

    final void f(com.google.wireless.android.finsky.b.ab p0) {
        this.b.add(p0.d);
        if (p0.q != 0) {
            while (this.c.size() >= 10)
                this.c.remove(0);
            this.c.add(p0.d);
            this.a();
            this.b();
        }
    }

}
