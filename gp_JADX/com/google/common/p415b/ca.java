package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

public final class ca {
    static boolean m31781a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public static NavigableSet m31780a(NavigableSet navigableSet) {
        return ((navigableSet instanceof ay) || (navigableSet instanceof cc)) ? navigableSet : new cc(navigableSet);
    }

    static boolean m31783a(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean m31782a(Set set, Collection collection) {
        C6937m.m31623a((Object) collection);
        if (collection instanceof bv) {
            Object a = ((bv) collection).m31773a();
        }
        if (!(a instanceof Set) || a.size() <= set.size()) {
            return ca.m31783a(set, a.iterator());
        }
        Iterator it = set.iterator();
        C6937m.m31623a(a);
        boolean z = false;
        while (it.hasNext()) {
            if (a.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
