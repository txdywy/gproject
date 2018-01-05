package com.google.android.finsky.accounts.impl;

import android.os.AsyncTask;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.bn.h;
import com.google.android.finsky.by.c;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.l.a;
import com.google.android.finsky.providers.c;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

protected final class com.google.android.finsky.accounts.impl.c extends AsyncTask
{

    public final String a;
    public final boolean b;
    public final com.google.android.finsky.accounts.a c;
    public final com.google.android.finsky.f.b d;
    public final com.google.android.finsky.l.a e;
    public final com.google.android.finsky.providers.c f;
    public final com.google.android.finsky.by.c g;

    c(String p0, boolean p1, com.google.android.finsky.providers.c p2, com.google.android.finsky.accounts.a p3, com.google.android.finsky.f.b p4, com.google.android.finsky.l.a p5, com.google.android.finsky.by.c p6) {
        AsyncTask();
        this.a = p0;
        this.b = p1;
        this.f = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.g = p6;
    }

    protected final Object doInBackground(Object[] p0) {
        if (!this.g.a())
            this.g.c();
        if (!this.e.b.b())
            this.e.b.c();
        v1 = new ArrayList();
        v2 = this.e.c.a().iterator();
        while (v2.hasNext()) {
            v0 = (com.google.android.finsky.cn.b)v2.next();
            if (v0.g != 0)
                continue;
            v1.add(v0.a);
        }
        v0 = this.e.a(this.g, v1);
        if (v0.isEmpty()) {
            v0 = Boolean.valueOf(0);
            return v0;
        }
        v1 = v0.iterator();
        while (true) {
            if (!v1.hasNext()) {
                v0 = Boolean.valueOf(0);
                return v0;
            }
            v0 = this.d.a((String)v1.next());
            if (!v0.b())
                continue;
            if (v0.j == 0) {
                v0 = Boolean.valueOf(1);
                return v0;
            }
        }
    }

    protected final void onPostExecute(Object p0) {
        if (((Boolean)p0).booleanValue()) {
            if (this.c.d().length == 0)
                v0 = 1;
            else
                v0 = 0;
            this.f.a(this.a, v0);
        }
        if (this.b != 0) {
            FinskyLog.a("Killing app because current account has been removed", new Object[0]);
            System.exit(0);
        }
    }

}
