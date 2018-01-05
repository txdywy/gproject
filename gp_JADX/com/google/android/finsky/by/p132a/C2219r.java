package com.google.android.finsky.by.p132a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2228f;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.by.C2230i;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.by.C2232j;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.q;
import com.google.wireless.android.finsky.b.r;
import com.google.wireless.android.finsky.b.s;
import com.google.wireless.android.finsky.b.t;
import com.google.wireless.android.finsky.b.v;
import com.google.wireless.android.finsky.b.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class C2219r {
    public static final long f11071a = ((Long) C0955b.dN.m28964b()).longValue();
    public C1461c f11072b;
    public final C1254c f11073c;
    public final Handler f11074d;
    public final Handler f11075e;
    public final al f11076f;
    public final C2198a f11077g;
    public final List f11078h = new ArrayList();
    public final List f11079i = new ArrayList();
    public aa f11080j;
    public final boolean f11081k;
    public final Runnable f11082l = new C2220s(this);
    public Queue f11083m;

    public C2219r(C1254c c1254c, al alVar, C2198a c2198a, Handler handler, Handler handler2, boolean z) {
        ((C1361n) C3947d.m18649a(C1361n.class)).mo1777a(this);
        this.f11073c = c1254c;
        this.f11076f = alVar;
        this.f11077g = c2198a;
        this.f11074d = handler;
        this.f11075e = handler2;
        this.f11081k = z;
    }

    public final synchronized void m11627a(C2200z c2200z) {
        this.f11078h.add(c2200z);
    }

    public final synchronized void m11628a(String[] strArr, Runnable runnable, String str) {
        if (this.f11081k) {
            String arrays = Arrays.toString(strArr);
            str = new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(arrays).length()).append(str).append(" libraryIds=").append(arrays).toString();
            m11621a(1, null, null, str);
        }
        String[] a = m11624a(strArr);
        if (a == null) {
            FinskyLog.m21659a("Skipping replication request since all libraries are unsupported.", new Object[0]);
            this.f11074d.post(runnable);
        } else {
            this.f11079i.add(new aa(a, runnable, str));
            m11625a(0);
        }
    }

    private final String[] m11624a(String[] strArr) {
        int length;
        int i = 0;
        int i2 = 0;
        for (String h : strArr) {
            String h2;
            if (!this.f11077g.m11524h(h2)) {
                i2++;
            }
        }
        if (i2 == strArr.length) {
            return null;
        }
        if (i2 <= 0) {
            return strArr;
        }
        String[] strArr2 = new String[(strArr.length - i2)];
        length = strArr.length;
        i2 = 0;
        while (i < length) {
            h2 = strArr[i];
            if (this.f11077g.m11524h(h2)) {
                strArr2[i2] = h2;
                i2++;
            }
            i++;
        }
        return strArr2;
    }

    final synchronized void m11626a(aa aaVar) {
        if (this.f11081k) {
            m11621a(1, null, null, aaVar.f10995c);
        }
        this.f11079i.add(0, aaVar);
    }

    final synchronized void m11625a(long j) {
        this.f11075e.removeCallbacks(this.f11082l);
        this.f11075e.postDelayed(this.f11082l, j);
    }

    final boolean m11629a(w wVar, String str) {
        String a;
        if (this.f11081k) {
            m11621a(0, wVar, null, str);
        }
        if (Looper.myLooper() != this.f11075e.getLooper()) {
            FinskyLog.m21669e("This method must be called from the background handler.", new Object[0]);
        }
        if (TextUtils.isEmpty(wVar.e)) {
            a = C2229h.m11636a(wVar.d);
        } else {
            a = wVar.e;
        }
        if (this.f11077g.m11524h(a)) {
            this.f11077g.m11516d();
            try {
                Object obj;
                switch (wVar.c) {
                    case 1:
                        new Object[1][0] = a;
                        this.f11077g.m11519e();
                        return false;
                    case 3:
                        this.f11076f.m11557a(this.f11077g.f10992f, a);
                        this.f11077g.m11526j(a);
                    case 2:
                        List arrayList = new ArrayList(wVar.g.length);
                        obj = null;
                        for (t tVar : wVar.g) {
                            C2227g c2228f;
                            String str2 = this.f11077g.f10992f.name;
                            String str3 = tVar.c.f11833b;
                            int i = tVar.c.f11835d;
                            int i2 = tVar.c.f11834c;
                            int i3 = tVar.d;
                            long j = tVar.e;
                            Long l = null;
                            long j2 = tVar.n;
                            String str4 = null;
                            boolean z = false;
                            r rVar = tVar.l;
                            if (rVar != null) {
                                if (((rVar.a & 1) != 0 ? 1 : null) != null) {
                                    switch (rVar.b) {
                                        case 1:
                                            z = true;
                                            break;
                                        case 2:
                                            str4 = rVar.c;
                                            break;
                                    }
                                }
                            }
                            int i4 = 2;
                            if (tVar.m != null) {
                                i4 = tVar.m.f11837b;
                            }
                            if (((tVar.b & 8) != 0 ? 1 : null) != null) {
                                l = Long.valueOf(tVar.g);
                            }
                            if (!(C2229h.m11637a(a) || tVar.f)) {
                                if (i2 == 1) {
                                    q qVar = tVar.i;
                                    String[] strArr = qVar.b;
                                    long j3 = 0;
                                    if (((qVar.a & 1) != 0 ? 1 : null) != null) {
                                        j3 = qVar.c;
                                    }
                                    long j4 = 0;
                                    if (((qVar.a & 2) != 0 ? 1 : null) != null) {
                                        j4 = qVar.d;
                                    }
                                    boolean z2 = false;
                                    if (((qVar.a & 4) != 0 ? 1 : null) != null) {
                                        z2 = qVar.e;
                                    }
                                    c2228f = new C2228f(str2, str3, i3, j, strArr, j3, j4, z2, z, str4, i4, j2);
                                } else if (C2726q.m14753b(i2) || i3 == 13) {
                                    long j5;
                                    v vVar = tVar.j;
                                    long j6 = vVar.b;
                                    if (l == null) {
                                        l = Long.valueOf(vVar.c);
                                    }
                                    if (((vVar.a & 8) != 0 ? 1 : null) != null) {
                                        j5 = vVar.e;
                                    } else {
                                        j5 = 0;
                                    }
                                    boolean z3 = vVar.d;
                                    if (i == 3) {
                                        c2228f = new C2232j(str2, a, i, str3, i2, i3, j, l.longValue(), j6, j5, z3, vVar.f, vVar.g, j2);
                                    } else {
                                        c2228f = new C2231n(str2, a, i, str3, i2, i3, j, l, j6, j5, z3, z, str4, i4, j2);
                                    }
                                } else if (C2726q.m14750a(i2) && tVar.k != null) {
                                    s sVar = tVar.k;
                                    c2228f = new C2230i(str2, a, str3, i2, i3, sVar.b, sVar.c, j, j2);
                                }
                                if (tVar.f) {
                                    arrayList.add(c2228f);
                                } else {
                                    this.f11077g.mo2788c(c2228f);
                                    this.f11076f.mo2788c(c2228f);
                                    obj = 1;
                                }
                            }
                            c2228f = new C2227g(str2, a, i, str3, i2, i3, j, l != null ? l.longValue() : Long.MAX_VALUE, tVar.h, z, str4, i4, j2);
                            if (tVar.f) {
                                arrayList.add(c2228f);
                            } else {
                                this.f11077g.mo2788c(c2228f);
                                this.f11076f.mo2788c(c2228f);
                                obj = 1;
                            }
                        }
                        this.f11077g.m11507a((Collection) arrayList);
                        this.f11076f.m11558a((Collection) arrayList);
                        if (!(arrayList.isEmpty() && r4 == null)) {
                            m11623a(a);
                            break;
                        }
                        break;
                    default:
                        FinskyLog.m21669e("Unknown LibraryUpdate.status: libraryId=%s, status=%d", a, Integer.valueOf(wVar.c));
                        break;
                }
                if (wVar.f.length > 0) {
                    byte[] bArr = wVar.f;
                    this.f11077g.m11506a(a, bArr);
                    C0954a.m5747a(a, this.f11077g.f10992f.name).m5763a(Base64.encodeToString(bArr, 0));
                    Object[] objArr = new Object[]{a, obj};
                }
                this.f11077g.m11519e();
                return wVar.h;
            } catch (Throwable th) {
                this.f11077g.m11519e();
            }
        } else {
            FinskyLog.m21659a("Ignoring library update for unsupported library %s", a);
            m11621a(5, null, null, str);
            return false;
        }
    }

    private final synchronized void m11623a(String str) {
        for (C2200z c2222u : this.f11078h) {
            this.f11074d.post(new C2222u(c2222u, str));
        }
    }

    private final synchronized void m11621a(int i, w wVar, VolleyError volleyError, String str) {
        if (this.f11083m == null) {
            this.f11083m = new LinkedList();
        }
        C2223v c2223v = new C2223v();
        c2223v.f11090a = System.currentTimeMillis();
        c2223v.f11091b = i;
        c2223v.f11092c = str;
        c2223v.f11093d = wVar;
        c2223v.f11094e = volleyError;
        this.f11083m.add(c2223v);
        if (this.f11083m.size() > 100) {
            this.f11083m.remove();
        }
    }
}
