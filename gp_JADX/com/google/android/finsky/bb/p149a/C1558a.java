package com.google.android.finsky.bb.p149a;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.aa.C0963m;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bb.C1561c;
import com.google.android.finsky.bb.C1565a;
import com.google.android.finsky.bb.C1566d;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.dfe.h.a.j;
import com.squareup.leakcanary.C7582R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C1558a implements C1557b, C1054h {
    public final Context f8337a;
    public final C2910a f8338b;
    public final C1461c f8339c;
    public final ab f8340d;
    public final C0988c f8341e;
    public final C2206c f8342f;
    public final C1287h f8343g;
    public final C2199l f8344h;
    public final C2233o f8345i;
    public Map f8346j = new HashMap();
    public C1563e f8347k;

    public C1558a(Context context, C2910a c2910a, C1461c c1461c, ab abVar, C0988c c0988c, C2206c c2206c, C1287h c1287h, C2199l c2199l, C2233o c2233o) {
        this.f8337a = context;
        this.f8338b = c2910a;
        this.f8339c = c1461c;
        this.f8340d = abVar;
        this.f8341e = c0988c;
        this.f8342f = c2206c;
        this.f8343g = c1287h;
        this.f8344h = c2199l;
        this.f8345i = c2233o;
        this.f8338b.m15182a((C1054h) this);
    }

    public final C1561c mo2313c() {
        return mo2306a(this.f8341e.cZ());
    }

    public final C1561c mo2306a(String str) {
        if (!this.f8346j.containsKey(str)) {
            this.f8346j.put(str, new C1562d(this.f8338b, this.f8339c, str));
        }
        return (C1561c) this.f8346j.get(str);
    }

    public final boolean mo2314d() {
        return !mo2315e().isEmpty();
    }

    public final List mo2315e() {
        return C1560c.m9052a(this.f8337a, mo2313c());
    }

    public final boolean mo2316f() {
        Context context = this.f8337a;
        C1561c c = mo2313c();
        C0963m c0963m = C0954a.aF;
        boolean contains = C1560c.m9052a(context, c).contains(Integer.valueOf(3));
        j b = c.mo2320b();
        Object obj = (b == null || c.mo2322c() == null || b.b != 1) ? null : 1;
        if ((obj != null || c.mo2330k()) && contains && ((Integer) c0963m.m5777b(c.mo2318a()).m5760a()).intValue() < ((Integer) C0955b.fa.m28964b()).intValue()) {
            return true;
        }
        return false;
    }

    public final boolean mo2310a(C0957n c0957n) {
        Integer num = (Integer) c0957n.m5760a();
        if (num.intValue() >= 3) {
            return false;
        }
        c0957n.m5763a(Integer.valueOf(num.intValue() + 1));
        return true;
    }

    public final void mo2311b(C0957n c0957n) {
        c0957n.m5763a(Integer.valueOf(3));
    }

    public final void mo2307a(Intent intent, C3748a c3748a, C2495w c2495w) {
        new Handler().post(new C1559b(this, intent, c3748a, c2495w));
    }

    public final void P_() {
        this.f8346j.clear();
    }

    public final void ce_() {
    }

    public final C1565a mo2305a(Context context, Document document) {
        C1563e g = m9039g();
        Account cY = g.f8361d.cY();
        if (cY != null) {
            C1561c a = g.f8362e.mo2306a(cY.name);
            C2227g b = g.f8364g.m11652b(document.m14646d(), g.f8359b.mo2811a(cY));
            boolean a2 = a.mo2319a(document.f14885a.f12099f);
            boolean g2 = a.mo2326g();
            String str = cY.name;
            j b2 = a.mo2320b();
            if (b2 == null || !a2 || b == null) {
                return null;
            }
            int i = b2.b;
            C1561c a3 = g.f8362e.mo2306a(str);
            boolean l = a3.mo2331l();
            if (i == 1 || l) {
                String str2 = b.f11111r;
                if (!TextUtils.isEmpty(str2)) {
                    String string;
                    if (g.f8362e.mo2313c().mo2317a(str2) == null) {
                        string = context.getString(C7582R.string.family_sharing_shared_by_unknown);
                    } else {
                        string = context.getString(C7582R.string.family_sharing_shared_with_you_action_text, new Object[]{g.f8362e.mo2313c().mo2317a(str2).d.f12100g});
                    }
                    return new C1565a(document, b, string, 0, true, false);
                } else if (b.f11112s == 1 || document.f14885a.f12091H) {
                    i = 1;
                    boolean a4 = g.f8362e.mo2310a(C0954a.aC);
                    long j = b2.d;
                    if (l && b.f11113t > j) {
                        if (!a3.mo2332m()) {
                            i = 2;
                            a4 = false;
                        }
                    }
                    if (i != 1 || g2) {
                        return new C1565a(document, b, context.getString(C7582R.string.family_sharing_toggle_action_text), i, b.f11110q, a4);
                    }
                }
            }
        }
        return null;
    }

    public final void mo2308a(Fragment fragment, C1565a c1565a, boolean z) {
        C1563e g = m9039g();
        Account cY = g.f8361d.cY();
        if (cY != null) {
            C1254c a = g.f8360c.mo2016a(cY.name);
            c1565a.f8374e = z;
            C0660x c1564f = new C1564f(g, fragment, cY, c1565a);
            a.mo1583a(c1565a.f8370a.f14885a.f12096c, c1565a.f8371b.f11106m, z, c1564f, (C0657w) c1564f);
        }
    }

    public final void mo2309a(C1566d c1566d) {
        m9039g().f8358a.add(c1566d);
    }

    public final void mo2312b(C1566d c1566d) {
        m9039g().f8358a.remove(c1566d);
    }

    private final C1563e m9039g() {
        if (this.f8347k == null) {
            this.f8347k = new C1563e(this.f8342f, this.f8343g, this.f8341e, this, this.f8344h, this.f8345i);
        }
        return this.f8347k;
    }
}
