package com.google.android.finsky.dv;

import android.content.Context;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.p120d.C1805b;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.dfemodel.C2728s;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p264x.C4806a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class C2899a extends C2728s {
    public final Context f15410d;
    public final C2127b f15411e;
    public final C2206c f15412f;
    public final C2233o f15413g;
    public final C1287h f15414k;
    public final C2320a f15415l;
    public final C1461c f15416m;
    public final C0986a f15417n;
    public final C4806a f15418o;
    public final C1805b f15419p;
    public final C2903e f15420q;
    public List f15421r;

    protected C2899a(Context context, C1287h c1287h, C1461c c1461c, C2127b c2127b, C2206c c2206c, C2233o c2233o, C2320a c2320a, C0986a c0986a, C4806a c4806a, C1805b c1805b, C2903e c2903e) {
        super(c2903e.f15438b);
        this.f15410d = context.getApplicationContext();
        this.f15411e = c2127b;
        this.f15412f = c2206c;
        this.f15414k = c1287h;
        this.f15413g = c2233o;
        this.f15415l = c2320a;
        this.f15416m = c1461c;
        this.f15417n = c0986a;
        this.f15418o = c4806a;
        this.f15419p = c1805b;
        this.f15420q = c2903e;
    }

    public final void m15156a(String str, Map map) {
        if (map.size() > 1) {
            Set set = (Set) map.get(str);
            Set set2;
            if (set == null) {
                set2 = (Set) map.get((String) map.keySet().iterator().next());
            } else {
                set2 = set;
            }
            Set hashSet = new HashSet();
            for (String str2 : r2) {
                if (!("com.google.android.gms".equals(str2) || m15154a(str2))) {
                    hashSet.add(str2);
                }
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                set = (Set) ((Entry) it.next()).getValue();
                if (set != r2) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        if (!("com.google.android.gms".equals(str3) || m15154a(str3))) {
                            if (hashSet.contains(str3)) {
                                it2.remove();
                            } else {
                                hashSet.add(str3);
                            }
                        }
                    }
                    if (set.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    private final boolean m15154a(String str) {
        C2129c a = this.f15411e.mo2657a(str);
        return (a == null || (a.f10824r & 1) == 0) ? false : true;
    }

    public final void m15157a(Map map) {
        if (this.f15420q.f15439c) {
            bb.m21792a(new C2900b(this, map), new Void[0]);
        } else {
            m15158b(map);
        }
    }

    final void m15158b(Map map) {
        for (Set set : map.values()) {
            if (this.f15420q.f15437a) {
                set.add("com.google.android.gms");
            } else {
                set.remove("com.google.android.gms");
                set.remove("com.google.android.instantapps.supervisor");
            }
            set.addAll(this.f15420q.f15441e);
        }
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List arrayList = new ArrayList((Collection) entry.getValue());
            if (arrayList.size() != 0) {
                List arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Integer num;
                    Long l;
                    String str2 = (String) arrayList.get(i);
                    C2322b a = this.f15415l.mo2854a(str2);
                    int i2 = a == null ? -1 : a.f11419d;
                    if (a == null || a.f11420e == 0) {
                        num = null;
                    } else {
                        num = Integer.valueOf(a.f11420e);
                    }
                    if (a == null || a.f11421f == 0) {
                        l = null;
                    } else {
                        l = Long.valueOf(a.f11421f);
                    }
                    String[] strArr = a == null ? null : a.f11430o;
                    boolean z = this.f15420q.f15439c && m15153a(a);
                    arrayList2.add(new C1283d(str2, i2, num, l, strArr, this.f15420q.f15440d, Boolean.valueOf(z)));
                }
                m14759a(this.f15414k.mo2016a(str), arrayList2, this.f15420q.f15437a);
            }
        }
    }

    protected final void mo3191a(Runnable runnable) {
        Map map;
        String str;
        if (this.f15421r != null) {
            FinskyLog.m21665c("Unexpected repeat collation", new Object[0]);
        }
        Set<String> hashSet = new HashSet();
        Map hashMap = new HashMap();
        for (C2718h c2718h : this.a) {
            if (!this.f15420q.f15438b || c2718h.mo2861a()) {
                List<Document> b = c2718h.m14719b();
                if (b == null) {
                    map = null;
                    break;
                }
                hashSet.addAll(c2718h.m14720c());
                String c = c2718h.f14924c.mo1636c();
                for (Document document : b) {
                    String str2 = document.m14625N().f13171k;
                    int i = document.m14625N().f13163c;
                    C2901c c2901c = (C2901c) hashMap.get(str2);
                    if (c2901c == null) {
                        hashMap.put(str2, new C2901c(c, i, document));
                    } else {
                        if (i != c2901c.f15425b) {
                            c2901c.f15427d = true;
                        }
                        if (i > c2901c.f15425b) {
                            c2901c.f15425b = i;
                            c2901c.f15424a = c;
                            c2901c.f15426c = document;
                        }
                    }
                }
            } else {
                hashSet.addAll(Collections.unmodifiableList(c2718h.f14923b));
            }
        }
        for (String str3 : hashSet) {
            C2901c c2901c2 = (C2901c) hashMap.get(str3);
            if (c2901c2 != null) {
                c2901c2.f15427d = true;
            }
        }
        if (this.f15420q.f15439c) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                str = (String) entry.getKey();
                c2901c2 = (C2901c) entry.getValue();
                C2322b a = this.f15415l.mo2854a(str);
                if (m15153a(a) && !this.f15418o.mo4395a(a.f11417b, c2901c2.f15426c.m14625N().f13176p)) {
                    FinskyLog.m21665c("Drop update for package %s due to mismatched certificates", str);
                    it.remove();
                }
            }
        }
        map = hashMap;
        if (map != null) {
            Map hashMap2 = new HashMap();
            this.f15421r = new ArrayList(map.size());
            C2904f c2904f = new C2904f(this.f15411e);
            for (Entry entry2 : map.entrySet()) {
                String str4;
                str = (String) entry2.getKey();
                c2901c2 = (C2901c) entry2.getValue();
                Document document2 = c2901c2.f15426c;
                if (document2.m14625N().f13178r && c2901c2.f15427d) {
                    str4 = c2901c2.f15424a;
                } else {
                    str4 = null;
                }
                c2904f.m15159a(document2, str4, this.f15415l, this.f15416m);
                if (this.f15420q.f15439c) {
                    C2322b a2 = this.f15415l.mo2854a(str);
                    if (a2 != null && a2.f11422g) {
                        hashMap2.put(str, c2901c2);
                    }
                }
                if (this.f15420q.f15441e.contains(str)) {
                    hashMap2.put(str, c2901c2);
                }
                this.f15421r.add(document2);
            }
            if (!hashMap2.isEmpty()) {
                new C2902d(this.f15412f, this.f15413g, this.f15417n, this.f15419p, hashMap2.values(), runnable).run();
            } else if (runnable != null) {
                runnable.run();
            }
        }
    }

    private final boolean m15153a(C2322b c2322b) {
        if (c2322b == null || !c2322b.f11422g) {
            return false;
        }
        return this.f15412f.mo2813a(c2322b.f11416a, c2322b.f11417b).isEmpty();
    }
}
