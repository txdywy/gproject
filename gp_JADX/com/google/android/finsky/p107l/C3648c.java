package com.google.android.finsky.p107l;

import android.accounts.Account;
import android.os.Handler;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.a.a.a;
import com.google.wireless.android.finsky.dfe.a.a.i;
import com.google.wireless.android.finsky.dfe.a.a.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class C3648c {
    public final C0988c f18030a;
    public final C2206c f18031b;
    public final C2320a f18032c;
    public final Handler f18033d;
    public final Handler f18034e;
    public final List f18035f = new ArrayList();
    public final String f18036g;
    public final String f18037h;
    public final C1287h f18038i;
    public final C2471a f18039j;
    public final C1461c f18040k;

    public C3648c(C0988c c0988c, C2206c c2206c, C2320a c2320a, Handler handler, Handler handler2, String str, String str2, C1287h c1287h, C2471a c2471a, C1461c c1461c) {
        this.f18030a = c0988c;
        this.f18031b = c2206c;
        this.f18032c = c2320a;
        this.f18033d = handler;
        this.f18034e = handler2;
        this.f18036g = str;
        this.f18037h = str2;
        this.f18038i = c1287h;
        this.f18039j = c2471a;
        this.f18040k = c1461c;
    }

    public final void m17255a(Runnable runnable) {
        this.f18031b.mo2815a(new C3649d(this, runnable));
    }

    public final synchronized void m17254a(C0974i c0974i) {
        this.f18035f.add(c0974i);
        if (this.f18035f.size() <= 1) {
            this.f18034e.post(new C3650e(this));
        }
    }

    final synchronized void m17252a(int i, int i2, int i3) {
        if (i2 == i) {
            for (C0974i c0974i : this.f18035f) {
                FinskyLog.m21659a("Completed %d account content syncs with %d successful.", Integer.valueOf(i2), Integer.valueOf(i3));
                if (c0974i != null) {
                    this.f18033d.post(new C3651f(c0974i, i3, i));
                }
            }
            this.f18035f.clear();
        }
    }

    final int m17250a(Collection collection, Map map, List list, List list2) {
        if (map.size() == 0 && list.size() == 0) {
            int i = 0;
            for (C2322b c2322b : collection) {
                int i2 = (!c2322b.f11422g || c2322b.f11423h) ? 1 : 0;
                if (i2 != 0) {
                    List a = this.f18031b.mo2813a(c2322b.f11416a, c2322b.f11417b);
                    if (a.size() > 0) {
                        Account account = (Account) a.get(0);
                        List list3 = (List) map.get(account);
                        if (list3 == null) {
                            list3 = new ArrayList();
                            map.put(account, list3);
                        }
                        list3.add(c2322b);
                        i2 = i;
                    } else {
                        i2 = i + 1;
                    }
                } else {
                    i2 = i;
                }
                if (c2322b.f11422g && !c2322b.f11424i) {
                    list.add(c2322b);
                }
                i = i2;
            }
            for (Account account2 : list2) {
                if (!map.containsKey(account2)) {
                    map.put(account2, Collections.emptyList());
                }
            }
            return i;
        }
        throw new IllegalArgumentException("Buckets must be empty");
    }

    static int m17249a(Collection collection, int i) {
        return collection.hashCode() ^ i;
    }

    final void m17256a(List list, int[] iArr, int[] iArr2, List list2, List list3, List list4) {
        if (list.size() == 0) {
            m17252a(0, 0, 0);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Account account = (Account) list.get(i);
            this.f18038i.mo2016a(account == null ? null : account.name).mo1610a((i) list2.get(i), ((Integer) list4.get(i)).intValue(), (C0660x) list3.get(i), new C3653h(this, iArr, list, iArr2, account));
        }
    }

    final i m17251a(int i, int i2, List list, int i3, int i4, List list2) {
        boolean z = i != i2;
        if ((i3 != i4 ? 1 : null) == null && !z) {
            return null;
        }
        int i5;
        C2322b c2322b;
        int i6;
        i iVar = new i();
        iVar.a |= 1;
        iVar.b = true;
        if (list2 != null) {
            int size = list2.size();
            if (size > 0) {
                iVar.c = new a[size];
                for (i5 = 0; i5 < size; i5++) {
                    c2322b = (C2322b) list2.get(i5);
                    a[] aVarArr = iVar.c;
                    a aVar = new a();
                    aVar.a(c2322b.f11416a);
                    aVar.a(c2322b.f11419d);
                    if (c2322b.f11420e != 0) {
                        aVar.b(c2322b.f11420e);
                    }
                    if (this.f18040k.dj().mo2294a(12640717) && c2322b.f11430o != null && c2322b.f11430o.length > 0) {
                        aVar.g = new o[c2322b.f11430o.length];
                        for (i6 = 0; i6 < c2322b.f11430o.length; i6++) {
                            o[] oVarArr = aVar.g;
                            o oVar = new o();
                            String str = c2322b.f11430o[i6];
                            if (str == null) {
                                throw new NullPointerException();
                            }
                            oVar.b |= 1;
                            oVar.c = str;
                            oVarArr[i6] = oVar;
                        }
                        continue;
                    }
                    aVarArr[i5] = aVar;
                }
            }
        }
        iVar.a |= 2;
        iVar.d = z;
        if (z) {
            i5 = list.size();
            if (i5 > 0) {
                iVar.e = new a[list.size()];
                for (i6 = 0; i6 < i5; i6++) {
                    c2322b = (C2322b) list.get(i6);
                    a[] aVarArr2 = iVar.e;
                    a aVar2 = new a();
                    aVar2.a(c2322b.f11416a);
                    aVar2.a(c2322b.f11419d);
                    if (c2322b.f11420e != 0) {
                        aVar2.b(c2322b.f11420e);
                    }
                    aVar2.f = c2322b.f11417b;
                    aVarArr2[i6] = aVar2;
                }
            }
        }
        return iVar;
    }

    final void m17253a(Account account, VolleyError volleyError) {
        C2495w a = this.f18039j.m13184a(null).m13366a(account);
        C2474c c2474c = new C2474c(162);
        if (volleyError != null) {
            aj.m13208a(c2474c, volleyError, false);
        }
        a.m13367a(c2474c);
    }
}
