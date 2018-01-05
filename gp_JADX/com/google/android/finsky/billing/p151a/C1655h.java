package com.google.android.finsky.billing.p151a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.common.C1791f;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.p131e.C1822k;
import com.google.android.finsky.billing.p153c.C1780b;
import com.google.android.finsky.billing.p153c.C1784h;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.h;
import com.google.wireless.android.finsky.dfe.c.a.l;
import com.google.wireless.android.finsky.dfe.c.a.w;
import com.google.wireless.android.finsky.dfe.nano.gf;
import com.google.wireless.android.finsky.dfe.nano.gg;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C1655h {
    public final C1648a f8605a;
    public final C1461c f8606b;
    public final C1506e f8607c;
    public final C2206c f8608d;
    public final C2320a f8609e;
    public C1784h f8610f;
    public Set f8611g;
    public List f8612h;

    public C1655h(C1648a c1648a, C1461c c1461c, C1506e c1506e, C2206c c2206c, C2320a c2320a) {
        this.f8605a = c1648a;
        this.f8606b = c1461c;
        this.f8607c = c1506e;
        this.f8608d = c2206c;
        this.f8609e = c2320a;
    }

    public final void m9406a(String str) {
        if (this.f8606b.mo2249j(str).mo2294a(12639865)) {
            new C1657j(this).start();
        }
    }

    public final void m9407a(String str, C1651d c1651d) {
        if (this.f8606b.mo2249j(str).mo2294a(12639865)) {
            this.f8605a.m9356a(c1651d);
        }
    }

    public final void m9405a(Context context, C1254c c1254c, gf gfVar, byte[] bArr, gg ggVar, PurchaseParams purchaseParams, C2495w c2495w) {
        List arrayList = new ArrayList();
        for (ax axVar : ggVar.d) {
            w wVar = new w();
            wVar.c = axVar;
            wVar.a(purchaseParams.f9296l);
            arrayList.add(wVar);
        }
        if (arrayList.size() > 0) {
            ao aoVar = new ao();
            if (bArr == null) {
                throw new NullPointerException();
            }
            aoVar.a |= 1;
            aoVar.e = bArr;
            aoVar.b = (w[]) arrayList.toArray(new w[arrayList.size()]);
            if (gfVar.f != null) {
                aoVar.c = gfVar.f;
            }
            aoVar.d = purchaseParams.f9298n;
            String b = C1791f.m9755b(context);
            if (b == null) {
                throw new NullPointerException();
            }
            C2495w c2495w2;
            aoVar.a |= 4;
            aoVar.h = b;
            boolean z = purchaseParams.f9299o;
            Account b2 = c1254c.mo1620b();
            if (this.f8606b.mo2249j(b2.name).mo2294a(12639864)) {
                c2495w2 = c2495w;
            } else {
                c2495w2 = null;
            }
            C1780b c1780b = new C1780b(new C1822k(context, c2495w2), b2, new C2792h(null), this.f8606b.mo2249j(b2.name).mo2294a(12635441), null);
            c1780b.m9732a(new C1656i(this, aoVar, c1780b, context, b2, c1254c, c2495w), z);
        }
    }

    static String m9402b(String str) {
        String valueOf = String.valueOf("#acquireCacheConfig=");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final boolean m9408b(String str, C1651d c1651d) {
        h d = this.f8605a.m9364d(C1655h.m9402b(str), c1651d);
        if (d == null || d.a == null) {
            this.f8611g = Collections.emptySet();
        } else {
            this.f8611g = new HashSet(Arrays.asList(d.a));
        }
        if (d == null || d.b == null) {
            this.f8612h = Collections.emptyList();
        } else {
            this.f8612h = Arrays.asList(d.b);
        }
        return d != null;
    }

    public final String m9404a(Context context, String str, String str2, l lVar) {
        StringBuilder append = new StringBuilder().append(str).append("#").append(str2);
        m9401a(append, context, lVar);
        return append.toString();
    }

    public final String m9403a(Context context, String str, l lVar) {
        StringBuilder append = new StringBuilder().append(str).append("#@priority_cache_key");
        m9401a(append, context, lVar);
        return append.toString();
    }

    private final void m9401a(StringBuilder stringBuilder, Context context, l lVar) {
        if (!this.f8611g.contains("#simId")) {
            stringBuilder.append("##simId=").append(C1791f.m9755b(context));
        }
        for (String str : this.f8612h) {
            try {
                Method method = lVar.getClass().getMethod(str, new Class[0]);
                method.setAccessible(true);
                Object invoke = method.invoke(lVar, new Object[0]);
                stringBuilder.append("#").append(str).append("=").append(invoke == null ? "null" : invoke.toString());
            } catch (NoSuchMethodException e) {
                FinskyLog.m21665c("Got an exception trying to get proto method: %s", e);
            } catch (InvocationTargetException e2) {
                FinskyLog.m21665c("Got an exception trying to invoke proto getter: %s", e2);
            } catch (IllegalAccessException e3) {
                FinskyLog.m21665c("Got an exception trying to access proto getter: %s", e3);
            }
        }
    }
}
