package com.google.android.gms.peerdownloadmanager.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C5384o {
    public final C5371a f27966a;
    public final Set f27967b;

    public C5384o(C5371a c5371a) {
        this.f27966a = c5371a;
        this.f27967b = new HashSet();
    }

    public C5384o(C5371a c5371a, Set set) {
        this.f27966a = c5371a;
        this.f27967b = set;
    }

    public static Collection m26158a(Collection collection, Collection collection2) {
        Collection hashSet = new HashSet();
        for (C5384o c5384o : collection) {
            for (C5384o c5384o2 : collection2) {
                if (c5384o.f27966a.equals(c5384o2.f27966a)) {
                    Set hashSet2 = new HashSet(c5384o.f27967b);
                    hashSet2.retainAll(c5384o2.f27967b);
                    if (!hashSet2.isEmpty()) {
                        hashSet.add(new C5384o(c5384o.f27966a, hashSet2));
                    }
                }
            }
        }
        return hashSet;
    }

    public static Map m26159a(Collection collection) {
        Map hashMap = new HashMap();
        for (C5384o c5384o : collection) {
            List arrayList = new ArrayList(c5384o.f27967b);
            Collections.sort(arrayList);
            hashMap.put(c5384o.f27966a, arrayList);
        }
        return hashMap;
    }

    public final void m26160a(String str) {
        this.f27967b.add(str);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27966a);
        String arrays = Arrays.toString(this.f27967b.toArray());
        return new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(arrays).length()).append("ResourceId(").append(valueOf).append(", ").append(arrays).append(")").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5384o c5384o = (C5384o) obj;
        if (this.f27966a.equals(c5384o.f27966a) && this.f27967b.equals(c5384o.f27967b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27966a.hashCode() * 31) + this.f27967b.hashCode();
    }
}
