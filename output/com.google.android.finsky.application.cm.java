package com.google.android.finsky.application;

import com.google.android.finsky.cg.d;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.b.j;

public final class com.google.android.finsky.application.cm implements com.google.android.play.utils.c.e
{

    public final com.google.android.finsky.application.d a;

    cm(com.google.android.finsky.application.d p0) {
        this.a = p0;
    }

    public final int a() {
        if (((Boolean)com.google.android.play.utils.b.j.A.b()).booleanValue())
            v0 = com.google.android.finsky.cg.d.a();
        else if (com.google.android.finsky.cg.d.a == -1)
            v0 = -1;
        else
            v0 = com.google.android.finsky.cg.d.a / 1000;
        return v0;
    }

}
