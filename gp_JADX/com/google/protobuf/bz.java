package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class bz extends LinkedHashMap {
    public static final bz f35248b;
    public boolean f35249a = true;

    private bz() {
    }

    private bz(Map map) {
        super(map);
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        m33049b();
        super.clear();
    }

    public final Object put(Object obj, Object obj2) {
        m33049b();
        bb.m32993a(obj);
        bb.m32993a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m33049b();
        for (Object next : map.keySet()) {
            bb.m32993a(next);
            bb.m32993a(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m33049b();
        return super.remove(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            Object obj2;
            obj = (Map) obj;
            if (this != obj) {
                if (size() == obj.size()) {
                    for (Entry entry : entrySet()) {
                        if (!obj.containsKey(entry.getKey())) {
                            obj2 = null;
                            break;
                        }
                        boolean equals;
                        Object value = entry.getValue();
                        Object obj3 = obj.get(entry.getKey());
                        if ((value instanceof byte[]) && (obj3 instanceof byte[])) {
                            equals = Arrays.equals((byte[]) value, (byte[]) obj3);
                            continue;
                        } else {
                            equals = value.equals(obj3);
                            continue;
                        }
                        if (!equals) {
                            obj2 = null;
                            break;
                        }
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                    return true;
                }
            }
            int i = 1;
            if (obj2 != null) {
                return true;
            }
        }
        return false;
    }

    private static int m33047a(Object obj) {
        if (obj instanceof byte[]) {
            return bb.m32999c((byte[]) obj);
        }
        if (!(obj instanceof bc)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i = (m33047a(entry.getValue()) ^ m33047a(entry.getKey())) + i;
        }
        return i;
    }

    public final bz m33048a() {
        return isEmpty() ? new bz() : new bz(this);
    }

    final void m33049b() {
        if (!this.f35249a) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        bz bzVar = new bz();
        f35248b = bzVar;
        bzVar.f35249a = false;
    }
}
