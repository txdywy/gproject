package com.google.android.finsky.al;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public final class C1225k {
    public int f7360a = -1;
    public final List f7361b = new ArrayList();

    public final void m7215a(String str, Object obj) {
        this.f7361b.add(new Pair(str, obj));
    }

    public final List m7214a() {
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f7361b.size(); i++) {
            arrayList.add((String) ((Pair) this.f7361b.get(i)).first);
        }
        return arrayList;
    }
}
