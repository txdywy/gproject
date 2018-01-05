package com.google.android.finsky.datasync;

import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.dp.C2866c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.dfe.api.C1460g;

public class C2514a extends ah {
    public int f13507a;
    public boolean f13508c;
    public C0986a f13509d;
    public C1287h f13510e;
    public C1463g f13511f;
    public C1460g f13512g;
    public C4674e f13513i;
    public C2866c z_;

    public final boolean mo1168a(C4026d c4026d) {
        ((C1374t) C3947d.m18649a(C1374t.class)).mo1800a(this);
        this.f13511f.dc().m13319a(new C2474c(531).f13342a, null);
        FinskyLog.m21659a("Fetch browse data initiated", new Object[0]);
        this.f13513i.newThread(new C2516b(this, this.f13509d.mo1188d())).start();
        return true;
    }

    final void m13438a(String str, C1254c c1254c) {
        c1254c.mo1584a(str, new C2520f(this), new C2521g(this));
    }

    protected final boolean k_(int i) {
        FinskyLog.m21659a("Browse data sync stopped for reason %d", Integer.valueOf(i));
        return false;
    }
}
