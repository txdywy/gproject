package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.support.v4.app.Fragment;
import android.view.View$OnClickListener;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ap.a;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.cw.b;
import com.google.android.finsky.cw.c;
import com.google.android.finsky.cw.d;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dn.a;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.p;
import com.google.android.finsky.l.a;
import com.google.android.finsky.l.b;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.preregistration.g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.c;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.actionbuttons.j
{

    public static final List a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final Map e;
    public final com.google.android.finsky.actionbuttons.b f;
    public final com.google.android.finsky.f.b g;
    public final com.google.android.finsky.l.a h;
    public final Context i;
    public final com.google.android.finsky.ap.a j;
    public final com.google.android.finsky.cw.c k;
    public final com.google.android.finsky.ba.c l;
    public final com.google.android.finsky.installer.k m;
    public final com.google.android.finsky.installqueue.g n;
    public final com.google.android.finsky.by.c o;
    public final com.google.android.finsky.by.o p;
    public final com.google.android.finsky.ce.a q;
    public final PackageManager r;
    public final com.google.android.finsky.preregistration.g s;
    public final com.google.android.finsky.cw.d t;
    public final com.google.android.finsky.dn.a u;
    public final com.google.android.finsky.dfemodel.ab v;

    static {
        v0 = new ArrayList();
        com.google.android.finsky.actionbuttons.j.a = v0;
        v0.add(Integer.valueOf(13));
        com.google.android.finsky.actionbuttons.j.a.add(Integer.valueOf(12));
        com.google.android.finsky.actionbuttons.j.a.add(Integer.valueOf(20));
        com.google.android.finsky.actionbuttons.j.a.add(Integer.valueOf(21));
        com.google.android.finsky.actionbuttons.j.a.add(Integer.valueOf(16));
        v0 = new ArrayList();
        com.google.android.finsky.actionbuttons.j.b = v0;
        v0.add(Integer.valueOf(1));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(8));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(9));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(10));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(11));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(12));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(14));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(15));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(3));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(4));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(20));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(17));
        com.google.android.finsky.actionbuttons.j.b.add(Integer.valueOf(18));
        com.google.android.finsky.actionbuttons.j.c = new ArrayList();
        v1 = 0;
        while (v1 < com.google.android.finsky.actionbuttons.j.a.size()) {
            com.google.android.finsky.actionbuttons.j.c.add((Integer)com.google.android.finsky.actionbuttons.j.a.get(v1));
            v1 = v1 + 1;
        }
        com.google.android.finsky.actionbuttons.j.c.add(Integer.valueOf(5));
        com.google.android.finsky.actionbuttons.j.c.add(Integer.valueOf(6));
        com.google.android.finsky.actionbuttons.j.c.add(Integer.valueOf(7));
        com.google.android.finsky.actionbuttons.j.d = new ArrayList();
        v1 = 0;
        while (v1 < com.google.android.finsky.actionbuttons.j.a.size()) {
            com.google.android.finsky.actionbuttons.j.d.add((Integer)com.google.android.finsky.actionbuttons.j.a.get(v1));
            v1 = v1 + 1;
        }
        com.google.android.finsky.actionbuttons.j.d.add(Integer.valueOf(26));
        com.google.android.finsky.actionbuttons.j.d.add(Integer.valueOf(25));
        com.google.android.finsky.actionbuttons.j.d.add(Integer.valueOf(27));
        v0 = new HashMap();
        v0.put(Integer.valueOf(12), Integer.valueOf(1));
        v0.put(Integer.valueOf(14), Integer.valueOf(1));
        v0.put(Integer.valueOf(15), Integer.valueOf(1));
        v0.put(Integer.valueOf(17), Integer.valueOf(0));
        v0.put(Integer.valueOf(18), Integer.valueOf(0));
        com.google.android.finsky.actionbuttons.j.e = Collections.unmodifiableMap(v0);
    }

    j(com.google.android.finsky.actionbuttons.b p0, com.google.android.finsky.f.b p1, com.google.android.finsky.l.a p2, Context p3, com.google.android.finsky.ap.a p4, com.google.android.finsky.cw.c p5, com.google.android.finsky.ba.c p6, com.google.android.finsky.installer.k p7, com.google.android.finsky.installqueue.g p8, com.google.android.finsky.by.c p9, com.google.android.finsky.by.o p10, com.google.android.finsky.ce.a p11, PackageManager p12, com.google.android.finsky.preregistration.g p13, com.google.android.finsky.cw.d p14, com.google.android.finsky.dn.a p15, com.google.android.finsky.dfemodel.ab p16) {
        this.f = p0;
        this.g = p1;
        this.h = p2;
        this.i = p3;
        this.j = p4;
        this.k = p5;
        this.l = p6;
        this.m = p7;
        this.n = p8;
        this.o = p9;
        this.p = p10;
        this.q = p11;
        this.r = p12;
        this.s = p13;
        this.t = p14;
        this.u = p15;
        this.v = p16;
    }

    private static int a(int p0) {
        v0 = 1;
        switch (p0) {
            case 1:
                break;
            case 2:
                v0 = 6;
                break;
            case 3:
                v0 = 6;
                break;
            case 4:
                v0 = 5;
                break;
            case 5:
                v0 = 5;
                break;
            case 6:
                v0 = 5;
                break;
            case 7:
                v0 = 5;
                break;
            case 8:
                v0 = 4;
                break;
            case 9:
                v0 = 4;
                break;
            case 10:
                v0 = 4;
                break;
            case 11:
                v0 = 3;
                break;
            case 12:
                v0 = 2;
                break;
            case 13:
                v0 = 2;
                break;
            case 14:
                v0 = 2;
                break;
            case 15:
                v0 = 2;
                break;
            case 16:
                break;
            case 17:
                v0 = -1;
                break;
            case 18:
                v0 = -1;
                break;
            case 19:
                v0 = 0;
                break;
            case 20:
                v0 = 0;
                break;
            case 21:
                v0 = 0;
                break;
            case 22:
                v0 = 0;
                break;
            case 23:
                v0 = 6;
                break;
            case 24:
                v0 = 0;
                break;
            case 25:
                v0 = -1;
                break;
            case 26:
                v0 = -1;
                break;
            case 27:
                v0 = -1;
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public static int a(com.google.android.finsky.cw.a p0, int p1) {
        v0 = 200;
        switch (p0.a) {
            case 1:
                if (p0.e == 7)
                    v0 = 232;
                else if (p1 == 4)
                    v0 = 231;
                break;
            case 2:
                v0 = 226;
                break;
            case 3:
                if (p0.e == 4)
                    v0 = 229;
                else if (p1 == 4)
                    v0 = 228;
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                v0 = 218;
                break;
            case 7:
                v0 = 221;
                break;
            case 8:
                v0 = 217;
                break;
            case 9:
                v0 = 235;
                break;
            case 10:
                v0 = 218;
                break;
            case 11:
                v0 = 222;
                break;
            case 12:
                v0 = 224;
                break;
            case 13:
                if (p0.e == 7)
                    v0 = 232;
                else if (p1 == 4)
                    v0 = 231;
                break;
            case 14:
                v0 = 220;
                break;
            case 15:
                v0 = 2703;
                break;
            case 16:
                if (p0.e == 7)
                    v0 = 232;
                else if (p1 == 4)
                    v0 = 231;
                break;
            case 17:
                v0 = 221;
                break;
            case 18:
                v0 = 221;
                break;
            case 19:
                v0 = 217;
                break;
            case 20:
                v0 = 2916;
                break;
            case 21:
                v0 = 222;
                break;
            default:
                v2 = new Object[1];
                v2[0] = Integer.valueOf(p0.a);
                FinskyLog.e("Unrecognized action %s", v2);
                v0 = -1;
                break;
        }
        return v0;
    }

    private static int a(List p0) {
        v2 = 2147483647;
        v1 = 0;
        while (v1 < p0.size()) {
            v0 = com.google.android.finsky.actionbuttons.j.a(((Integer)p0.get(v1)).intValue());
            if (v0 < v2)
                v2 = v0;
            v1 = v1 + 1;
        }
        return v2;
    }

    public static View$OnClickListener a(com.google.android.finsky.cw.a p0, int p1, com.google.android.finsky.navigationmanager.a p2, String p3, com.google.android.finsky.d.ad p4, Context p5, com.google.android.finsky.d.w p6) {
        switch (p0.a) {
            case 1:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 2:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 3:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 4:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 5:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 6:
                v0 = p2.a(p0.h, p0.i, p4, p6);
                break;
            case 7:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 8:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 9:
                v1 = new Object[1];
                v1[0] = p0;
                FinskyLog.e("Unrecognized action %s", v1);
                v0 = 0;
                break;
            case 10:
                v0 = p2.a(p0.h, p0.i, p4, p6);
                break;
            case 11:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 12:
                v1 = new Object[1];
                v1[0] = p0;
                FinskyLog.e("Unrecognized action %s", v1);
                v0 = 0;
                break;
            case 13:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 14:
                v0 = new com.google.android.finsky.actionbuttons.m(p0, p5);
                break;
            case 15:
                v1 = new Object[1];
                v1[0] = p0;
                FinskyLog.e("Unrecognized action %s", v1);
                v0 = 0;
                break;
            case 16:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 17:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 18:
                v0 = new com.google.android.finsky.actionbuttons.k(p6, p4, p2, p0, p3);
                break;
            case 19:
                v0 = p2.a(p0.i, p0.h, p0.e, p0.f, p3, com.google.android.finsky.actionbuttons.j.a(p0, p1), p4, p6);
                break;
            case 20:
                v0 = new com.google.android.finsky.actionbuttons.n(p2, p0, p6, p4);
                break;
            default:
                v1 = new Object[1];
                v1[0] = p0;
                FinskyLog.e("Unrecognized action %s", v1);
                v0 = 0;
                break;
        }
        return v0;
    }

    private final String a(String p0) {
        v0 = this.m.n(p0);
        if (v0 != 0)
            p0 = v0;
        else {
            try {
                p0 = this.r.getApplicationLabel(this.r.getApplicationInfo(p0, 0)).toString();
            }
            catch (PackageManager$NameNotFoundException ex) {
            }
        }
        return p0;
    }

    public static boolean a(com.google.android.finsky.cw.a p0) {
        if (p0.a != 9 && p0.a != 12 && p0.a != 15 && p0.a != 21)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final boolean a(Document p0, Account p1, com.google.android.finsky.f.a p2, DfeToc p3) {
        v0 = 0;
        if (p0.a.f == 3 && ((p2.b(p0)) || p2.a(p0)) && this.p.a(p0, p3, this.o.a(p1)) && p2.u == 0)
            v0 = 1;
        return v0;
    }

    private final boolean a(Document p0, String p1, com.google.android.finsky.f.a p2, DfeToc p3) {
        v0 = 0;
        if (p0.a.f == 3 && p2.h == 0 && !p0.ae() && this.p.a(p0, p3, this.o))
            v0 = this.a(this.n.c(p1));
        return v0;
    }

    private final boolean a(Document p0, boolean p1, boolean p2) {
        v0 = 0;
        if (p0.a.f == 2 && this.a(p2) && p1 == 0)
            v0 = this.l.dj().a(12602761);
        return v0;
    }

    private final boolean a(Document p0, boolean p1, boolean p2, boolean p3) {
        v0 = 0;
        if (p0.a.f == 2 && this.a(p3) && p2 != 0 && p1 == 0)
            v0 = 1;
        return v0;
    }

    private final boolean a(boolean p0) {
        v0 = 0;
        if ((this.l.dj().a(87) || this.l.dj().a(12602761)) && p0 != 0)
            v0 = 1;
        return v0;
    }

    private final boolean b(Document p0, boolean p1, boolean p2) {
        v0 = 0;
        if (p0.a.f == 2 && this.a(p2) && p1 == 0 && !this.l.dj().a(12602761))
            v0 = 1;
        return v0;
    }

    public final String a(Context p0) {
        if (this.l.dj().a(12625960)) {
            v1 = this.h.a().iterator();
            while (v1.hasNext()) {
                v2 = ((com.google.android.finsky.l.b)v1.next()).a;
                v3 = this.n.b(v2);
                if (com.google.android.finsky.utils.c.a(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.ij.b()), v2))
                    v0 = p0.getString(2131952078);
                else
                    v0 = this.a(v2);
                if (v3 == 3) {
                    v2 = new Object[1];
                    v2[0] = v0;
                    v0 = p0.getString(2131952077, v2);
                    return v0;
                }
                if (v3 == 2) {
                    v2 = new Object[1];
                    v2[0] = v0;
                    v0 = p0.getString(2131952076, v2);
                    return v0;
                }
            }
        }
        v0 = p0.getString(2131952075);
        return v0;
    }

    final List a(Account p0, Document p1, int p2) {
        v5 = this.k.a();
        this.t.a(p0, this.v.dn(), p2, p1, v5);
        v3 = new ArrayList();
        v4 = new HashMap();
        v4.put(Integer.valueOf(6), Integer.valueOf(12));
        v4.put(Integer.valueOf(9), Integer.valueOf(13));
        v4.put(Integer.valueOf(11), Integer.valueOf(16));
        v4.put(Integer.valueOf(10), Integer.valueOf(16));
        v4.put(Integer.valueOf(21), Integer.valueOf(16));
        v4.put(Integer.valueOf(12), Integer.valueOf(4));
        v4.put(Integer.valueOf(20), Integer.valueOf(23));
        v1 = 0;
        v2 = 0;
        while (true) {
            if (v1 >= v5.e) {
                if (!v5.b() && p1.a.I != 0)
                    v3.add(Integer.valueOf(22));
                return v3;
            }
            if (v1 >= 2)
                break;
            v0 = v5.a(v1);
            if (v4.containsKey(Integer.valueOf(v0.a)))
                v0 = ((Integer)v4.get(Integer.valueOf(v0.a))).intValue();
            else {
                if (v2 == 0)
                    v0 = 20;
                else
                    v0 = 19;
                v2 = v2 + 1;
            }
            v3.add(Integer.valueOf(v0));
            v1 = v1 + 1;
        }
        v1 = new Object[1];
        v1[0] = Integer.valueOf(2);
        FinskyLog.c("Not supposed to have more than %d actions available", v1);
        if (!v5.b() && p1.a.I != 0)
            v3.add(Integer.valueOf(22));
        return v3;
    }

    public final List a(List p0, com.google.android.finsky.d.w p1, Fragment p2, com.google.android.finsky.d.ad p3, Document p4, com.google.android.finsky.d.ad p5, String p6, Context p7, com.google.android.finsky.navigationmanager.a p8, int p9, String p10, int p11, boolean p12, boolean p13, Intent p14, com.google.android.finsky.actionbuttons.an p15, int p16) {
        v31 = new ArrayList();
        v3 = this.j.b(p4, p10);
        if (p4.a.f == 1 || p4.a.f == 6 || p4.a.f == 4) {
            v7 = this.k.a();
            this.t.a(v3, this.v.dn(), p9, p4, v7);
            v29 = v7;
        }
        else
            v29 = 0;
        v30 = 0;
        while (v30 < p0.size()) {
            v4 = ((Integer)p0.get(v30)).intValue();
            if (p11 != -1)
                v6 = p11;
            else {
                if (com.google.android.finsky.actionbuttons.j.a(v4) == com.google.android.finsky.actionbuttons.j.a(p0))
                    v6 = 0;
                else
                    v6 = 2;
                if (v4 == 18)
                    v6 = 2;
                if (v4 == 19)
                    v6 = 2;
            }
            v11 = 0;
            if (v29 != 0) {
                if (v30 < v29.e) {
                    if (p4.a.f != 1 && p4.a.f != 6 && p4.a.f != 4)
                        v2 = 0;
                    else {
                        v2 = new HashSet();
                        v2.add(Integer.valueOf(12));
                        v2.add(Integer.valueOf(20));
                        v2.add(Integer.valueOf(19));
                        v2.add(Integer.valueOf(16));
                        v2.add(Integer.valueOf(4));
                        v2.add(Integer.valueOf(13));
                        v2.add(Integer.valueOf(23));
                        v2 = v2.contains(Integer.valueOf(v4));
                    }
                    if (v2 != 0)
                        v11 = v29.a(v30);
                }
            }
            v14 = this.a();
            switch (v4) {
                case 1:
                    v4 = new com.google.android.finsky.actionbuttons.ae(p7, v6, p1, p5, p4, this.f.q, this.f.f, p14);
                    break;
                case 2:
                    v4 = new com.google.android.finsky.actionbuttons.aj(p7, v6, p8, p4, p5, p1);
                    break;
                case 3:
                    v4 = new com.google.android.finsky.actionbuttons.w(p7, v6, p4, p5, p1, this.f.i);
                    break;
                case 4:
                    v4 = new com.google.android.finsky.actionbuttons.ab(p7, v6, p8, p4, p5, v3, v11, p1, this.f.d, this.f.g, this.f.k, this.f.l, this.f.p);
                    break;
                case 5:
                    v4 = new com.google.android.finsky.actionbuttons.ap(p7, v6, p8, p4, p5, p1, v14, this.f.a, this.f.d);
                    break;
                case 6:
                    v4 = new com.google.android.finsky.actionbuttons.ad(p7, v6, p8, p4, p5, v3, p1, v14, this.f.d);
                    break;
                case 7:
                    v4 = new com.google.android.finsky.actionbuttons.ai(p7, v6, p8, p4, p5, v3, p1, v14, this.f.d);
                    break;
                case 8:
                    v4 = new com.google.android.finsky.actionbuttons.as(p7, v6, p4, p5, p2, p1, this.f.c, this.f.k, this.f.g);
                    break;
                case 9:
                    v4 = new com.google.android.finsky.actionbuttons.am(p7, v6, p4, p5, p2, p1, this.f.c, this.f.m);
                    break;
                case 10:
                    v4 = new com.google.android.finsky.actionbuttons.z(p7, v6, p4, p5, p2, p1);
                    break;
                case 11:
                    v4 = new com.google.android.finsky.actionbuttons.av(p7, v6, p4, v3, p8, p6, p5, p1);
                    break;
                case 12:
                    v4 = new com.google.android.finsky.actionbuttons.ah(p7, v6, p8, p4, p5, v3, v11, p6, p1, p12, this.f.k, this.f.p, this.f.q);
                    break;
                case 13:
                    v4 = new com.google.android.finsky.actionbuttons.t(p7, v6, p4, this.p.a(p4, v3), p5, p2, p1, v11, this.f.e, this.f.p, this.f.n);
                    break;
                case 14:
                    v4 = new com.google.android.finsky.actionbuttons.y(p7, v6, p4, v3, p5, p8, p1, this.f.h);
                    break;
                case 15:
                    v4 = new com.google.android.finsky.actionbuttons.ac(p7, v6, p4, p5, p1);
                    break;
                case 16:
                    v4 = new com.google.android.finsky.actionbuttons.aq(p7, v6, p4, p6, p5, v3, p8, v11, p1, p3, this.f.j, this.f.k, this.f.p, p15, p16);
                    break;
                case 17:
                    v4 = new com.google.android.finsky.actionbuttons.al(p7, v6, p4, p5, p1, p2, v3, this.f.e, this.f.o);
                    break;
                case 18:
                    v4 = new com.google.android.finsky.actionbuttons.au(p7, v6, p4, p5, p2, v3, p1, this.f.e, this.f.o);
                    break;
                case 19:
                    v4 = new com.google.android.finsky.actionbuttons.q(p7, v6, p4, p6, p5, v3, p8, v11, p1, this.f.b, this.f.s, this.f.j, this.f.k, this.f.p, this.f.q, p13);
                    break;
                case 20:
                    v4 = new com.google.android.finsky.actionbuttons.q(p7, v6, p4, p6, p5, v3, p8, v11, p1, this.f.b, this.f.s, this.f.j, this.f.k, this.f.p, this.f.q, p13);
                    break;
                case 21:
                    v4 = new com.google.android.finsky.actionbuttons.ak(p7, v6, p4, p6, v3, p8, p5, p1);
                    break;
                case 22:
                    v4 = new com.google.android.finsky.actionbuttons.aw(p7, v6, p8, p4, p1, p5, this.f.r, this.f.a);
                    break;
                case 23:
                    v4 = new com.google.android.finsky.actionbuttons.ao(p7, v6, p8, p4, p5, v11, p1, this.f.p);
                    break;
                case 24:
                    v5 = new Object[1];
                    v5[0] = Integer.valueOf(v4);
                    FinskyLog.e("Unknown button type - %d encountered", v5);
                    v4 = 0;
                    break;
                case 25:
                    v4 = new com.google.android.finsky.actionbuttons.ad(p7, v6, p8, p4, p5, v3, p1, v14, this.f.d);
                    break;
                case 26:
                    v4 = new com.google.android.finsky.actionbuttons.ap(p7, v6, p8, p4, p5, p1, v14, this.f.a, this.f.d);
                    break;
                case 27:
                    v4 = new com.google.android.finsky.actionbuttons.ai(p7, v6, p8, p4, p5, v3, p1, v14, this.f.d);
                    break;
                default:
                    v5 = new Object[1];
                    v5[0] = Integer.valueOf(v4);
                    FinskyLog.e("Unknown button type - %d encountered", v5);
                    v4 = 0;
                    break;
            }
            if (v4 != 0)
                v31.add(v4);
            v30 = v30 + 1;
        }
        return v31;
    }

    final void a(List p0, Document p1, Account p2, Intent p3) {
 20:    v7 = this.p.a(p1, p2);
 25:    v5 = 0;
 33:    if (p1.a.f == 3) {
 39:        v2 = p1.N().k;
 43:        v5 = this.g.a(v2);
 47:        v9 = v2;
        }
        else
669:        v9 = 0;
 52:    v8 = this.p.a(p1, this.v.dn(), this.o.a(p2));
 57:    v10 = 0;
 62:    if (v10 >= p0.size())
668:        return;
 78:    v12 = this.o.a(p2);
 84:    v4 = this.v.dn();
 97:    if (!this.a(p1, v4, v5, p2, v7, v8))
 99:        v2 = 1;
        else
124:        v2 = 0;
102:    v3 = this.p.a(v12);
110:    v6 = this.p.b(p1);
114:    switch (((Integer)p0.get(v10)).intValue()) {
            case 1:
114:            goto 616;
            case 2:
114:            goto 531;
            case 3:
114:            goto 424;
            case 4:
114:            goto 416;
            case 5:
114:            goto 126;
            case 6:
114:            goto 156;
            case 7:
114:            goto 186;
            case 8:
114:            goto 216;
            case 9:
114:            goto 237;
            case 10:
114:            goto 267;
            case 11:
114:            goto 289;
            case 12:
114:            goto 447;
            case 13:
114:            goto 432;
            case 14:
114:            goto 299;
            case 15:
114:            goto 319;
            case 16:
114:            goto 518;
            case 17:
114:            goto 345;
            case 18:
114:            goto 379;
            case 19:
114:            goto 117;
            case 20:
114:            goto 482;
            case 21:
114:            goto 493;
            case 22:
114:            goto 117;
            case 23:
114:            goto 117;
            case 24:
114:            goto 547;
            case 25:
114:            goto 171;
            case 26:
114:            goto 141;
            case 27:
114:            goto 201;
            default:
        }
117:    v2 = 1;
118:    if (v2 == 0)
120:        p0.remove(v10);
        else
665:        v10 = v10 + 1;
123:    goto 58;
130:    if (this.a())
132:        v2 = 0;
        else
136:        v2 = this.a(p1, v3, v6);
133:    goto 118;
145:    if (!this.a())
147:        v2 = 0;
        else
151:        v2 = this.a(p1, v3, v6);
148:    goto 118;
160:    if (this.a())
162:        v2 = 0;
        else
166:        v2 = this.b(p1, v3, v6);
163:    goto 118;
175:    if (!this.a())
177:        v2 = 0;
        else
181:        v2 = this.b(p1, v3, v6);
178:    goto 118;
190:    if (this.a())
192:        v2 = 0;
        else
196:        v2 = this.a(p1, v2, v3, v6);
193:    goto 118;
205:    if (!this.a())
207:        v2 = 0;
        else
211:        v2 = this.a(p1, v2, v3, v6);
208:    goto 118;
223:    if (p1.a.f != 3) goto 235;
229:    if (!v5.b()) goto 235;
233:    if (v5.q == 0) goto 117;
235:    v2 = 0;
236:    goto 118;
244:    if (p1.a.f != 3) goto 264;
250:    if (!v5.b()) goto 256;
252:    v2 = v5.q;
254:    goto 118;
258:    if (v5.l != 0) goto 264;
262:    if (v5.q != 0) goto 117;
264:    v2 = 0;
265:    goto 118;
274:    if (p1.a.f != 3) goto 286;
280:    if (v5.b()) goto 286;
284:    if (v5.l != 0) goto 117;
286:    v2 = 0;
287:    goto 118;
293:    v2 = this.a(p1, p2, v5, v4);
297:    goto 118;
306:    if (p1.a.f != 3) goto 316;
310:    if (v5.s == 0) goto 316;
314:    if (v5.t != 0) goto 117;
316:    v2 = 0;
317:    goto 118;
326:    if (p1.a.f != 3) goto 342;
330:    if (v5.s != 0) goto 342;
334:    if (v5.u == 0) goto 342;
340:    if (v5.a()) goto 117;
342:    v2 = 0;
343:    goto 118;
352:    if (p1.a.f != 3) goto 376;
358:    if (!p1.ae()) goto 376;
374:    if (!this.s.a(p1.a.c, p2)) goto 117;
376:    v2 = 0;
377:    goto 118;
386:    if (p1.a.f != 3)
388:        v2 = 0;
395:    else if (!p1.ae())
397:        v2 = 0;
        else
410:        v2 = this.s.a(p1.a.c, p2);
389:    goto 118;
418:    v2 = this.a(p1, v9, v5, v4);
422:    goto 118;
426:    v2 = this.a(p1, v9, v5, v4);
430:    goto 118;
432:    if (v7 == 0) goto 444;
442:    if (this.p.c(p1, v12)) goto 117;
444:    v2 = 0;
445:    goto 118;
454:    if (p1.a.f != 3) goto 467;
458:    if (v5.s == 0) goto 464;
462:    if (v5.t == 0) goto 117;
464:    v2 = 0;
465:    goto 118;
467:    if (v7 == 0) goto 479;
477:    if (!this.p.c(p1, v12)) goto 117;
479:    v2 = 0;
480:    goto 118;
487:    v2 = this.a(p1, v4, v5, p2, v7, v8);
491:    goto 118;
493:    if (v8 == 0) goto 497;
495:    if (v7 == 0) goto 500;
497:    v2 = 0;
498:    goto 118;
507:    if (p1.e(1) == 0) goto 515;
513:    if (p1.ab()) goto 117;
515:    v2 = 0;
516:    goto 118;
518:    if (v7 != 0) goto 528;
520:    if (v8 == 0) goto 528;
526:    if (p1.ag()) goto 117;
528:    v2 = 0;
529:    goto 118;
538:    if (p1.a.f != 3) goto 544;
542:    if (v5.h == 0) goto 117;
544:    v2 = 0;
545:    goto 118;
553:    if (!com.google.android.finsky.as.a.b(this.i)) goto 613;
557:    if (v5.h == 0) goto 613;
567:    if (this.a(p1, p2, v5, v4)) goto 613;
579:    if (!com.google.android.finsky.as.a.b(this.i)) goto 613;
590:    v3 = new Intent("android.service.wallpaper.WallpaperService").addCategory("com.google.android.wearable.watchface.category.WATCH_FACE");
594:    v3.setPackage(p1.cf());
601:    v2 = this.r.queryIntentServices(v3, 128);
605:    if (v2 == 0) goto 613;
611:    if (!v2.isEmpty()) goto 117;
613:    v2 = 0;
614:    goto 118;
625:    if (!this.a(p1, v4, v5, p2, v7, v8)) goto 660;
627:    if (p3 == 0) goto 660;
643:    if (this.r.queryIntentActivities(p3, 131072).isEmpty()) goto 660;
658:    if (this.l.dj().a(12636357)) goto 117;
660:    v2 = 0;
661:    goto 118;
    }

    public final boolean a() {
        return this.l.dj().a(12620773);
    }

    public final boolean a(Document p0, DfeToc p1, com.google.android.finsky.f.a p2, Account p3, Account p4, boolean p5) {
        v0 = 1;
        if (p0.a.f == 3) {
            if (p2.h != 0 || p0.ae() || !this.p.a(p0, p1, this.o) || this.u.b(p0) || this.u.c(p0, p3))
                v0 = 0;
        }
        else if (p5 == 0 || p4 != 0)
            v0 = 0;
        else if (p0.e(1) == 0 || p0.ab())
            v0 = 0;
        return v0;
    }

    public final boolean a(com.google.android.finsky.installqueue.p p0) {
        if (this.l.dj().a(12607073) && p0.d == 196 && this.q.d())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
