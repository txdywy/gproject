package com.google.android.finsky.application;

import android.app.Application;
import com.google.android.finsky.m;
import com.google.android.finsky.stream.myapps.c;
import com.google.android.finsky.stream.myapps.l;
import com.google.android.finsky.stream.myapps.p;

public final class com.google.android.finsky.application.cd implements a.a
{

    public final com.google.android.finsky.application.d a;

    cd(com.google.android.finsky.application.d p0) {
        this.a = p0;
    }

    public final Object a() {
        if (this.a.dP == 0) {
            v9 = new com.google.android.finsky.stream.myapps.l;
            if (this.a == 0)
                throw 0;
            if (this.a == 0)
                throw 0;
            if (this.a.dK == 0)
                this.a.dK = new com.google.android.finsky.stream.myapps.c(this.a.b.getPackageManager());
            if (this.a.dN == 0)
                this.a.dN = new com.google.android.finsky.stream.myapps.p(this.a.b, this.a.dE(), this.a.bS(), this.a.x(), this.a.au(), this.a.dC(), this.a.m());
            v9.<init>(this.a, this.a, this.a.dK, this.a.dE(), this.a.dN);
            this.a.dP = v9;
        }
        return this.a.dP;
    }

}
