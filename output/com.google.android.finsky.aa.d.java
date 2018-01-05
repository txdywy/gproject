package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

protected final class com.google.android.finsky.aa.d extends com.google.android.finsky.aa.n
{

    d(com.google.android.finsky.aa.c p0, String p1, Long p2) {
        com.google.android.finsky.aa.n(p0, p1, p2);
    }

    protected final Object a(SharedPreferences p0) {
        if (p0.contains(this.b))
            v0 = Long.valueOf(p0.getLong(this.b, 0));
        else
            v0 = (Long)this.c;
        return v0;
    }

    protected final void a(SharedPreferences$Editor p0, Object p1) {
        if ((Long)p1 == 0)
            throw new IllegalArgumentException("null cannot be written for <Long>");
        p0.putLong(this.b, ((Long)p1).longValue());
    }

}
