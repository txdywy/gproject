package com.google.android.finsky.p107l;

import android.accounts.Account;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.bn.C2134h;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2228f;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C3646a {
    public final String f18021a;
    public final C2134h f18022b;
    public final C2320a f18023c;
    public final C0988c f18024d;
    public final C1461c f18025e;

    public C3646a(String str, C2134h c2134h, C2320a c2320a, C0988c c0988c, C1461c c1461c) {
        this.f18021a = str;
        this.f18022b = c2134h;
        this.f18023c = c2320a;
        this.f18024d = c0988c;
        this.f18025e = c1461c;
    }

    public final boolean m17248a(Runnable runnable) {
        return this.f18022b.m11204a(runnable);
    }

    public final C3647b m17243a(String str) {
        C2129c a = this.f18022b.mo2657a(str);
        C2322b a2 = this.f18023c.mo2854a(str);
        if (a == null && a2 == null) {
            return null;
        }
        return new C3647b(str, this.f18021a, a2, a);
    }

    public final List m17245a() {
        List arrayList = new ArrayList();
        int i = (((Boolean) C0955b.jH.m28964b()).booleanValue() || this.f18025e.dj().mo2294a(12640410)) ? 1 : 0;
        C3654j c3654j = new C3654j(this.f18025e);
        for (C2129c c2129c : this.f18022b.mo2658a()) {
            if (c2129c.f10809c != -1) {
                C2322b a = this.f18023c.mo2854a(c2129c.f10807a);
                if (i == 0) {
                    c3654j.f18062b = -1;
                    c3654j.f18063c = 0;
                    c3654j.f18064d = 0;
                    c3654j.f18065e = null;
                    c3654j.f18066f = -1;
                    c3654j.f18067g = 0;
                    c3654j.f18068h = 0;
                    c3654j.f18069i = null;
                    if (c3654j.m17261a(c2129c).m17262a(a).m17269e()) {
                    }
                }
                arrayList.add(new C3647b(c2129c.f10807a, this.f18021a, a, c2129c));
            }
        }
        return arrayList;
    }

    private static String[] m17241a(C2322b c2322b) {
        if (c2322b == null) {
            return C2228f.f11114a;
        }
        return c2322b.f11417b;
    }

    public final Collection m17244a(boolean z, List list) {
        Collection arrayList = new ArrayList();
        if (list != null) {
            Set hashSet = new HashSet(list);
        } else {
            Object hashSet2 = new HashSet();
        }
        Map hashMap = new HashMap();
        for (C2129c c2129c : this.f18022b.mo2658a()) {
            hashMap.put(c2129c.f10807a, c2129c);
        }
        for (C2322b c2322b : this.f18023c.mo2855a()) {
            C2322b c2322b2;
            C3647b c3647b = new C3647b(c2322b2.f11416a, this.f18021a, c2322b2, (C2129c) hashMap.remove(c2322b2.f11416a));
            arrayList.add(c3647b);
            r2.remove(c3647b.f18026a);
        }
        if (!z) {
            for (C2129c c2129c2 : hashMap.values()) {
                C3647b c3647b2 = new C3647b(c2129c2.f10807a, this.f18021a, null, c2129c2);
                arrayList.add(c3647b2);
                r2.remove(c3647b2.f18026a);
            }
        }
        for (String a : r2) {
            c2322b2 = this.f18023c.mo2854a(a);
            if (c2322b2 != null) {
                arrayList.add(new C3647b(c2322b2.f11416a, this.f18021a, c2322b2, null));
            }
        }
        return arrayList;
    }

    public final Map m17246a(C2206c c2206c, boolean z) {
        return C3646a.m17242b(c2206c, m17244a(z, null));
    }

    public final Set m17247a(C2206c c2206c, Collection collection) {
        Set linkedHashSet = new LinkedHashSet();
        Set linkedHashSet2 = new LinkedHashSet();
        for (Account account : this.f18024d.cX()) {
            linkedHashSet2.add(account.name);
        }
        for (String str : collection) {
            C3647b a = m17243a(str);
            List list;
            if (a == null || a.f18028c == null) {
                list = null;
            } else {
                list = c2206c.mo2818b(a.f18026a, C3646a.m17241a(a.f18028c));
            }
            if (r1 != null) {
                if (r1.isEmpty()) {
                    linkedHashSet.add(str);
                } else {
                    Object obj;
                    for (C2228f c2228f : r1) {
                        if (linkedHashSet2.contains(c2228f.f11101h)) {
                            obj = 1;
                            break;
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        linkedHashSet.add(str);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static Map m17242b(C2206c c2206c, Collection collection) {
        Map hashMap = new HashMap();
        for (C2197a a : c2206c.mo2822e()) {
            hashMap.put(a.mo2780a().name, new LinkedHashSet());
        }
        for (C3647b c3647b : collection) {
            for (C2228f c2228f : c2206c.mo2818b(c3647b.f18026a, C3646a.m17241a(c3647b.f18028c))) {
                ((Set) hashMap.get(c2228f.f11101h)).add(c3647b.f18026a);
            }
        }
        return hashMap;
    }
}
