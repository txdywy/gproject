package com.google.android.finsky.by.p132a;

import android.accounts.Account;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.w;

final class ag implements Runnable {
    public final /* synthetic */ Account f11016a;
    public final /* synthetic */ String f11017b;
    public final /* synthetic */ w[] f11018c;
    public final /* synthetic */ Runnable f11019d;
    public final /* synthetic */ ab f11020e;

    ag(ab abVar, Account account, String str, w[] wVarArr, Runnable runnable) {
        this.f11020e = abVar;
        this.f11016a = account;
        this.f11017b = str;
        this.f11018c = wVarArr;
        this.f11019d = runnable;
    }

    public final void run() {
        synchronized (this.f11020e) {
            if (this.f11020e.f11001f.containsKey(this.f11016a)) {
                FinskyLog.m21659a("Applying library update: account=%s", FinskyLog.m21655a(this.f11016a.name));
                C2219r c2219r = (C2219r) this.f11020e.f11001f.get(this.f11016a);
                String str = this.f11017b;
                w[] wVarArr = this.f11018c;
                if (!(wVarArr == null || wVarArr.length == 0)) {
                    c2219r.f11075e.post(new C2221t(c2219r, wVarArr, str));
                }
            } else {
                FinskyLog.m21667d("LibraryUpdate for unknown account %s could not be applied", FinskyLog.m21655a(this.f11016a.name));
            }
            if (this.f11019d != null) {
                this.f11020e.f11000e.post(new ah(this));
            }
        }
    }
}
