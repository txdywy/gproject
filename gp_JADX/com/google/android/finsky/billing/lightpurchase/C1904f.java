package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ao.C1237a;
import com.google.android.finsky.ao.C1245i;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public abstract class C1904f {
    public final C1237a f9735a;
    public final C2233o f9736b;
    public final C3340g f9737c;
    public final C0988c f9738d;
    public InstallRequest f9739e;
    public ArrayList f9740f;

    public C1904f(C1237a c1237a, C2233o c2233o, C3340g c3340g, C0988c c0988c, Bundle bundle) {
        this.f9735a = c1237a;
        this.f9736b = c2233o;
        this.f9737c = c3340g;
        this.f9738d = c0988c;
        if (bundle != null) {
            this.f9740f = (ArrayList) bundle.getParcelable("BaseAutoInstallDependencyHelper.pendingAutoInstallDependentRequest");
            this.f9740f = bundle.getParcelableArrayList("BaseAutoInstallDependencyHelper.pendingAutoInstallRequestList");
        }
    }

    protected abstract void mo2510a(Account account, List list);

    public void mo2511a(Bundle bundle) {
        bundle.putParcelable("BaseAutoInstallDependencyHelper.pendingAutoInstallDependentRequest", this.f9739e);
        bundle.putParcelableArrayList("BaseAutoInstallDependencyHelper.pendingAutoInstallRequestList", this.f9740f);
    }

    public final void m10152a(InstallRequest installRequest) {
        C1245i c1245i = new C1245i();
        c1245i.f7406a = installRequest.f17171a.f17137g;
        c1245i = c1245i.m7247a(installRequest.f17171a.f17133c, installRequest.f17171a.f17140j);
        this.f9739e = installRequest;
        this.f9735a.m7241a(c1245i.m7246a(), new C1948g(this, installRequest));
    }

    protected final void m10149a() {
        this.f9737c.m16746a(this.f9740f);
    }

    protected final void m10154b() {
        FinskyLog.m21667d("Acquire error", new Object[0]);
        m10155c();
    }

    final void m10155c() {
        this.f9737c.m16744a(this.f9739e);
    }

    final List m10153b(Account account, List list) {
        List arrayList = new ArrayList();
        C2196e a = C1473m.f7980a.ah().mo2811a(account);
        for (Document document : list) {
            if (!this.f9736b.m11648a(document, a, 1)) {
                arrayList.add(document);
            }
        }
        return arrayList;
    }
}
