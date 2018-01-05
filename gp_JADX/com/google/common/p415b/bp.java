package com.google.common.p415b;

import com.google.common.p414a.C6934i;
import com.google.common.p414a.C6937m;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class bp extends cb {
    bp() {
    }

    abstract Map mo5904a();

    public int size() {
        return mo5904a().size();
    }

    public void clear() {
        mo5904a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        Object a = bl.m31764a(mo5904a(), key);
        if (!C6934i.m31620a(a, entry.getValue())) {
            return false;
        }
        if (a != null || mo5904a().containsKey(key)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return mo5904a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        return mo5904a().keySet().remove(((Entry) obj).getKey());
    }

    public boolean removeAll(Collection collection) {
        try {
            return super.removeAll((Collection) C6937m.m31623a((Object) collection));
        } catch (UnsupportedOperationException e) {
            return ca.m31783a((Set) this, collection.iterator());
        }
    }

    public boolean retainAll(Collection collection) {
        try {
            return super.retainAll((Collection) C6937m.m31623a((Object) collection));
        } catch (UnsupportedOperationException e) {
            int size = collection.size();
            if (size < 3) {
                ae.m31700a(size, "expectedSize");
                size++;
            } else if (size < MemoryMappedFileBuffer.DEFAULT_SIZE) {
                size = (int) ((((float) size) / 0.75f) + 1.0f);
            } else {
                size = Integer.MAX_VALUE;
            }
            Collection hashSet = new HashSet(size);
            for (Object next : collection) {
                if (contains(next)) {
                    hashSet.add(((Entry) next).getKey());
                }
            }
            return mo5904a().keySet().retainAll(hashSet);
        }
    }
}
