package com.google.android.finsky.by.a;

import com.google.android.finsky.aa.b;
import com.google.android.finsky.by.g;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

protected final class com.google.android.finsky.by.a.ak extends com.google.android.finsky.by.a.ai
{

    public static Set a;

    static {
        com.google.android.finsky.by.a.ak.a = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.dh.b()))));
    }

    ak(com.google.android.finsky.by.a.m p0) {
        com.google.android.finsky.by.a.ai(2, p0);
    }

    protected final boolean e(com.google.android.finsky.by.g p0) {
        if ((super.e(p0)) || com.google.android.finsky.by.a.ak.a.contains(p0.k))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
