package com.google.android.finsky.uninstall;

import java.util.Comparator;

final class bc implements Comparator {
    bc() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C4604s c4604s = (C4604s) obj;
        C4604s c4604s2 = (C4604s) obj2;
        bl a = bl.m21377a();
        long a2 = a.m21378a(c4604s.f23653a);
        long a3 = a.m21378a(c4604s2.f23653a);
        if (a2 == a3) {
            if (c4604s.f23655c == c4604s2.f23655c) {
                return c4604s.f23654b.compareTo(c4604s2.f23654b);
            }
            if (c4604s.f23655c >= c4604s2.f23655c) {
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
