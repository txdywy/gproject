package com.google.android.finsky.application;

import android.accounts.Account;
import com.google.android.finsky.cs.e;
import com.google.android.finsky.m;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.application.dd implements Runnable
{

    public final com.google.android.finsky.application.d a;

    dd(com.google.android.finsky.application.d p0) {
        this.a = p0;
    }

    public final void run() {
        v2 = this.a.cX().iterator();
        while (v2.hasNext())
            this.a.ag().d(((Account)v2.next()).name);
    }

}
