package com.google.android.finsky.detailspage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class af extends ai {
    public af(Set set, List list) {
        super(3, set, list);
    }

    protected static aj m13850a() {
        return m13853b(ct.class, go.class, gy.class, ci.class);
    }

    protected static aj m13852b() {
        return m13853b(eo.class, dx.class, gs.class, gw.class, dw.class, dn.class);
    }

    public static List m13851a(Class... clsArr) {
        List arrayList = new ArrayList();
        for (Class ajVar : clsArr) {
            arrayList.add(new aj(ajVar));
        }
        return arrayList;
    }

    protected static aj m13853b(Class... clsArr) {
        return new aj(Arrays.asList(clsArr));
    }
}
