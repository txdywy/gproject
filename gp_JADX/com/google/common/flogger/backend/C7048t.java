package com.google.common.flogger.backend;

import java.util.Comparator;

final class C7048t implements Comparator {
    C7048t() {
    }

    public final int compare(Object obj, Object obj2) {
        Enum a = C7049u.m32116a(obj);
        Enum a2 = C7049u.m32116a(obj2);
        return a == a2 ? a.mo6005a(obj, obj2) : a.compareTo(a2);
    }
}
