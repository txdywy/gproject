package com.google.p409c.p410a.p411a.p412a.p413a;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class C6920c {
    public final ConcurrentHashMap f34251a = new ConcurrentHashMap(16, 0.75f, 10);
    public final ReferenceQueue f34252b = new ReferenceQueue();

    C6920c() {
    }

    public final List m31592a(Throwable th, boolean z) {
        Object poll = this.f34252b.poll();
        while (poll != null) {
            this.f34251a.remove(poll);
            poll = this.f34252b.poll();
        }
        List list = (List) this.f34251a.get(new C6921d(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        list = (List) this.f34251a.putIfAbsent(new C6921d(th, this.f34252b), vector);
        return list == null ? vector : list;
    }
}
