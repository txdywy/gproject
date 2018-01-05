package com.google.common.p415b;

import java.util.Iterator;

public final class ba {
    public static Object m31753a(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder append = new StringBuilder("expected one element but was: <").append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            append.append(", ").append(it.next());
        }
        if (it.hasNext()) {
            append.append(", ...");
        }
        append.append('>');
        throw new IllegalArgumentException(append.toString());
    }
}
