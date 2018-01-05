package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ao.C1237a;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.ref.WeakReference;
import java.util.List;

final class ag extends C1904f {
    public final WeakReference f9741g;
    public C2495w f9742h;
    public boolean f9743i;

    public ag(C1237a c1237a, C2233o c2233o, C3340g c3340g, C0988c c0988c, Activity activity, Bundle bundle) {
        super(c1237a, c2233o, c3340g, c0988c, bundle);
        this.f9741g = new WeakReference(activity);
        if (bundle != null) {
            this.f9743i = bundle.getBoolean("AutoInstallDependencyHelper.acquire_pending");
        } else {
            this.f9743i = false;
        }
    }

    public final void mo2511a(Bundle bundle) {
        super.mo2511a(bundle);
        bundle.putBoolean("AutoInstallDependencyHelper.acquire_pending", this.f9743i);
    }

    public final void m10159a(InstallRequest installRequest, C2495w c2495w) {
        this.f9742h = c2495w;
        super.m10152a(installRequest);
    }

    protected final synchronized void mo2510a(Account account, List list) {
        if (this.f9743i) {
            FinskyLog.m21667d("Acquire already pending", new Object[0]);
            m10154b();
        } else if (list.size() > 1) {
            m10154b();
            FinskyLog.m21669e("Expect to acquire only one dependency", new Object[0]);
        } else if (list.isEmpty()) {
            m10149a();
        } else {
            ((Activity) this.f9741g.get()).startActivityForResult(C1473m.f7980a.bo().mo2726a(account, C1473m.f7980a.f7981b, C1473m.f7980a.mo2249j(account.name), (Document) list.get(0), this.f9742h, null, null, false, true), 14);
            this.f9743i = true;
        }
    }

    public final synchronized void m10156a(int i) {
        if (this.f9743i) {
            if (i == -1) {
                m10149a();
            } else {
                m10154b();
            }
            this.f9743i = false;
        }
    }
}
