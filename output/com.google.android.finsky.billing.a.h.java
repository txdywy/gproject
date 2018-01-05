package com.google.android.finsky.billing.a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.api.c;
import com.google.android.finsky.as.e;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.c.b;
import com.google.android.finsky.billing.c.h;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.f;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.by.c;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.h;
import com.google.wireless.android.finsky.dfe.c.a.l;
import com.google.wireless.android.finsky.dfe.c.a.w;
import com.google.wireless.android.finsky.dfe.nano.gf;
import com.google.wireless.android.finsky.dfe.nano.gg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class com.google.android.finsky.billing.a.h
{

    public final com.google.android.finsky.billing.a.a a;
    public final com.google.android.finsky.ba.c b;
    public final com.google.android.finsky.as.e c;
    public final com.google.android.finsky.by.c d;
    public final com.google.android.finsky.cn.a e;
    public com.google.android.finsky.billing.c.h f;
    public Set g;
    public List h;

    h(com.google.android.finsky.billing.a.a p0, com.google.android.finsky.ba.c p1, com.google.android.finsky.as.e p2, com.google.android.finsky.by.c p3, com.google.android.finsky.cn.a p4) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
    }

    private final void a(StringBuilder p0, Context p1, com.google.wireless.android.finsky.dfe.c.a.l p2) {
 10:    if (!this.g.contains("#simId"))
 22:        p0.append("##simId=").append(com.google.android.finsky.billing.common.f.b(p1));
 27:    v2 = this.h.iterator();
 35:    if (!v2.hasNext())
127:        return;
 41:    v0 = (String)v2.next();
 50:    v1 = p2.getClass().getMethod(v0, new Class[0]);
 55:    v1.setAccessible(1);
 61:    v1 = v1.invoke(p2, new Object[0]);
 65:    if (v1 != 0) goto 100;
 67:    v1 = "null";
 85:    p0.append("#").append(v0).append("=").append(v1);
 88:    goto 31;
 92:    v3 = new Object[1];
 94:    v3[0] = ex;
 96:    FinskyLog.c("Got an exception trying to get proto method: %s", v3);
 99:    goto 31;
100:    v1 = v1.toString();
104:    goto 69;
108:    v3 = new Object[1];
110:    v3[0] = ex;
112:    FinskyLog.c("Got an exception trying to invoke proto getter: %s", v3);
115:    goto 31;
119:    v3 = new Object[1];
121:    v3[0] = ex;
123:    FinskyLog.c("Got an exception trying to access proto getter: %s", v3);
126:    goto 31;
128:    try
            run 100...103
        catch (NoSuchMethodException ex) {
100:        goto 89;
        }
        catch (InvocationTargetException ex) {
100:        goto 105;
        }
        catch (IllegalAccessException ex) {
100:        goto 116;
        }
129:    try
            run 43...88
        catch (NoSuchMethodException ex) {
 43:        goto 89;
        }
        catch (InvocationTargetException ex) {
 43:        goto 105;
        }
        catch (IllegalAccessException ex) {
 43:        goto 116;
        }
    }

    static String b(String p0) {
        v1 = String.valueOf("#acquireCacheConfig=");
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        return v0;
    }

    public final String a(Context p0, String p1, com.google.wireless.android.finsky.dfe.c.a.l p2) {
        v0 = new StringBuilder().append(p1).append("#@priority_cache_key");
        this.a(v0, p0, p2);
        return v0.toString();
    }

    public final String a(Context p0, String p1, String p2, com.google.wireless.android.finsky.dfe.c.a.l p3) {
        v0 = new StringBuilder().append(p1).append("#").append(p2);
        this.a(v0, p0, p3);
        return v0.toString();
    }

    public final void a(Context p0, com.google.android.finsky.api.c p1, com.google.wireless.android.finsky.dfe.nano.gf p2, byte[] p3, com.google.wireless.android.finsky.dfe.nano.gg p4, PurchaseParams p5, com.google.android.finsky.d.w p6) {
        v3 = new ArrayList();
        v2 = 0;
        while (v2 < p4.d.length) {
            v7 = new com.google.wireless.android.finsky.dfe.c.a.w();
            v7.c = p4.d[v2];
            v7.a(p5.l);
            v3.add(v7);
            v2 = v2 + 1;
        }
        if (v3.size() > 0) {
            v8 = new com.google.wireless.android.finsky.dfe.c.a.ao();
            if (p3 == 0)
                throw new NullPointerException();
            v8.a = v8.a | 1;
            v8.e = p3;
            v8.b = (w[])v3.toArray(new w[v3.size()]);
            if (p2.f != 0)
                v8.c = p2.f;
            v8.d = p5.n;
            v2 = com.google.android.finsky.billing.common.f.b(p0);
            if (v2 == 0)
                throw new NullPointerException();
            v8.a = v8.a | 4;
            v8.h = v2;
            v4 = p1.b();
            if (this.b.j(v4.name).a(12639864))
                v5 = p6;
            else
                v5 = 0;
            v2 = new com.google.android.finsky.billing.c.b(new com.google.android.finsky.billing.e.k(p0, v5), v4, new com.google.android.finsky.dialogbuilder.b.h(0), this.b.j(v4.name).a(12635441), 0);
            v2.a(new com.google.android.finsky.billing.a.i(this, v8, v2, p0, v4, p1, p6), p5.o);
        }
    }

    public final void a(String p0) {
        if (this.b.j(p0).a(12639865))
            new com.google.android.finsky.billing.a.j(this).start();
    }

    public final void a(String p0, com.google.android.finsky.billing.a.d p1) {
        if (this.b.j(p0).a(12639865))
            this.a.a(p1);
    }

    public final boolean b(String p0, com.google.android.finsky.billing.a.d p1) {
        v0 = this.a.d(com.google.android.finsky.billing.a.h.b(p0), p1);
        if (v0 != 0 && v0.a != 0)
            this.g = new HashSet(Arrays.asList(v0.a));
        else
            this.g = Collections.emptySet();
        if (v0 != 0 && v0.b != 0)
            this.h = Arrays.asList(v0.b);
        else
            this.h = Collections.emptyList();
        if (v0 != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
