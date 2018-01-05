package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class cb implements ca {
    cb() {
    }

    public final Map mo6149a(Object obj) {
        return (bz) obj;
    }

    public final by mo6150b() {
        throw new NoSuchMethodError();
    }

    public final Map mo6151b(Object obj) {
        return (bz) obj;
    }

    public final boolean mo6152c(Object obj) {
        return !((bz) obj).f35249a;
    }

    public final Object mo6153d(Object obj) {
        ((bz) obj).f35249a = false;
        return obj;
    }

    public final Object mo6147a() {
        return bz.f35248b.m33048a();
    }

    public final Object mo6148a(Object obj, Object obj2) {
        obj = (bz) obj;
        bz bzVar = (bz) obj2;
        if (!bzVar.isEmpty()) {
            if (!obj.f35249a) {
                obj = obj.m33048a();
            }
            obj.m33049b();
            if (!bzVar.isEmpty()) {
                obj.putAll(bzVar);
            }
        }
        return obj;
    }

    public final int mo6154e(Object obj) {
        bz bzVar = (bz) obj;
        if (!bzVar.isEmpty()) {
            Iterator it = bzVar.entrySet().iterator();
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw new NoSuchMethodError();
            }
        }
        return 0;
    }
}
