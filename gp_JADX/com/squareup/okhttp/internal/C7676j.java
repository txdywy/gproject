package com.squareup.okhttp.internal;

import com.squareup.okhttp.an;
import java.util.LinkedHashSet;
import java.util.Set;

public final class C7676j {
    public final Set f39711a = new LinkedHashSet();

    public final synchronized void m36994a(an anVar) {
        this.f39711a.add(anVar);
    }

    public final synchronized void m36995b(an anVar) {
        this.f39711a.remove(anVar);
    }

    public final synchronized boolean m36996c(an anVar) {
        return this.f39711a.contains(anVar);
    }
}
