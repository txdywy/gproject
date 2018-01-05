package com.google.android.finsky.b;

import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.b.d implements com.android.volley.x
{

    public final com.google.android.finsky.d.g a;
    public final String b;

    d(String p0, com.google.android.finsky.d.g p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        v1 = new Object[1];
        v1[0] = FinskyLog.a(this.b);
        FinskyLog.d("URL[%s] was not redirected.", v1);
        this.a.dc().a(new com.google.android.finsky.d.c(1107).a(2).a);
    }

}
