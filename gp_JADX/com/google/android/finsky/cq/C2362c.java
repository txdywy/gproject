package com.google.android.finsky.cq;

import java.util.ArrayList;
import java.util.List;

public final class C2362c {
    public final C2361b[] f11589a;
    public final int f11590b;
    public final boolean f11591c;

    public C2362c(C2361b[] c2361bArr, int i, boolean z) {
        this.f11589a = c2361bArr;
        this.f11590b = i;
        this.f11591c = z;
    }

    public final List m11987a() {
        List arrayList = new ArrayList();
        for (Object obj : this.f11589a) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
