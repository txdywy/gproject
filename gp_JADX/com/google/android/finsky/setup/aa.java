package com.google.android.finsky.setup;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.billing.p120d.C1807a;
import com.google.android.finsky.billing.p120d.C1811c;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class aa implements Runnable {
    public final /* synthetic */ Map f20756a;
    public final /* synthetic */ PlaySetupServiceV2 f20757b;

    aa(PlaySetupServiceV2 playSetupServiceV2, Map map) {
        this.f20757b = playSetupServiceV2;
        this.f20756a = map;
    }

    public final void run() {
        C1807a a = C1473m.f7980a.bF().mo2455a();
        List arrayList = new ArrayList();
        C1091e abVar = new ab(this, arrayList);
        for (Bundle bundle : this.f20756a.values()) {
            try {
                cv a2 = cv.m12384a(bundle.getByteArray("doc"));
                Account b = C1473m.f7980a.mo2041U().mo1183b(bundle.getString("authAccount"));
                if (b == null) {
                    FinskyLog.m21669e("Compatible document %s doesn't have an account", bundle.getString("package_name"));
                } else {
                    a.mo2456a(new C1811c(b, new Document(a2), abVar));
                }
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "Failed to parse DocV2 proto", new Object[0]);
            }
        }
        a.mo2457a(new ac(this, arrayList));
    }
}
