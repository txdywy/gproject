package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class bq extends bp {
    public static final Class f35233c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    bq() {
    }

    final List mo6143a(Object obj, long j) {
        return m33020a(obj, j, 10);
    }

    final void mo6145b(Object obj, long j) {
        Object e;
        List list = (List) ea.m33385f(obj, j);
        if (list instanceof bo) {
            e = ((bo) list).mo6140e();
        } else if (!f35233c.isAssignableFrom(list.getClass())) {
            e = Collections.unmodifiableList(list);
        } else {
            return;
        }
        ea.m33370a(obj, j, e);
    }

    private static List m33020a(Object obj, long j, int i) {
        List c = m33021c(obj, j);
        if (c.isEmpty()) {
            Object bnVar;
            if (c instanceof bo) {
                bnVar = new bn(i);
            } else {
                bnVar = new ArrayList(i);
            }
            ea.m33370a(obj, j, bnVar);
            return bnVar;
        } else if (f35233c.isAssignableFrom(c.getClass())) {
            r1 = new ArrayList(c.size() + i);
            r1.addAll(c);
            ea.m33370a(obj, j, (Object) r1);
            return r1;
        } else if (!(c instanceof dx)) {
            return c;
        } else {
            r1 = new bn(c.size() + i);
            r1.addAll((dx) c);
            ea.m33370a(obj, j, (Object) r1);
            return r1;
        }
    }

    final void mo6144a(Object obj, Object obj2, long j) {
        Collection c = m33021c(obj2, j);
        Object a = m33020a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size <= 0) {
            Collection collection = c;
        }
        ea.m33370a(obj, j, a);
    }

    private static List m33021c(Object obj, long j) {
        return (List) ea.m33385f(obj, j);
    }
}
