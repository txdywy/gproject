package com.google.android.finsky.by.p132a;

import android.accounts.Account;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class C2209h implements Runnable {
    public final /* synthetic */ Account f11048a;
    public final /* synthetic */ int[] f11049b;
    public final /* synthetic */ List f11050c;
    public final /* synthetic */ int f11051d;
    public final /* synthetic */ C2207f f11052e;

    C2209h(C2207f c2207f, Account account, int[] iArr, List list, int i) {
        this.f11052e = c2207f;
        this.f11048a = account;
        this.f11049b = iArr;
        this.f11050c = list;
        this.f11051d = i;
    }

    public final void run() {
        FinskyLog.m21659a("Loaded library for account: %s", FinskyLog.m21655a(this.f11048a.name));
        int[] iArr = this.f11049b;
        iArr[0] = iArr[0] + 1;
        if (this.f11049b[0] == this.f11050c.size()) {
            FinskyLog.m21659a("Finished loading %d libraries.", Integer.valueOf(this.f11050c.size()));
            this.f11052e.m11610i();
            this.f11052e.m11612k();
            this.f11052e.f11045k = this.f11051d;
        }
    }
}
