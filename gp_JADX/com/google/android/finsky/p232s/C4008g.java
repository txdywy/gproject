package com.google.android.finsky.p232s;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.tos.C4569e;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class C4008g {
    public List f20115a;
    public Integer f20116b;
    public final C4569e f20117c;

    public C4008g(C4569e c4569e) {
        this.f20117c = c4569e;
    }

    public final C4009h m18753a(C4005d c4005d) {
        if (this.f20115a == null) {
            this.f20115a = new ArrayList();
            for (String a : ((String) C0955b.eS.m28964b()).split(";")) {
                String[] a2 = C4680k.m21818a(a);
                if (a2.length != 4) {
                    FinskyLog.m21665c("Invalid number of items for the Rapid Auto Update data (Expecting 4 got %d). Data: %s", Integer.valueOf(a2.length), a);
                } else {
                    try {
                        this.f20115a.add(new C4009h(a2[0], Integer.parseInt(a2[1]), Integer.parseInt(a2[2]), Integer.parseInt(a2[3])));
                    } catch (IllegalArgumentException e) {
                        FinskyLog.m21665c("Invalid format for the Rapid Auto Update data: %s", a);
                    }
                }
            }
        }
        for (C4009h c4009h : this.f20115a) {
            if (c4005d.f20099e.cf().equals(c4009h.f20118a)) {
                return c4009h;
            }
        }
        return null;
    }
}
