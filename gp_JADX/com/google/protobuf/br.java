package com.google.protobuf;

import java.util.Collection;
import java.util.List;

final class br extends bp {
    br() {
    }

    final List mo6143a(Object obj, long j) {
        bh c = m33025c(obj, j);
        if (c.mo6092a()) {
            return c;
        }
        int size = c.size();
        Object a = c.mo6094a(size == 0 ? 10 : size * 2);
        ea.m33370a(obj, j, a);
        return a;
    }

    final void mo6145b(Object obj, long j) {
        m33025c(obj, j).mo6093b();
    }

    final void mo6144a(Object obj, Object obj2, long j) {
        Object c = m33025c(obj, j);
        Collection c2 = m33025c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo6092a()) {
                c = c.mo6094a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size <= 0) {
            Collection collection = c2;
        }
        ea.m33370a(obj, j, c);
    }

    private static bh m33025c(Object obj, long j) {
        return (bh) ea.m33385f(obj, j);
    }
}
