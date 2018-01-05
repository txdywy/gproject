package com.google.android.finsky.externalreferrer;

import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final class C3014f implements C0978f {
    public final /* synthetic */ String f15790a;
    public final /* synthetic */ C2129c f15791b;
    public final /* synthetic */ boolean f15792c;
    public final /* synthetic */ C3647b f15793d;
    public final /* synthetic */ C3012d f15794e;

    C3014f(C3012d c3012d, String str, C2129c c2129c, boolean z, C3647b c3647b) {
        this.f15794e = c3012d;
        this.f15790a = str;
        this.f15791b = c2129c;
        this.f15792c = z;
        this.f15793d = c3647b;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        ExternalReferrerStatus externalReferrerStatus = null;
        try {
            externalReferrerStatus = (ExternalReferrerStatus) c4809e.get();
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21660a(e, "Fail to read from ExternalReferrerDS", new Object[0]);
            if (externalReferrerStatus == null) {
                externalReferrerStatus = this.f15794e.f15781h.m15591b(this.f15790a, this.f15791b);
            }
            this.f15794e.m15595a(externalReferrerStatus, this.f15790a, this.f15792c, this.f15791b, this.f15793d);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Fail to read from ExternalReferrerDS", new Object[0]);
            if (externalReferrerStatus == null) {
                externalReferrerStatus = this.f15794e.f15781h.m15591b(this.f15790a, this.f15791b);
            }
            this.f15794e.m15595a(externalReferrerStatus, this.f15790a, this.f15792c, this.f15791b, this.f15793d);
        }
        if (externalReferrerStatus == null) {
            externalReferrerStatus = this.f15794e.f15781h.m15591b(this.f15790a, this.f15791b);
        }
        this.f15794e.m15595a(externalReferrerStatus, this.f15790a, this.f15792c, this.f15791b, this.f15793d);
    }
}
