package com.google.android.finsky.activities;

import android.content.Context;
import com.google.android.finsky.scheduler.b.a;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.z.e;

public final class com.google.android.finsky.activities.az implements com.google.android.finsky.z.f
{

    public final com.google.android.finsky.scheduler.ba a;
    public final com.google.android.finsky.scheduler.b.a b;
    public final Context c;

    az(com.google.android.finsky.scheduler.ba p0, com.google.android.finsky.scheduler.b.a p1, Context p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void a(com.google.android.finsky.z.e p0) {
        this.a.a(1, "debug-job", com.google.android.finsky.activities.ay, this.b, 0).a(new com.google.android.finsky.activities.bb(this.c));
    }

}
