package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ao.k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installer.b.a.d;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.billing.lightpurchase.g implements com.google.android.finsky.ao.f
{

    public final com.google.android.finsky.billing.lightpurchase.f a;
    public final InstallRequest b;

    g(com.google.android.finsky.billing.lightpurchase.f p0, InstallRequest p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(com.google.android.finsky.ao.k p0) {
        if (p0.a == 0) {
            v3 = p0.a(this.b.a.c);
            v4 = new ArrayList(v3.size() + 1);
            v5 = v3.iterator();
            while (v5.hasNext()) {
                v6 = new com.google.android.finsky.installqueue.j(this.b.a.b, (Document)v5.next());
                v6.b(this.b.a.g).a((InstallConstraint[])this.b.b.toArray(new InstallConstraint[this.b.b.size()])).c(this.b.a.k).b(this.b.a.i).a(this.b.a.m).a(this.b.a()).a("dependency");
                v4.add(v6.a());
            }
            v4.add(this.b);
            v0 = this.a.d.e(this.b.a.g);
            this.a.f = new ArrayList(v4);
            this.a.a(v0, this.a.b(v0, v3));
        }
        else {
            v2 = new Object[1];
            v2[0] = Integer.valueOf(p0.a);
            FinskyLog.d("Error resolving dependencies. StatusCode: %d", v2);
            this.a.c();
        }
    }

}
