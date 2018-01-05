package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.Collection;

public final class af {
    static boolean m31701a(Collection collection, Object obj) {
        C6937m.m31623a((Object) collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }
}
