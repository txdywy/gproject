package com.google.android.finsky.by.a;

import android.accounts.Account;
import java.util.Map;

public final class com.google.android.finsky.by.a.af implements Runnable
{

    public final Account a;
    public final String[] b;
    public final Runnable c;
    public final String d;
    public final com.google.android.finsky.by.a.ab e;

    af(com.google.android.finsky.by.a.ab p0, Account p1, String[] p2, Runnable p3, String p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void run() {
        enter this.e;
        try {
            ((com.google.android.finsky.by.a.r)this.e.f.get(this.a)).a(this.b, this.c, this.d);
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
