package com.google.android.finsky.bu.a;

import com.google.android.finsky.bu.c;
import java.util.List;

public final class com.google.android.finsky.bu.a.b implements Runnable
{

    public final com.google.android.finsky.bu.a.a a;

    b(com.google.android.finsky.bu.a.a p0) {
        this.a = p0;
    }

    public final void run() {
        enter this.a.c;
        v1 = 0;
        try {
            while (v1 < this.a.c.size()) {
                ((com.google.android.finsky.bu.c)this.a.c.get(v1)).a();
                v1 = v1 + 1;
            }
            exit this.a.c;
            return;
            exit this.a.c;
        }
        catch (Throwable ex) {
            exit this.a.c;
            throw ex;
        }
    }

}
