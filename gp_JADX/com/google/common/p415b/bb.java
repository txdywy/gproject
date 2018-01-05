package com.google.common.p415b;

import com.google.common.p414a.C6930e;
import com.google.common.p414a.C6937m;
import java.util.Iterator;

public final class bb {
    public static Iterator m31755a(Iterator it, C6930e c6930e) {
        C6937m.m31623a((Object) c6930e);
        return new bd(it, c6930e);
    }

    static Object m31754a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void m31756b(Iterator it) {
        C6937m.m31623a((Object) it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
