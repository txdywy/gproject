package com.google.android.finsky.ao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C1247k {
    public final int f7410a;
    public final Map f7411b = new HashMap();

    C1247k(C1248l c1248l) {
        this.f7410a = c1248l.f7413b;
        for (Entry entry : c1248l.f7412a.entrySet()) {
            this.f7411b.put((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue()));
        }
    }

    public final List m7248a(String str) {
        if (this.f7411b.containsKey(str)) {
            return (List) this.f7411b.get(str);
        }
        return Collections.emptyList();
    }
}
