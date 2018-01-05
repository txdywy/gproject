package com.google.android.finsky.ao;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public final class com.google.android.finsky.ao.k
{

    public final int a;
    public final Map b;

    k(com.google.android.finsky.ao.l p0) {
        this.a = p0.b;
        v2 = p0.a.entrySet().iterator();
        this.b = new HashMap();
        while (v2.hasNext()) {
            v0 = (Map$Entry)v2.next();
            this.b.put((String)v0.getKey(), Collections.unmodifiableList((List)v0.getValue()));
        }
    }

    public final List a(String p0) {
        if (!this.b.containsKey(p0))
            v0 = Collections.emptyList();
        else
            v0 = (List)this.b.get(p0);
        return v0;
    }

}
