package com.google.android.finsky.cs;

import java.util.HashSet;
import java.util.Set;

protected final class com.google.android.finsky.cs.g extends com.google.android.finsky.cs.a
{

    public Set b;

    g() {
        com.google.android.finsky.cs.a();
        this.b = new HashSet();
        this.a();
    }

    protected final void a() {
        this.a("TestNetwork", "use_dfe_v2", Boolean.valueOf(0));
        this.b.add(com.google.android.finsky.cs.g.a("TestNetwork", "use_dfe_v2"));
        this.a("Phenotype", "non_cache_clearing", Boolean.valueOf(0));
    }

}
