package com.google.android.instantapps.common.p221d.p222a;

import com.google.android.gms.pseudonymous.C5320c;
import java.util.Set;

final /* synthetic */ class C5731u implements Runnable {
    public final C5727q f28996a;
    public final C5320c f28997b;
    public final C5713v f28998c;

    C5731u(C5727q c5727q, C5320c c5320c, C5713v c5713v) {
        this.f28996a = c5727q;
        this.f28997b = c5320c;
        this.f28998c = c5713v;
    }

    public final void run() {
        String str = null;
        C5727q c5727q = this.f28996a;
        C5320c c5320c = this.f28997b;
        C5713v c5713v = this.f28998c;
        if (c5320c.mo4505b().m23271a()) {
            str = String.format("NID=%s;", new Object[]{c5320c.mo4797a().f28479a});
        } else {
            C5727q.f28973a.m27211d("Could not retrieve pseudonymous ID: %s", c5320c.mo4505b());
        }
        try {
            C5724n a = c5727q.f28981i.m27021a(null, c5727q.f28988p, 0, c5727q.m27026a(), c5727q.m27030b(), c5727q.f28979g, null, c5727q.f28987o, c5727q.m27031c());
            a.f28969a.f31128V = str;
            synchronized (c5727q) {
                c5727q.f28975c.put(null, a);
                Set<C5713v> set = c5727q.f28977e;
                c5727q.f28977e = null;
            }
            for (C5713v a2 : set) {
                c5727q.m27028a(a2, a);
            }
        } catch (Throwable e) {
            c5727q.m27029a(c5713v, e);
        }
    }
}
