package com.google.android.gms.ads.p270c;

import android.os.Build.VERSION;
import com.google.android.gms.ads.p270c.p271a.C4903a;
import com.google.android.gms.ads.p270c.p271a.C4904b;
import com.google.android.gms.ads.p270c.p271a.C4905c;
import com.google.android.gms.ads.p270c.p271a.C4906d;
import com.google.android.gms.internal.C5302b;
import com.google.android.gms.internal.C5303c;
import com.google.android.gms.internal.C5304d;
import com.google.android.gms.internal.C5309h;
import com.google.android.gms.internal.C5310i;
import com.google.android.gms.internal.C5337w;
import com.google.android.gms.internal.aa;
import com.google.android.gms.internal.ab;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.af;
import com.google.android.gms.internal.ag;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ai;
import com.google.android.gms.internal.az;
import com.google.android.gms.internal.ba;
import com.google.android.gms.internal.bb;
import com.google.android.gms.internal.xm;
import com.google.android.gms.internal.xn;
import com.google.android.gms.internal.xo;
import com.google.android.gms.internal.xr;
import com.google.android.gms.internal.yq;
import com.google.android.gms.internal.yr;
import com.google.android.gms.internal.ys;
import com.google.android.gms.internal.yw;
import com.google.android.gms.internal.za;
import com.google.android.gms.internal.zb;
import com.google.android.gms.internal.zc;
import com.google.android.gms.internal.zd;
import com.google.android.gms.internal.zj;

@C5302b
public final class C4909c {
    public static final Object f25261a = new Object();
    public static C4909c f25262b;
    public final C5337w f25263c = new C5337w();
    public final C5310i f25264d;
    public final yq f25265e;
    public final yr f25266f;
    public final ys f25267g;

    static {
        C4909c c4909c = new C4909c();
        synchronized (f25261a) {
            f25262b = c4909c;
        }
    }

    protected C4909c() {
        C4903a c4903a = new C4903a();
        C5303c c5303c = new C5303c();
        C4906d c4906d = new C4906d();
        zj zjVar = new zj();
        bb bbVar = new bb();
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            af afVar = new af();
        } else if (i >= 19) {
            ae aeVar = new ae();
        } else if (i >= 18) {
            ac acVar = new ac();
        } else if (i >= 17) {
            ab abVar = new ab();
        } else if (i >= 16) {
            ad adVar = new ad();
        } else {
            aa aaVar = new aa();
        }
        xm xmVar = new xm();
        this.f25264d = new C5310i();
        xn xnVar = new xn();
        xo xoVar = new xo();
        C4907a c4907a = new C4907a();
        yw ywVar = new yw();
        ag agVar = new ag();
        C5304d c5304d = new C5304d();
        this.f25265e = new yq();
        this.f25266f = new yr();
        this.f25267g = new ys();
        az azVar = new az();
        zb zbVar = new zb();
        zc zcVar = new zc();
        ah ahVar = new ah();
        C4904b c4904b = new C4904b();
        C4905c c4905c = new C4905c();
        zd zdVar = new zd();
        ai aiVar = new ai();
        C4908b c4908b = new C4908b();
        xr xrVar = new xr();
        C5309h c5309h = new C5309h();
        za zaVar = new za();
        ba baVar = new ba();
    }

    public static C4909c m22927a() {
        C4909c c4909c;
        synchronized (f25261a) {
            c4909c = f25262b;
        }
        return c4909c;
    }
}
