package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ao.a;
import com.google.android.finsky.ao.i;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installer.b.a.d;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class com.google.android.finsky.billing.lightpurchase.f
{

    public final com.google.android.finsky.ao.a a;
    public final com.google.android.finsky.by.o b;
    public final com.google.android.finsky.installqueue.g c;
    public final com.google.android.finsky.accounts.c d;
    public InstallRequest e;
    public ArrayList f;

    f(com.google.android.finsky.ao.a p0, com.google.android.finsky.by.o p1, com.google.android.finsky.installqueue.g p2, com.google.android.finsky.accounts.c p3, Bundle p4) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        if (p4 != 0) {
            this.f = (ArrayList)p4.getParcelable("BaseAutoInstallDependencyHelper.pendingAutoInstallDependentRequest");
            this.f = p4.getParcelableArrayList("BaseAutoInstallDependencyHelper.pendingAutoInstallRequestList");
        }
    }

    protected final void a() {
        this.c.a(this.f);
    }

    protected abstract void a(Account p0, List p1);

    public void a(Bundle p0) {
        p0.putParcelable("BaseAutoInstallDependencyHelper.pendingAutoInstallDependentRequest", this.e);
        p0.putParcelableArrayList("BaseAutoInstallDependencyHelper.pendingAutoInstallRequestList", this.f);
    }

    public final void a(InstallRequest p0) {
        v0 = new com.google.android.finsky.ao.i();
        v0.a = p0.a.g;
        this.e = p0;
        this.a.a(v0.a(p0.a.c, p0.a.j).a(), new com.google.android.finsky.billing.lightpurchase.g(this, p0));
    }

    final List b(Account p0, List p1) {
        v1 = new ArrayList();
        v3 = p1.iterator();
        while (v3.hasNext()) {
            v0 = (Document)v3.next();
            if (this.b.a(v0, com.google.android.finsky.m.a.ah().a(p0), 1))
                continue;
            v1.add(v0);
        }
        return v1;
    }

    protected final void b() {
        FinskyLog.d("Acquire error", new Object[0]);
        this.c();
    }

    final void c() {
        this.c.a(this.e);
    }

}
