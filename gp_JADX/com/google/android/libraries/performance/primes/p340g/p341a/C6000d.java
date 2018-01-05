package com.google.android.libraries.performance.primes.p340g.p341a;

import com.google.android.libraries.performance.primes.p340g.C5999b;
import com.google.android.libraries.performance.primes.p340g.C6001a;
import d.a.a.a.a.a.bp;
import d.a.a.a.a.a.br;
import d.a.a.a.a.a.bs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class C6000d implements C5999b {
    public final C5996a f30062a = new C5996a();

    public final void mo5258a(C6001a c6001a, long j) {
        C5996a c5996a = this.f30062a;
        C5997b c5997b = (C5997b) c5996a.f30057a.get(c6001a);
        if (c5997b == null) {
            c5996a.f30057a.putIfAbsent(c6001a, new C5997b(c6001a));
            c5997b = (C5997b) c5996a.f30057a.get(c6001a);
        }
        c5997b.f30059b.m27859a(j);
    }

    public final bp mo5257a() {
        List arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f30062a.f30057a;
        for (C6001a remove : concurrentHashMap.keySet()) {
            C5997b c5997b = (C5997b) concurrentHashMap.remove(remove);
            bs a = c5997b.f30059b.m27858a();
            C6001a remove2 = c5997b.f30058a;
            br brVar = new br();
            brVar.a = remove2.f30064b;
            brVar.b = remove2.f30063a;
            a.b = brVar;
            if (a.c.intValue() > 0) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        bp bpVar = new bp();
        bpVar.t = new bs[arrayList.size()];
        arrayList.toArray(bpVar.t);
        return bpVar;
    }

    public final boolean mo5259b() {
        return !this.f30062a.f30057a.isEmpty();
    }
}
