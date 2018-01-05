package com.google.android.finsky.by.p132a;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.utils.C4680k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ak extends ai {
    public static Set f11025a = Collections.unmodifiableSet(new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.dh.m28964b()))));

    public ak(C2203m c2203m) {
        super(2, c2203m);
    }

    protected final boolean mo2805e(C2227g c2227g) {
        return super.mo2805e(c2227g) || f11025a.contains(c2227g.f11104k);
    }
}
