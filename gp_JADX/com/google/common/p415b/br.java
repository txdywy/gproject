package com.google.common.p415b;

import com.google.common.p414a.C6934i;
import com.google.common.p414a.C6937m;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class br extends AbstractCollection {
    public final Map f34315a;

    br(Map map) {
        this.f34315a = (Map) C6937m.m31623a((Object) map);
    }

    public final Iterator iterator() {
        return bb.m31755a(this.f34315a.entrySet().iterator(), bm.f34312b);
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException e) {
            for (Entry entry : this.f34315a.entrySet()) {
                if (C6934i.m31620a(obj, entry.getValue())) {
                    this.f34315a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        try {
            return super.removeAll((Collection) C6937m.m31623a((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection hashSet = new HashSet();
            for (Entry entry : this.f34315a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f34315a.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            return super.retainAll((Collection) C6937m.m31623a((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection hashSet = new HashSet();
            for (Entry entry : this.f34315a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f34315a.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f34315a.size();
    }

    public final boolean isEmpty() {
        return this.f34315a.isEmpty();
    }

    public final boolean contains(Object obj) {
        return this.f34315a.containsValue(obj);
    }

    public final void clear() {
        this.f34315a.clear();
    }
}
