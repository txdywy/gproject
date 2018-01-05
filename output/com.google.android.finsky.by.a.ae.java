package com.google.android.finsky.by.a;

import android.os.Handler;
import java.util.Collection;

public final class com.google.android.finsky.by.a.ae implements Runnable
{

    public int a;
    public final Collection b;
    public final com.google.android.finsky.by.a.ad c;

    ae(com.google.android.finsky.by.a.ad p0, Collection p1) {
        this.c = p0;
        this.b = p1;
    }

    public final void run() {
        this.a = this.a + 1;
        if (this.a == this.b.size() && this.c.a != 0)
            this.c.c.d.post(this.c.a);
    }

}
