package com.google.protobuf;

import java.util.Map.Entry;

final class bk implements Entry {
    public Entry f35228a;

    bk(Entry entry) {
        this.f35228a = entry;
    }

    public final Object getKey() {
        return this.f35228a.getKey();
    }

    public final Object getValue() {
        if (((bj) this.f35228a.getValue()) == null) {
            return null;
        }
        return bj.m33005a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof cf) {
            bj bjVar = (bj) this.f35228a.getValue();
            cf cfVar = (cf) obj;
            cf cfVar2 = bjVar.f35226c;
            bjVar.f35224a = null;
            bjVar.f35227d = null;
            bjVar.f35226c = cfVar;
            return cfVar2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
