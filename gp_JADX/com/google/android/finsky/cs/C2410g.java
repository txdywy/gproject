package com.google.android.finsky.cs;

import java.util.HashSet;
import java.util.Set;

public final class C2410g extends C2406a {
    public Set f11711b = new HashSet();

    public C2410g() {
        mo2900a();
    }

    protected final void mo2900a() {
        String str = "TestNetwork";
        String str2 = "use_dfe_v2";
        m12112a(str, str2, Boolean.valueOf(false));
        this.f11711b.add(C2406a.m12110a(str, str2));
        m12112a("Phenotype", "non_cache_clearing", Boolean.valueOf(false));
    }
}
