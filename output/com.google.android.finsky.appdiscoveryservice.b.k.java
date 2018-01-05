package com.google.android.finsky.appdiscoveryservice.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.android.vending.a.a;
import com.google.android.finsky.appdiscoveryservice.a.a;
import com.google.android.finsky.appdiscoveryservice.i;
import com.google.android.finsky.appdiscoveryservice.s;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.instantappscompatibility.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

protected class com.google.android.finsky.appdiscoveryservice.b.k extends com.google.android.finsky.appdiscoveryservice.b.f
{

    public final com.google.android.finsky.appdiscoveryservice.s D;
    public String E;
    public int F;
    public com.google.android.finsky.appdiscoveryservice.a.a G;
    public final com.google.android.finsky.appdiscoveryservice.b.e d;
    public final com.google.android.finsky.appdiscoveryservice.i e;
    public final com.google.android.finsky.instantappscompatibility.b h;

    k(Context p0, com.google.android.finsky.appdiscoveryservice.b.h p1, int p2, int p3, int p4, String p5, String p6, int p7, com.android.vending.a.a p8, com.google.android.finsky.instantappscompatibility.b p9, com.google.android.finsky.appdiscoveryservice.s p10, com.google.android.finsky.appdiscoveryservice.i p11, com.google.android.finsky.appdiscoveryservice.b.e p12, com.google.android.finsky.appdiscoveryservice.a.a p13) {
        com.google.android.finsky.appdiscoveryservice.b.f(p0, p1, p2, p3, p4, p5, p8);
        this.E = p6;
        this.F = p7;
        this.h = p9;
        this.D = p10;
        this.e = p11;
        this.d = p12;
        this.G = p13;
    }

    private final List a(String p0, List p1) {
        if (p1 != 0 && !p1.isEmpty()) {
            v3 = new ArrayList();
            v1 = p1.iterator();
            while (v1.hasNext()) {
                v0 = (InstantAppInfo)v1.next();
                if (!this.e.a(v0))
                    continue;
                v3.add(v0);
            }
            if (TextUtils.isEmpty(p0)) {
                v0 = this.G.a(v3);
                if (v0 != 0)
                    p1 = Collections.singletonList(v0);
                else {
                    v0 = this.G.b(v3);
                    if (v0 != 0)
                        p1 = Collections.singletonList(v0);
                    else
                        p1 = Collections.emptyList();
                }
            }
            else {
                v4 = new SparseArray();
                v5 = new HashMap();
                v2 = 0;
                while (v2 < v3.size()) {
                    v0 = (InstantAppInfo)v3.get(v2);
                    v1 = v0.a(this.h).toString();
                    v5.put(v0.a(), v1);
                    v1 = this.D.a(p0, v1);
                    if (v1 >= 0) {
                        if (v4.indexOfKey(v1) < 0)
                            v4.put(v1, new ArrayList());
                        ((List)v4.get(v1)).add(v0);
                    }
                    v2 = v2 + 1;
                }
                p1 = new ArrayList();
                v1 = v4.size() - 1;
                while (v1 >= 0) {
                    v0 = v4.get(v4.keyAt(v1));
                    Collections.sort((List)v0, new com.google.android.finsky.appdiscoveryservice.b.l(v5));
                    p1.addAll((List)v0);
                    v1 = v1 - 1;
                }
            }
        }
        return p1;
    }

    protected void a(Context p0, String p1) {
 22:    this.d.a(this.v, this.w, this.E, this.F, p1, 1, this.x, this.g());
 27:    v0 = 0;
 28:    if (this.x <= 0) {
 58:        this.f();
 68:        this.d.a(p1, com.google.android.finsky.utils.i.b() - com.google.android.finsky.utils.i.b(), v0);
 71:        return;
        }
 34:    v3 = this.b(p0, p1).iterator();
 38:    v1 = 0;
 43:    if (!v3.hasNext()) goto 74;
 51:    this.a((Bundle)v3.next());
 54:    v0 = v1 + 1;
 56:    if (v0 != this.x) goto 72;
 58:    this.f();
 68:    this.d.a(p1, com.google.android.finsky.utils.i.b() - com.google.android.finsky.utils.i.b(), v0);
 71:    return;
 72:    v1 = v0;
 73:    goto 39;
 74:    v0 = v1;
 75:    goto 58;
    }

    protected final List b(Context p0, String p1) {
        v10 = new ArrayList();
        v0 = this.a(p1, this.h.a());
        if (v0 == 0 || v0.isEmpty()) {
            FinskyLog.b("No instant apps", new Object[0]);
            v0 = v10;
        }
        else {
            v4 = new Object[1];
            v4[0] = Integer.valueOf(Math.min(this.x, v0.size()));
            FinskyLog.b("Found %d instant apps", v4);
            v11 = v0.iterator();
            while (v11.hasNext()) {
                v2 = (InstantAppInfo)v11.next();
                if (v2.a == 0)
                    continue;
                v0 = this.e.a(p0, v2, 0, this.E, this.F, this.v, this.w, 0, this.d.a);
                if (v0 == 0)
                    continue;
                v10.add(v0);
            }
            v0 = v10;
        }
        return v0;
    }

    protected void b() {
    }

}
