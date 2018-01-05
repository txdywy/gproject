package com.google.android.finsky.cr;

import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.cr.g implements Runnable
{

    public final Map a;
    public final com.google.android.finsky.cr.f b;

    g(com.google.android.finsky.cr.f p0, Map p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.a.c = this.a;
        v1 = 0;
        while (v1 < this.b.a.d.size()) {
            ((Runnable)this.b.a.d.get(v1)).run();
            v1 = v1 + 1;
        }
        this.b.a.d.clear();
    }

}
