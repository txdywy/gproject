package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

protected final class com.google.android.finsky.aa.e extends com.google.android.finsky.aa.n
{

    e(com.google.android.finsky.aa.c p0, String p1, String p2) {
        com.google.android.finsky.aa.n(p0, p1, p2);
    }

    protected final Object a(SharedPreferences p0) {
        if (p0.contains(this.b))
            v0 = p0.getString(this.b, 0);
        else
            v0 = (String)this.c;
        return v0;
    }

    protected final void a(SharedPreferences$Editor p0, Object p1) {
        p0.putString(this.b, (String)p1);
    }

}
