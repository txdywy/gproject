package com.google.android.finsky.by.a;

import android.accounts.Account;
import android.os.Handler;
import android.util.Base64;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.h;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.by.a.q implements Runnable
{

    public final com.google.android.finsky.by.a.p a;

    q(com.google.android.finsky.by.a.p p0) {
        this.a = p0;
    }

    public final void run() {
        if (this.a.f == 0) {
            this.a.d.d();
            v1 = this.a.c.iterator();
            while (v1.hasNext()) {
                v0 = (com.google.android.finsky.by.g)v1.next();
                if (!this.a.d.f.name.equals(v0.h))
                    continue;
                this.a.d.d(v0);
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.by.h.g.length) {
                v0 = com.google.android.finsky.aa.a.a(com.google.android.finsky.by.h.g[v1], this.a.d.f.name).a();
                if ((String)v0 != 0)
                    v0 = Base64.decode((String)v0, 0);
                else
                    v0 = 0;
                this.a.d.a(com.google.android.finsky.by.h.g[v1], v0);
                v1 = v1 + 1;
            }
            this.a.f = 2;
            this.a.d.e();
        }
        enter this.a;
        try {
            v1 = this.a.e.iterator();
            while (v1.hasNext())
                this.a.b.post((Runnable)v1.next());
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
        try {
            this.a.e.clear();
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
    }

}
