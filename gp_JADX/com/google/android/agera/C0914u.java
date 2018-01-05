package com.google.android.agera;

import java.util.ArrayList;
import java.util.List;

public final class C0914u {
    public static C0893t m5634a(C0893t... c0893tArr) {
        return C0914u.m5633a(0, c0893tArr);
    }

    static C0893t m5633a(int i, C0893t... c0893tArr) {
        if (c0893tArr.length == 0) {
            return new C0916w(i, new C0893t[0]);
        }
        if (c0893tArr.length == 1) {
            C0893t c0893t = c0893tArr[0];
            if ((c0893t instanceof C0916w) && ((C0916w) c0893t).d == 0) {
                return new C0916w(i, ((C0916w) c0893t).f5691i);
            }
            return new C0916w(i, c0893t);
        }
        List arrayList = new ArrayList();
        for (Object obj : c0893tArr) {
            if ((obj instanceof C0916w) && ((C0916w) obj).d == 0) {
                for (Object obj2 : ((C0916w) obj).f5691i) {
                    if (!arrayList.contains(obj2)) {
                        arrayList.add(obj2);
                    }
                }
            } else if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return new C0916w(i, (C0893t[]) arrayList.toArray(new C0893t[arrayList.size()]));
    }
}
