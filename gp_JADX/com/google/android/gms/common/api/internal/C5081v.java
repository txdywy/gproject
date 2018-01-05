package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.internal.bf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class C5081v extends aa {
    public final ArrayList f25907a;
    public /* synthetic */ C5075p f25908b;

    public C5081v(C5075p c5075p, ArrayList arrayList) {
        this.f25908b = c5075p;
        super(c5075p);
        this.f25907a = arrayList;
    }

    public final void mo4607a() {
        Set emptySet;
        ac acVar = this.f25908b.f25878a.f25692n;
        C5075p c5075p = this.f25908b;
        if (c5075p.f25894q == null) {
            emptySet = Collections.emptySet();
        } else {
            Set hashSet = new HashSet(c5075p.f25894q.f26005b);
            Map map = c5075p.f25894q.f26007d;
            for (C5053a c5053a : map.keySet()) {
                if (!c5075p.f25878a.f25685g.containsKey(c5053a.m23274b())) {
                    hashSet.addAll(((bf) map.get(c5053a)).f26017a);
                }
            }
            emptySet = hashSet;
        }
        acVar.f25658q = emptySet;
        ArrayList arrayList = this.f25907a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C4949i) obj).m23035a(this.f25908b.f25891n, this.f25908b.f25878a.f25692n.f25658q);
        }
    }
}
