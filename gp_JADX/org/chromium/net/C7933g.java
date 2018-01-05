package org.chromium.net;

import java.util.Comparator;

final class C7933g implements Comparator {
    C7933g() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C7935i c7935i = (C7935i) obj;
        C7935i c7935i2 = (C7935i) obj2;
        if ("Fallback-Cronet-Provider".equals(c7935i.mo6606b())) {
            return 1;
        }
        if ("Fallback-Cronet-Provider".equals(c7935i2.mo6606b())) {
            return -1;
        }
        return -C7932f.m37974a(c7935i.mo6607c(), c7935i2.mo6607c());
    }
}
