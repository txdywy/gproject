package com.google.common.p415b;

import java.util.Collection;
import java.util.Set;

final class C6965v extends C6958q implements Set {
    public final /* synthetic */ C6943c f34359e;

    C6965v(C6943c c6943c, Object obj, Set set) {
        this.f34359e = c6943c;
        super(c6943c, obj, set, null);
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a = ca.m31782a((Set) this.b, collection);
        if (!a) {
            return a;
        }
        C6943c.m31669a(this.f34359e, this.b.size() - size);
        m31807b();
        return a;
    }
}
