package com.google.android.finsky.preregistration;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.app.C0141p;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.view.View;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4680k;
import com.google.wireless.android.finsky.b.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C3934g {
    public static final long f19896a = ((Long) C0955b.eK.m28964b()).longValue();
    public final List f19897b = new ArrayList();
    public final C1287h f19898c;
    public final C1461c f19899d;
    public final C3932e f19900e;
    public final C2206c f19901f;
    public final C2199l f19902g;
    public final C2320a f19903h;
    public final C2910a f19904i;
    public final C0988c f19905j;

    public C3934g(C0988c c0988c, C3932e c3932e, C1461c c1461c, C1287h c1287h, C2206c c2206c, C2199l c2199l, C2320a c2320a, C2910a c2910a) {
        this.f19905j = c0988c;
        this.f19900e = c3932e;
        this.f19899d = c1461c;
        this.f19898c = c1287h;
        this.f19901f = c2206c;
        this.f19902g = c2199l;
        this.f19903h = c2320a;
        this.f19904i = c2910a;
    }

    public final void m18637a(C1005p c1005p) {
        if (c1005p != null && !this.f19897b.contains(c1005p)) {
            this.f19897b.add(c1005p);
        }
    }

    public final void m18641b(C1005p c1005p) {
        this.f19897b.remove(c1005p);
    }

    final void m18638a(String str) {
        for (int size = this.f19897b.size() - 1; size >= 0; size--) {
            ((C1005p) this.f19897b.get(size)).mo1213c(str);
        }
    }

    public final boolean m18640a(String str, Account account) {
        return this.f19901f.mo2811a(account).mo2782a(new C2227g(account.name, "u-pl", 3, str, 1, 1));
    }

    public final void m18636a(Document document, C1254c c1254c, boolean z, Fragment fragment, Context context) {
        m18630a(document.f14885a.f12096c, document.f14885a.f12100g, c1254c, z, context, document.aM(), fragment.f746R);
        ab abVar = fragment.f730B;
        if (z && abVar != null && abVar.mo283a("preregistration_dialog") == null) {
            C0141p a;
            boolean z2 = document.f14885a.f12099f == 3 && this.f19899d.dj().mo2294a(12627688);
            if (z2) {
                C3932e c3932e = this.f19900e;
                boolean b = m18632b();
                String cZ = this.f19905j.cZ();
                z2 = m18634d(cZ) == 1 ? true : !C3934g.m18633c(cZ) && this.f19899d.dj().mo2294a(12629867);
                a = c3932e.m18627a(document, true, b, z2);
                if (m18632b()) {
                    m18635a();
                }
            } else {
                a = this.f19900e.m18627a(document, false, false, false);
            }
            a.m625a(abVar, "preregistration_dialog");
        }
    }

    private final void m18630a(String str, String str2, C1254c c1254c, boolean z, Context context, boolean z2, View view) {
        Account b = c1254c.mo1620b();
        boolean a = m18640a(str, b);
        if (z != a) {
            C0657w c3935h = new C3935h(this, a, str2, context, str);
            if (this.f19899d.dj().mo2294a(12636017) && z2) {
                C0660x c3939l = new C3939l(this, b, str, a, view);
                if (a) {
                    c1254c.mo1665r(str, c3939l, c3935h);
                } else {
                    c1254c.mo1664q(str, c3939l, c3935h);
                }
            } else {
                C0660x c3940m = new C3940m(this, b, str, a);
                if (a) {
                    c1254c.mo1628b(Arrays.asList(new String[]{str}), "u-pl", c3940m, c3935h);
                } else {
                    c1254c.mo1602a(Arrays.asList(new String[]{str}), "u-pl", c3940m, c3935h);
                }
            }
            m18638a(str);
        }
    }

    final void m18639a(String str, List list, Context context) {
        for (String a : list) {
            C1254c a2 = this.f19898c.mo2016a(a);
            if (a2 != null) {
                m18630a(str, null, a2, false, context, false, null);
            }
        }
    }

    public static void m18631b(String str) {
        C0954a.ac.m5777b(str).m5763a(Long.valueOf(C4678i.m21812a()));
        List arrayList = new ArrayList(Arrays.asList(C4680k.m21818a((String) C0954a.ab.m5760a())));
        if (!arrayList.contains(str)) {
            arrayList.add(str);
            C0954a.ab.m5763a(C4680k.m21815a(arrayList));
        }
    }

    public final void m18635a() {
        C0954a.bt.m5777b(this.f19905j.cZ()).m5763a(Boolean.valueOf(true));
    }

    private final boolean m18632b() {
        String cZ = this.f19905j.cZ();
        return !C3934g.m18633c(cZ) || m18634d(cZ) == 2;
    }

    static boolean m18633c(String str) {
        return ((Boolean) C0954a.bt.m5777b(str).m5760a()).booleanValue();
    }

    private final int m18634d(String str) {
        Integer d = this.f19904i.m15193d(str, 2);
        if (d != null) {
            return d.intValue();
        }
        return 2;
    }

    private final void m18628a(Account account, String str, w wVar) {
        this.f19902g.mo2796a(account, "modifed_preregistration", new C3941n(this, str), wVar);
    }
}
