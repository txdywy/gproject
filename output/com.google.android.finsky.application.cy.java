package com.google.android.finsky.application;

import android.accounts.Account;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.h;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.b;
import com.google.android.finsky.m;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.application.cy implements com.google.android.finsky.accounts.b
{

    public final com.google.android.finsky.application.d a;

    cy(com.google.android.finsky.application.d p0) {
        this.a = p0;
    }

    public final void a(Account p0) {
        enter this.a.u;
        try {
            this.a.u.clear();
            exit this.a.u;
        }
        catch (Throwable ex) {
            try {
                exit this.a.u;
            }
            catch (Throwable ex) {
                exit this.a.u;
                throw ex;
            }
            throw ex;
        }
        if (this.a.p == 0 || (!this.a.p.equals(p0)) || this.a.q == 0 || !this.a.q.equals(p0))
            v0 = 1;
        else
            v0 = 0;
        this.a.p = p0;
        this.a.q = p0;
        if (v0 != 0) {
            this.a.U().a(this.a.q, com.google.android.finsky.aa.a.h);
            if (this.a.h != 0) {
                this.a.h.c = this.a.h.d.a();
                if (this.a.h.c != 0)
                    this.a.h.a.clear();
                else
                    this.a.h.a();
            }
            this.a.r = this.a.r.a(this.a.q);
        }
    }

}
