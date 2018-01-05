package com.google.android.finsky.by.p132a;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2211b;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2228f;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.by.C2230i;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.by.C2232j;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class C2198a implements C2197a {
    public final Map f10987a = new HashMap();
    public final Map f10988b = new HashMap();
    public final List f10989c = new ArrayList();
    public final Handler f10990d;
    public boolean f10991e = true;
    public final Account f10992f;

    public C2198a(Account account, Handler handler) {
        this.f10992f = account;
        this.f10990d = handler;
        this.f10987a.put(C2229h.f11120a, new C2205c(new ao()));
        this.f10987a.put(C2229h.f11123d, new ak(new ao()));
        this.f10987a.put(C2229h.f11121b, new C2202d(1, new ao()));
        this.f10987a.put(C2229h.f11122c, new C2202d(4, new ao()));
        this.f10987a.put(C2229h.f11124e, new aj(new ao()));
        this.f10987a.put(C2229h.f11125f, new C2202d(10, new ao()));
        this.f10987a.put("u-wl", new C2202d(0, new ao()));
        this.f10987a.put("u-pl", new C2202d(0, new ao()));
        this.f10987a.put("u-tpl", new C2202d(0, new ao()));
    }

    public final Account mo2780a() {
        return this.f10992f;
    }

    public final synchronized void m11516d() {
        this.f10991e = false;
    }

    public final synchronized void m11519e() {
        this.f10991e = true;
        m11502f();
    }

    public final boolean m11524h(String str) {
        return this.f10987a.containsKey(str);
    }

    private final void m11502f() {
        if (this.f10991e) {
            this.f10990d.post(new C2204b(new ArrayList(this.f10989c)));
        }
    }

    public final synchronized void m11505a(C2211b c2211b) {
        this.f10989c.add(c2211b);
    }

    public final synchronized C2228f m11525i(String str) {
        return (C2228f) ((C2205c) this.f10987a.get(C2229h.f11120a)).mo2784b(new C2227g(null, C2229h.f11120a, 3, str, 1, 1));
    }

    public final synchronized C2230i mo2781a(String str) {
        return ((C2205c) this.f10987a.get(C2229h.f11120a)).m11573a(str);
    }

    public final synchronized C2196e mo2783b() {
        return (C2196e) this.f10987a.get("u-tpl");
    }

    public final synchronized List mo2787c(String str) {
        List arrayList;
        C2205c c2205c = (C2205c) this.f10987a.get(C2229h.f11120a);
        arrayList = new ArrayList();
        for (String str2 : c2205c.f11033b) {
            if (TextUtils.equals(C2726q.m14749a(str2), str)) {
                arrayList.add(c2205c.m11573a(str2));
            }
        }
        return arrayList;
    }

    public final synchronized List mo2785b(String str) {
        List arrayList;
        C2196e<C2227g> c2196e = (C2196e) this.f10987a.get(str);
        arrayList = new ArrayList(c2196e.mo2792g());
        for (C2227g c2227g : c2196e) {
            arrayList.add(c2227g.f11104k);
        }
        return arrayList;
    }

    public final synchronized List mo2789d(String str) {
        List arrayList;
        C2202d c2202d = (C2205c) this.f10987a.get(C2229h.f11120a);
        arrayList = new ArrayList();
        for (String str2 : c2202d.f11032a) {
            if (TextUtils.equals(C2726q.m14752b(str2), str)) {
                C2227g b = c2202d.mo2784b(new C2227g(null, C2229h.f11120a, 3, str2, 15, 1));
                if (b == null) {
                    b = c2202d.mo2784b(new C2227g(null, C2229h.f11120a, 3, str2, 67, 1));
                }
                arrayList.add((C2232j) b);
            }
        }
        return arrayList;
    }

    public final synchronized List mo2786c() {
        List arrayList;
        ak akVar = (ak) this.f10987a.get(C2229h.f11123d);
        arrayList = new ArrayList(akVar.mo2792g());
        Iterator it = akVar.iterator();
        while (it.hasNext()) {
            C2227g c2227g = (C2227g) it.next();
            if (!akVar.mo2805e(c2227g)) {
                arrayList.add((C2231n) c2227g);
            }
        }
        return arrayList;
    }

    public final synchronized C2231n mo2790e(String str) {
        return (C2231n) ((aj) this.f10987a.get(C2229h.f11124e)).mo2784b(new C2227g(null, C2229h.f11124e, 6, str, 15, 1));
    }

    public final synchronized C2227g mo2784b(C2227g c2227g) {
        C2196e c2196e;
        c2196e = (C2196e) this.f10987a.get(c2227g.f11102i);
        return c2196e != null ? c2196e.mo2784b(c2227g) : null;
    }

    public final synchronized boolean mo2782a(C2227g c2227g) {
        C2196e c2196e;
        c2196e = (C2196e) this.f10987a.get(c2227g.f11102i);
        return c2196e != null ? c2196e.mo2782a(c2227g) : false;
    }

    public final synchronized void m11517d(C2227g c2227g) {
        if (this.f10992f.name.equals(c2227g.f11101h)) {
            C2201e c2201e = (C2201e) this.f10987a.get(c2227g.f11102i);
            if (c2201e != null) {
                c2201e.mo2804d(c2227g);
                m11502f();
            }
        } else {
            throw new IllegalArgumentException("Invalid account.");
        }
    }

    public final synchronized void m11507a(Collection collection) {
        for (C2227g d : collection) {
            m11517d(d);
        }
    }

    public final synchronized void mo2788c(C2227g c2227g) {
        if (this.f10992f.name.equals(c2227g.f11101h)) {
            C2196e c2196e = (C2196e) this.f10987a.get(c2227g.f11102i);
            if (c2196e != null) {
                c2196e.mo2788c(c2227g);
                m11502f();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void m11506a(String str, byte[] bArr) {
        this.f10988b.put(str, bArr);
    }

    public final synchronized byte[] mo2791f(String str) {
        return (byte[]) this.f10988b.get(str);
    }

    public final synchronized int mo2792g() {
        int i;
        i = 0;
        for (C2201e g : this.f10987a.values()) {
            i = g.mo2792g() + i;
        }
        return i;
    }

    public final synchronized void m11526j(String str) {
        C2201e c2201e = (C2201e) this.f10987a.get(str);
        if (c2201e == null) {
            FinskyLog.m21665c("Cannot reset: %s", str);
        } else {
            c2201e.mo2802a();
        }
        m11502f();
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return String.format("{account=%s numapps=%d}", new Object[]{FinskyLog.m21655a(this.f10992f.name), Integer.valueOf(((C2201e) this.f10987a.get(C2229h.f11120a)).mo2792g())});
    }

    public final long mo2794h() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ C2196e mo2793g(String str) {
        return (C2201e) this.f10987a.get(str);
    }
}
