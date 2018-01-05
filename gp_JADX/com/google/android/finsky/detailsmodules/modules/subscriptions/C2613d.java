package com.google.android.finsky.detailsmodules.modules.subscriptions;

import android.accounts.Account;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.by.C2232j;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class C2613d {
    public final Document f13874a;
    public final C2616g f13875b;
    public final C1254c f13876c;
    public final C2206c f13877d;

    C2613d(Document document, C2616g c2616g, C1254c c1254c, C2206c c2206c) {
        this.f13874a = document;
        this.f13875b = c2616g;
        this.f13876c = c1254c;
        this.f13877d = c2206c;
    }

    final void m13710a() {
        Map hashMap = new HashMap();
        C2197a a = this.f13877d.mo2811a(this.f13876c.mo1620b());
        for (C2197a c2197a : this.f13877d.mo2822e()) {
            if (c2197a != a) {
                m13709a(c2197a, hashMap);
            }
        }
        m13709a(a, hashMap);
        m13711a(new ArrayList(hashMap.keySet()), hashMap);
    }

    private final void m13709a(C2197a c2197a, Map map) {
        for (C2232j c2232j : c2197a.mo2789d(this.f13874a.f14885a.f12097d)) {
            map.put(c2232j.f11104k, c2232j);
        }
    }

    final void m13712b() {
        Collection arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        if (this.f13874a.bj()) {
            Account b = this.f13876c.mo1620b();
            for (Document document : this.f13874a.bl()) {
                C2231n e = this.f13877d.mo2811a(b).mo2790e(document.f14885a.f12097d);
                if (e != null) {
                    arrayList.add(document);
                    arrayList2.add(e);
                }
            }
            this.f13875b.mo2981a(new ArrayList(arrayList), new ArrayList(arrayList2));
        }
    }

    final void m13711a(List list, Map map) {
        if (!list.isEmpty()) {
            this.f13876c.mo1605a(C1283d.m7689a(list), false, new C2614e(this, map), C2615f.f13880a);
        }
    }
}
