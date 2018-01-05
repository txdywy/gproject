package com.google.android.finsky.activities;

import com.google.android.finsky.installqueue.d;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.g;
import com.google.android.finsky.z.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.activities.eu implements com.google.android.finsky.z.f
{

    public final com.google.android.finsky.installqueue.g a;

    eu(com.google.android.finsky.installqueue.g p0) {
        this.a = p0;
    }

    public final void a(com.google.android.finsky.z.e p0) {
        v0 = (List)com.google.android.finsky.z.g.a(p0);
        if (v0 != 0 && !v0.isEmpty()) {
            v2 = new ArrayList(v0.size());
            v3 = v0.iterator();
            while (v3.hasNext()) {
                v0 = new InstallConstraint[1];
                v0[0] = new com.google.android.finsky.installqueue.d().a(1).e();
                v2.add(new com.google.android.finsky.installqueue.j(((com.google.android.finsky.installqueue.m)v3.next()).d).a(v0).a());
            }
            this.a.b(v2).a(com.google.android.finsky.z.h.a);
        }
    }

}
