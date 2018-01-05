package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.List;

public final class cq {
    public cr f4451a = new cr();

    public final void m4691a(C0722q c0722q, int i) {
        m4692a(c0722q, "res" + i);
    }

    protected final void m4692a(C0722q c0722q, String str) {
        if (c0722q != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(c0722q);
            this.f4451a.m1693a(m4688b(str, c0722q.f4619g), arrayList);
        }
    }

    public final C0722q m4689a(int i, float f) {
        return m4690a("res" + i, f);
    }

    protected final C0722q m4690a(String str, float f) {
        List list = (List) this.f4451a.m1692a(m4688b(str, f));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C0722q) list.get(0);
    }

    private static String m4688b(String str, float f) {
        String format = String.format("%.4f", new Object[]{Float.valueOf(f)});
        return new StringBuilder(String.valueOf(str).length() + String.valueOf(format).length()).append(str).append(format).toString();
    }
}
