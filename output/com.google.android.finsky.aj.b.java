package com.google.android.finsky.aj;

import java.util.Map;

public final class com.google.android.finsky.aj.b implements Callable
{

    public final String a;
    public final com.google.android.finsky.aj.a b;

    b(com.google.android.finsky.aj.a p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final Object call() {
        v0 = this.b.b.a(this.a);
        if (v0 != 0)
            this.b.a.put(this.a, v0);
        return v0;
    }

}
