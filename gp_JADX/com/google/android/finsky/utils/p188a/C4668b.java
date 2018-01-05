package com.google.android.finsky.utils.p188a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C4668b {
    public static List m21678a(List list, C2918a c2918a) {
        if (list == null) {
            return null;
        }
        List arrayList = new ArrayList(list.size());
        for (Object a : list) {
            arrayList.add(c2918a.mo3197a(a));
        }
        return arrayList;
    }

    public static List m21679a(Object[] objArr, C2918a c2918a) {
        if (objArr == null) {
            return null;
        }
        return C4668b.m21678a(Arrays.asList(objArr), c2918a);
    }
}
