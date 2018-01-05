package com.google.android.finsky.by.a;

import android.accounts.Account;
import android.os.Handler;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

public final class com.google.android.finsky.by.a.ag implements Runnable
{

    public final Account a;
    public final String b;
    public final w[] c;
    public final Runnable d;
    public final com.google.android.finsky.by.a.ab e;

    ag(com.google.android.finsky.by.a.ab p0, Account p1, String p2, w[] p3, Runnable p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void run() {
        enter this.e;
        try {
            if (this.e.f.containsKey(this.a)) {
                v2 = new Object[1];
                v2[0] = FinskyLog.a(this.a.name);
                FinskyLog.a("Applying library update: account=%s", v2);
                v0 = (com.google.android.finsky.by.a.r)this.e.f.get(this.a);
                if (this.c != 0) {
                    if (this.c.length == 0) {
                    }
                    else
                        v0.e.post(new com.google.android.finsky.by.a.t(v0, this.c, this.b));
                }
            }
            else {
                try {
                    v2 = new Object[1];
                    v2[0] = FinskyLog.a(this.a.name);
                    FinskyLog.d("LibraryUpdate for unknown account %s could not be applied", v2);
                }
                catch (Throwable ex) {
                    exit this.e;
                    throw ex;
                }
            }
            if (this.d != 0)
                this.e.e.post(new com.google.android.finsky.by.a.ah(this));
            exit this.e;
            return;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

}
