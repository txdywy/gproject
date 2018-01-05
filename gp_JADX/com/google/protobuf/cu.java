package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class cu {
    public static final cu f35284a = new cu();
    public final df f35285b;
    public final ConcurrentMap f35286c = new ConcurrentHashMap();

    public final de m33133a(Class cls) {
        bb.m32995a((Object) cls, "messageType");
        de deVar = (de) this.f35286c.get(cls);
        if (deVar != null) {
            return deVar;
        }
        de a = this.f35285b.mo6146a(cls);
        bb.m32995a((Object) cls, "messageType");
        bb.m32995a((Object) a, "schema");
        deVar = (de) this.f35286c.putIfAbsent(cls, a);
        return deVar != null ? deVar : a;
    }

    public final de m33134a(Object obj) {
        return m33133a(obj.getClass());
    }

    private cu() {
        df dfVar = null;
        String[] strArr = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        for (int i = 0; i <= 0; i++) {
            dfVar = m33132a(strArr[0]);
            if (dfVar != null) {
                break;
            }
        }
        if (dfVar == null) {
            dfVar = new bt();
        }
        this.f35285b = dfVar;
    }

    private static df m33132a(String str) {
        try {
            return (df) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }
}
