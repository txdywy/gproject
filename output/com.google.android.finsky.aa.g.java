package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

protected final class com.google.android.finsky.aa.g extends com.google.android.finsky.aa.n
{

    g(com.google.android.finsky.aa.c p0, String p1, Boolean p2) {
        com.google.android.finsky.aa.n(p0, p1, p2);
    }

    protected final Object a(SharedPreferences p0) {
        if (p0.contains(this.b))
            v0 = Boolean.valueOf(p0.getBoolean(this.b, 0));
        else
            v0 = (Boolean)this.c;
        return v0;
    }

    protected final void a(SharedPreferences$Editor p0, Object p1) {
        if ((Boolean)p1 == 0)
            throw new IllegalArgumentException("null cannot be written for <Boolean>");
        p0.putBoolean(this.b, ((Boolean)p1).booleanValue());
    }

}
