package com.google.android.instantapps.common.p219f;

import android.support.v7.widget.eo;
import java.util.ArrayList;
import java.util.List;

public final class C5767d {
    public final List f29171a = new ArrayList();

    public final C5767d m27153a(C3472a c3472a) {
        this.f29171a.add(c3472a);
        return this;
    }

    public final C5766c m27152a() {
        C5766c c5766c = new C5766c();
        int i = 0;
        int i2 = 0;
        for (C3472a c3472a : this.f29171a) {
            List list = c5766c.f29169c;
            int i3 = i + 1;
            eo c5768e = new C5768e(c5766c, c3472a, i, i2);
            c3472a.mo5196a(c5768e);
            list.add(c5768e);
            i = i3;
            i2 = c3472a.mo1039a() + i2;
        }
        return c5766c;
    }
}
