package com.google.android.finsky.p232s;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.p232s.p233a.p235b.C4002a;
import com.google.android.finsky.p232s.p233a.p235b.C4003b;
import com.google.android.finsky.tos.C4569e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class C4006e {
    public final C2320a f20102a;
    public final C3340g f20103b;
    public final C2127b f20104c;
    public final C4007f f20105d;
    public final C4004a f20106e;
    public final C1461c f20107f;
    public List f20108g = new ArrayList();
    public C4008g f20109h;

    public C4006e(C3028c c3028c, C2320a c2320a, C2127b c2127b, C3340g c3340g, ab abVar, C3027b c3027b, C0988c c0988c, C1506e c1506e, C4569e c4569e, C1461c c1461c) {
        this.f20102a = c2320a;
        this.f20104c = c2127b;
        this.f20103b = c3340g;
        this.f20106e = new C4004a(abVar, c2127b);
        this.f20107f = c1461c;
        this.f20109h = new C4008g(c4569e);
        this.f20105d = new C4007f(c3028c, c3027b, c0988c, c1506e, c1461c);
    }

    public final void m18749a(List list, boolean z, C2495w c2495w) {
        for (Document document : list) {
            Object obj;
            String cf = document.cf();
            if (TextUtils.isEmpty(cf)) {
                FinskyLog.m21665c("Document has no package name", new Object[0]);
                obj = null;
            } else if (document.m14653h() == -1) {
                FinskyLog.m21665c("Document %s has no valid version code", cf);
                obj = null;
            } else {
                boolean z2;
                C4001c c4002a;
                C4005d c4005d;
                C4005d c4005d2 = new C4005d(document, this.f20102a.mo2854a(cf), this.f20104c.mo2657a(cf), c2495w);
                c4005d2.f20097c.m16812a(true);
                C4008g c4008g = this.f20109h;
                if (c4005d2.f20100f != null) {
                    C4009h a = c4008g.m18753a(c4005d2);
                    if (!(a == null || (a.f20121d & 4) == 0)) {
                        int i = c4005d2.f20100f.f11419d;
                        if (i < 0) {
                            FinskyLog.m21665c("Server thinks we have an asset that we don't have : %s", a.f20118a);
                        } else {
                            if (a.f20120c > 0) {
                                i %= a.f20120c;
                            }
                            if (i < a.f20119b) {
                                if ("com.android.chrome".equals(c4005d2.f20099e.cf())) {
                                    if (c4008g.f20116b == null) {
                                        c4008g.f20116b = Integer.valueOf(c4008g.f20117c.m21206b());
                                    }
                                    if (c4008g.f20116b.intValue() >= ((Integer) C0955b.eT.m28964b()).intValue()) {
                                        z2 = true;
                                    }
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    FinskyLog.m21659a("Building with PhoneBasic for %s", c4005d2.f20099e.cf());
                                    c4002a = new C4002a(this.f20105d, z);
                                } else {
                                    c4002a = new C4003b(this.f20105d, this.f20109h, this.f20107f);
                                }
                                c4002a.mo3882a(c4005d2);
                                c4005d = c4005d2;
                            }
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    FinskyLog.m21659a("Building with PhoneBasic for %s", c4005d2.f20099e.cf());
                    c4002a = new C4002a(this.f20105d, z);
                } else {
                    c4002a = new C4003b(this.f20105d, this.f20109h, this.f20107f);
                }
                c4002a.mo3882a(c4005d2);
                c4005d = c4005d2;
            }
            if (obj != null) {
                this.f20108g.add(obj);
            } else {
                FinskyLog.m21665c("Could not create auto update request", new Object[0]);
            }
        }
    }

    public final void m18748a() {
        for (C4005d c4005d : this.f20108g) {
            if (c4005d.f20095a == 0) {
                c4005d.f20097c.m16813a(c4005d.f20098d.m16799e());
                this.f20103b.m16748b(c4005d.f20097c.m16806a());
            }
        }
    }
}
