package com.google.android.finsky.uninstall.v2a;

import java.util.Comparator;

final class ac implements Comparator {
    ac() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        am amVar = (am) obj;
        am amVar2 = (am) obj2;
        af a = af.m21457a();
        long a2 = a.m21458a(amVar.f23734a);
        long a3 = a.m21458a(amVar2.f23734a);
        if (a2 == a3) {
            if (amVar.f23736c == amVar2.f23736c) {
                return amVar.f23735b.compareTo(amVar2.f23735b);
            }
            if (amVar.f23736c >= amVar2.f23736c) {
                return -1;
            }
            return 1;
        } else if (a2 >= a3) {
            return -1;
        } else {
            return 1;
        }
    }
}
