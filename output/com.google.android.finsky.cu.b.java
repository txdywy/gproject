package com.google.android.finsky.cu;

import android.media.AudioManager;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import java.util.List;

public final class com.google.android.finsky.cu.b
{

    public static final com.google.android.finsky.cu.d a;
    public final com.google.android.finsky.cu.l b;

    static {
        com.google.android.finsky.cu.b.a = new com.google.android.finsky.cu.d();
    }

    b(com.google.android.finsky.cu.l p0) {
        if (com.google.android.finsky.cu.b.a.f == 0)
            com.google.android.finsky.cu.b.a.f = com.google.android.finsky.m.a.bl();
        if (com.google.android.finsky.cu.b.a.h == 0)
            com.google.android.finsky.cu.b.a.h = (AudioManager)com.google.android.finsky.m.a.a("audio");
        com.google.android.finsky.cu.b.a.b.setOnPreparedListener(com.google.android.finsky.cu.b.a.m);
        com.google.android.finsky.cu.b.a.b.setOnCompletionListener(com.google.android.finsky.cu.b.a.n);
        this.b = p0;
    }

    public static void a(com.google.android.finsky.navigationmanager.a p0) {
        v0 = new com.google.android.finsky.cu.c(p0);
        p0.b(v0);
        p0.a(v0);
    }

    public final void a() {
        if (!com.google.android.finsky.cu.b.a.d.contains(this.b))
            com.google.android.finsky.cu.b.a.d.add(this.b);
    }

    public final void b() {
        com.google.android.finsky.cu.b.a.d.remove(this.b);
    }

}
