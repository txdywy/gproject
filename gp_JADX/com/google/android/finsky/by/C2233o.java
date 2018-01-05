package com.google.android.finsky.by;

import android.accounts.Account;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C2233o {
    public final C2206c f11134a;
    public C2227g f11135b;
    public C2227g f11136c;

    public C2233o(C2206c c2206c) {
        this.f11134a = c2206c;
    }

    public final boolean m11649a(Document document, DfeToc dfeToc, C2196e c2196e) {
        if (document.f14885a.f12099f != 0) {
            if (dfeToc != null) {
                if (dfeToc.m14606a(document.f14885a.f12099f) == null) {
                    FinskyLog.m21659a("Corpus for %s is not available.", document.f14885a.f12096c);
                    return false;
                }
            } else if (document.f14885a.f12099f != 3) {
                return false;
            }
        }
        boolean z = document.af() == 1;
        if (!z) {
            int i;
            if (document.f14885a.f12108o == null || !document.f14885a.f12108o.f12163d) {
                boolean z2 = false;
            } else {
                i = 1;
            }
            if (i != 0 && m11647a(document, c2196e)) {
                FinskyLog.m21659a("%s available because owned, overriding [restriction=%d].", document.f14885a.f12096c, Integer.valueOf(r4));
                z = true;
            }
        }
        if (!z) {
            FinskyLog.m21659a("%s not available [restriction=%d].", document.f14885a.f12096c, Integer.valueOf(r4));
        }
        return z;
    }

    public final Account m11642a(Document document, Account account) {
        if (m11647a(document, this.f11134a.mo2811a(account))) {
            return account;
        }
        if (document.f14885a.f12098e == 1) {
            return m11641a(document);
        }
        return null;
    }

    public final Account m11643a(List list, Account account) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Account a = m11642a((Document) list.get(i), account);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public final Account m11641a(Document document) {
        List e = this.f11134a.mo2822e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            C2196e c2196e = (C2197a) e.get(i);
            if (m11647a(document, c2196e)) {
                return c2196e.mo2780a();
            }
        }
        return null;
    }

    public final boolean m11647a(Document document, C2196e c2196e) {
        return m11645a(document.m14646d(), c2196e);
    }

    public final boolean m11645a(ax axVar, C2196e c2196e) {
        return m11652b(axVar, c2196e) != null;
    }

    public final C2227g m11652b(ax axVar, C2196e c2196e) {
        int i = 1;
        C2227g b = m11639b(axVar, c2196e, 1);
        if (!(axVar.f11835d == 4 || axVar.f11835d == 1 || axVar.f11835d == 6)) {
            i = 0;
        }
        if (b == null && r1 != 0) {
            b = m11639b(axVar, c2196e, 3);
        }
        if (b != null || axVar.f11835d != 4) {
            return b;
        }
        b = m11639b(axVar, c2196e, 7);
        if (b == null) {
            return m11639b(axVar, c2196e, 4);
        }
        return b;
    }

    public final synchronized boolean m11648a(Document document, C2196e c2196e, int i) {
        return m11646a(document.m14646d(), c2196e, i);
    }

    public final boolean m11646a(ax axVar, C2196e c2196e, int i) {
        return m11639b(axVar, c2196e, i) != null;
    }

    private final synchronized C2227g m11639b(ax axVar, C2196e c2196e, int i) {
        C2227g b;
        String a = C2229h.m11636a(axVar.f11835d);
        if (this.f11135b == null) {
            this.f11135b = C2227g.m11632a(C2227g.f11100g, a, axVar, i);
        } else {
            C2227g c2227g = this.f11135b;
            c2227g.f11102i = a;
            c2227g.f11103j = axVar.f11835d;
            c2227g.f11104k = axVar.f11833b;
            c2227g.f11105l = axVar.f11834c;
            c2227g.f11106m = i;
        }
        b = c2196e.mo2784b(this.f11135b);
        if (b != null) {
            if ((System.currentTimeMillis() >= b.f11108o ? 1 : null) != null) {
                b = null;
            }
        }
        return b;
    }

    public final boolean m11654b(Document document) {
        bl e = document.m14649e(11);
        if (e == null || e.f11931u == null) {
            return false;
        }
        ax axVar = e.f11931u.f11969a;
        int i = axVar.f11835d;
        if (new C2227g(C2227g.f11100g, C2229h.m11636a(i), i, axVar.f11833b, axVar.f11834c, 1).equals(m11638a())) {
            return true;
        }
        return false;
    }

    public final boolean m11644a(C2196e c2196e) {
        return c2196e.mo2782a(m11638a());
    }

    public final List m11653b(Document document, DfeToc dfeToc, C2196e c2196e) {
        if (!document.bj()) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList();
        List bl = document.bl();
        int size = bl.size();
        for (int i = 0; i < size; i++) {
            Document document2 = (Document) bl.get(i);
            if (m11649a(document2, dfeToc, c2196e) && document2.f14885a.f12107n.length > 0) {
                arrayList.add(document2);
            }
        }
        return arrayList;
    }

    private final C2227g m11638a() {
        if (this.f11136c == null) {
            this.f11136c = new C2227g(C2227g.f11100g, C2229h.m11636a(2), 2, (String) C0955b.di.m28964b(), 15, 1);
        }
        return this.f11136c;
    }

    public final int m11651b(Document document, C2196e c2196e) {
        return m11640c(document.m14646d(), c2196e);
    }

    private final int m11640c(ax axVar, C2196e c2196e) {
        if (m11646a(axVar, c2196e, 1)) {
            return 1;
        }
        if (m11646a(axVar, c2196e, 7)) {
            return 7;
        }
        return -1;
    }

    public final boolean m11655c(Document document, C2196e c2196e) {
        int b = m11651b(document, c2196e);
        if (b == -1) {
            return false;
        }
        C2227g b2 = c2196e.mo2784b(C2227g.m11633a(C2227g.f11100g, C2229h.m11636a(document.f14885a.f12099f), document, b));
        if (b2 == null || !b2.f11109p) {
            return false;
        }
        bl e = document.m14649e(b);
        if (e == null || Document.m14611a(e)) {
            return true;
        }
        return false;
    }

    public final boolean m11656d(Document document, C2196e c2196e) {
        return m11657e(document, c2196e) != null;
    }

    public final ax m11657e(Document document, C2196e c2196e) {
        if (document.f14885a.f12099f == 4 && !document.bp()) {
            C2440m c2440m = document.f14885a.f12115v;
            ax[] aG_;
            if (c2440m == null || c2440m.f13098E == null) {
                aG_ = ax.aG_();
            } else {
                aG_ = c2440m.f13098E.f13031f;
            }
            for (ax axVar : r0) {
                int c = m11640c(axVar, c2196e);
                if (c != -1) {
                    C2227g b = c2196e.mo2784b(C2227g.m11632a(C2227g.f11100g, C2229h.m11636a(axVar.f11835d), axVar, c));
                    if (b != null && b.f11109p) {
                        return axVar;
                    }
                }
            }
        }
        return null;
    }

    public final boolean m11650a(String str) {
        for (C2197a d : this.f11134a.mo2822e()) {
            List d2 = d.mo2789d(str);
            for (int i = 0; i < d2.size(); i++) {
                if (((C2232j) d2.get(i)).e) {
                    return true;
                }
            }
        }
        return false;
    }
}
