package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.HashSet;
import java.util.Set;

protected final class com.google.android.finsky.aa.f extends com.google.android.finsky.aa.n
{

    f(com.google.android.finsky.aa.c p0, String p1, Set p2) {
        com.google.android.finsky.aa.n(p0, p1, p2);
    }

    protected final Object a(SharedPreferences p0) {
        if (p0.contains(this.b))
            v1 = p0.getStringSet(this.b, 0);
        else
            v1 = (Set)this.c;
        if (v1 != 0)
            v0 = new HashSet(v1);
        else
            v0 = v1;
        return v0;
    }

    protected final void a(SharedPreferences$Editor p0, Object p1) {
        p0.putStringSet(this.b, (Set)p1);
    }

}
