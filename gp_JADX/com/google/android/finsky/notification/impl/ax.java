package com.google.android.finsky.notification.impl;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cv.p177a.gf;
import com.google.android.finsky.cv.p177a.gg;
import com.google.android.finsky.cv.p177a.gi;
import com.google.android.finsky.cv.p177a.js;
import com.google.android.finsky.notification.C3778a;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3782f;
import com.google.android.finsky.notification.C3816o;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.notification.ac;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.j.a.d;
import com.google.wireless.android.finsky.dfe.j.a.f;
import com.google.wireless.android.finsky.dfe.j.a.h;
import com.google.wireless.android.finsky.dfe.j.a.j;
import com.squareup.leakcanary.C7582R;

public final class ax implements ac {
    public final C1461c f19037a;

    public ax(C1461c c1461c) {
        this.f19037a = c1461c;
    }

    public final C3781e mo3760a(gf gfVar) {
        int i = 1;
        gi giVar = gfVar.f12433c;
        f fVar = new f();
        String str = giVar.f12444b;
        if (str == null) {
            throw new NullPointerException();
        }
        fVar.b |= 1;
        fVar.c = str;
        str = giVar.f12447e;
        if (str == null) {
            throw new NullPointerException();
        }
        fVar.b |= 4;
        fVar.f = str;
        str = giVar.f12448f;
        if (str == null) {
            throw new NullPointerException();
        }
        int i2;
        fVar.b |= 8;
        fVar.g = str;
        switch (giVar.f12445c) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            default:
                FinskyLog.m21665c("Unknown icon type: %d", Integer.valueOf(giVar.f12445c));
                i2 = 2;
                break;
        }
        fVar.d = i2;
        fVar.b |= 2;
        if (giVar.f12446d != null) {
            fVar.e = giVar.f12446d;
        }
        if (giVar.f12450h.m12644g()) {
            fVar.a(giVar.f12450h.m12643f().f12328b);
        } else if (giVar.f12450h.bd_()) {
            fVar.a(giVar.f12450h.bc_().f12323c);
        } else if (giVar.f12450h.m12642e()) {
            d a = m18114a(giVar.f12450h.m12641d());
            if (a == null) {
                if (fVar.a == 1) {
                    fVar.a = -1;
                }
                fVar.i = null;
            } else {
                fVar.a = -1;
                fVar.a = 1;
                fVar.i = a;
            }
        }
        fVar.l = m18115a(giVar.f12451i);
        fVar.m = m18115a(giVar.f12452j);
        if ((giVar.f12443a & 32) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            byte[] bArr = giVar.f12453k;
            if (bArr == null) {
                throw new NullPointerException();
            }
            fVar.b |= 64;
            fVar.k = bArr;
        }
        C3782f a2 = m18116b(fVar).m18033a(gfVar.f12434d);
        switch (gfVar.f12435e) {
            case 1:
                i = 0;
                break;
            case 2:
                break;
            case 3:
                i = 2;
                break;
            default:
                FinskyLog.m21665c("Unknown message state: %i", Integer.valueOf(gfVar.f12435e));
                break;
        }
        return a2.m18032a(i).m18031a();
    }

    public final C3781e mo3761a(f fVar) {
        return m18116b(fVar).m18031a();
    }

    private final C3782f m18116b(f fVar) {
        int i;
        int i2 = C7582R.drawable.ic_play_store;
        switch (fVar.d) {
            case 0:
                i2 = 17301642;
                i = -1;
                break;
            case 1:
                i = C7582R.drawable.ic_promotion_gift;
                break;
            case 2:
                i = -1;
                break;
            default:
                i = -1;
                i2 = -1;
                break;
        }
        C3782f a = C3781e.m18030a("rich.user.notification.".concat(fVar.c), fVar.f, fVar.g, i2).m18039b(907).m18038a(fVar.k);
        if (this.f19037a.dj().mo2294a(12641819)) {
            a.m18032a(2);
        }
        boolean z = (fVar.e == null || TextUtils.isEmpty(fVar.e.f11860f)) ? false : true;
        if (z) {
            a.m18035a(C3816o.m18255a(fVar.e));
        } else if (i != -1) {
            a.m18035a(C3816o.m18254a(i));
        }
        a.m18036a(NotificationReceiver.m18055a(fVar));
        C3778a a2 = m18113a(fVar, true);
        if (a2 != null) {
            a.m18034a(a2);
        }
        a2 = m18113a(fVar, false);
        if (a2 != null) {
            a.m18040b(a2);
        }
        return a;
    }

    private static C3778a m18113a(f fVar, boolean z) {
        j jVar = z ? fVar.l : fVar.m;
        if (jVar == null) {
            return null;
        }
        int i = jVar.d == 1 ? C7582R.drawable.ic_notifications_off_black : -1;
        if (i == -1 && VERSION.SDK_INT < 23) {
            return null;
        }
        C3820u b;
        if (z) {
            b = NotificationReceiver.m18064b(fVar);
        } else {
            b = NotificationReceiver.m18067c(fVar);
        }
        return new C3778a(jVar.c, i, b);
    }

    private static j m18115a(gg ggVar) {
        if (ggVar == null) {
            return null;
        }
        j jVar = new j();
        String str = ggVar.f12437b;
        if (str == null) {
            throw new NullPointerException();
        }
        jVar.b |= 1;
        jVar.c = str;
        jVar.d = 1;
        jVar.b |= 2;
        if (ggVar.f12438c.m12644g()) {
            jVar.a(ggVar.f12438c.m12643f().f12328b);
        } else if (ggVar.f12438c.bd_()) {
            jVar.a(ggVar.f12438c.bc_().f12323c);
        } else if (ggVar.f12438c.m12642e()) {
            d a = m18114a(ggVar.f12438c.m12641d());
            if (a == null) {
                if (jVar.a == 1) {
                    jVar.a = -1;
                }
                jVar.f = null;
            } else {
                jVar.a = -1;
                jVar.a = 1;
                jVar.f = a;
            }
        }
        return jVar;
    }

    private static d m18114a(js jsVar) {
        d dVar = new d();
        h hVar = new h();
        if (((jsVar.f12815a & 1) != 0 ? 1 : 0) != 0) {
            long j = jsVar.f12816b;
            hVar.a |= 2;
            hVar.c = j;
        }
        hVar.d = jsVar.f12817c;
        dVar.a = -1;
        dVar.a = 0;
        dVar.b = hVar;
        return dVar;
    }
}
