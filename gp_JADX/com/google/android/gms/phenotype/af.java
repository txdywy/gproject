package com.google.android.gms.phenotype;

import java.util.Comparator;

final class af implements Comparator {
    af() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Flag flag = (Flag) obj;
        Flag flag2 = (Flag) obj2;
        return flag.f28309h == flag2.f28309h ? flag.f28302a.compareTo(flag2.f28302a) : flag.f28309h - flag2.f28309h;
    }
}
