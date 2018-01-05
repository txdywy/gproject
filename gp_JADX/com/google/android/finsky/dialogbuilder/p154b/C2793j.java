package com.google.android.finsky.dialogbuilder.p154b;

import android.os.Bundle;
import android.view.View;
import com.google.android.finsky.dialogbuilder.C1762d;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.dfe.c.a.dm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class C2793j {
    public final C1762d f15094a;
    public Set f15095b = new HashSet();
    public boolean f15096c;
    public boolean f15097d;
    public Map f15098e = new HashMap();
    public Map f15099f = new HashMap();
    public Map f15100g = new HashMap();
    public Map f15101h = new HashMap();

    public C2793j(C1762d c1762d, Bundle bundle) {
        if (bundle != null && bundle.containsKey("DialogVisibilityModel.tags")) {
            this.f15095b.addAll(bundle.getStringArrayList("DialogVisibilityModel.tags"));
            this.f15097d = true;
        }
        this.f15094a = c1762d;
    }

    public final void m14878a(View view, dm dmVar, ad adVar) {
        if (dmVar != null && dmVar.n.length != 0) {
            for (Object obj : dmVar.n) {
                if (!this.f15098e.containsKey(obj)) {
                    this.f15098e.put(obj, new HashSet());
                }
                ((Set) this.f15098e.get(obj)).add(view);
                if (!this.f15099f.containsKey(view)) {
                    this.f15099f.put(view, new HashSet());
                }
                ((Set) this.f15099f.get(view)).add(obj);
                if (adVar != null) {
                    this.f15100g.put(view, adVar);
                }
            }
        }
    }

    public final void m14877a() {
        this.f15097d = false;
        this.f15096c = true;
        Map hashMap = new HashMap();
        for (String put : this.f15095b) {
            hashMap.put(put, Boolean.valueOf(false));
        }
        if (hashMap.size() > 0) {
            m14876a(hashMap.keySet(), true);
        }
        for (View view : this.f15100g.keySet()) {
            if (view.getVisibility() == 0) {
                this.f15094a.m9662a((ad) this.f15100g.get(view));
            }
        }
    }

    public final void m14879a(String str) {
        Map hashMap = new HashMap();
        hashMap.put(str, Boolean.valueOf(false));
        m14875a(hashMap);
    }

    public final void m14881a(String... strArr) {
        Map hashMap = new HashMap();
        for (Object obj : strArr) {
            if (obj != null) {
                if (this.f15095b.contains(obj)) {
                    hashMap.put(obj, Boolean.valueOf(true));
                } else {
                    hashMap.put(obj, Boolean.valueOf(false));
                }
            }
        }
        m14875a(hashMap);
    }

    private final void m14875a(Map map) {
        if (!this.f15097d) {
            int i = 0;
            for (Entry entry : map.entrySet()) {
                int remove;
                String str = (String) entry.getKey();
                Boolean bool = (Boolean) entry.getValue();
                if (bool.booleanValue()) {
                    remove = this.f15095b.remove(str);
                } else {
                    remove = this.f15095b.add(str);
                }
                if (remove != 0) {
                    boolean booleanValue = bool.booleanValue();
                    List<C2765k> list = (List) this.f15101h.get(str);
                    if (list != null) {
                        for (C2765k a : list) {
                            a.mo3132a(booleanValue);
                        }
                    }
                }
                i |= remove;
            }
            if (this.f15096c && i != 0) {
                m14876a(map.keySet(), false);
            }
        }
    }

    private final void m14876a(Set set, boolean z) {
        for (String str : set) {
            Set<View> set2 = (Set) this.f15098e.get(str);
            if (set2 != null) {
                for (View view : set2) {
                    int i;
                    Set hashSet = new HashSet((Collection) this.f15099f.get(view));
                    hashSet.retainAll(this.f15095b);
                    Object obj;
                    if (view.getVisibility() != 0) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (hashSet.size() > 0) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    view.setVisibility(i);
                    if (!(z || r1 == null || view.getVisibility() != 0)) {
                        this.f15094a.m9662a((ad) this.f15100g.get(view));
                    }
                }
            }
        }
    }

    public final void m14880a(String str, C2765k c2765k) {
        if (!this.f15101h.containsKey(str)) {
            this.f15101h.put(str, new ArrayList());
        }
        ((List) this.f15101h.get(str)).add(c2765k);
    }
}
