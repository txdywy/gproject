package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

protected final class com.google.android.finsky.aa.h extends com.google.android.finsky.aa.n
{

    h(com.google.android.finsky.aa.c p0, String p1, Integer p2) {
        com.google.android.finsky.aa.n(p0, p1, p2);
    }

    protected final Object a(SharedPreferences p0) {
        if (p0.contains(this.b))
            v0 = Integer.valueOf(p0.getInt(this.b, 0));
        else
            v0 = (Integer)this.c;
        return v0;
    }

    protected final void a(SharedPreferences$Editor p0, Object p1) {
        if ((Integer)p1 == 0)
            throw new IllegalArgumentException("null cannot be written for <Integer>");
        p0.putInt(this.b, ((Integer)p1).intValue());
    }

}
