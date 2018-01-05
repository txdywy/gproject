package com.google.protobuf;

import java.util.Map.Entry;

final class ak extends aj {
    ak() {
    }

    final boolean mo6107a(Class cls) {
        return aw.class.isAssignableFrom(cls);
    }

    final am mo6103a(Object obj) {
        return ((aw) obj).f35186a;
    }

    final void mo6106a(Object obj, am amVar) {
        ((aw) obj).f35186a = amVar;
    }

    final am mo6108b(Object obj) {
        am a = mo6103a(obj);
        if (!a.f35115b) {
            return a;
        }
        a = (am) a.clone();
        mo6106a(obj, a);
        return a;
    }

    final void mo6112c(Object obj) {
        mo6103a(obj).m32916a();
    }

    final Object mo6104a() {
        throw new NoSuchMethodError();
    }

    final int mo6102a(Entry entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    final void mo6110b(Entry entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    final Object mo6105a(ah ahVar, cf cfVar, int i) {
        return ahVar.mo6220a(cfVar, i);
    }

    final void mo6109b() {
        throw new NoSuchMethodError();
    }

    final void mo6111c() {
        throw new NoSuchMethodError();
    }
}
