package com.google.android.finsky.dc.p181a;

import com.google.android.finsky.cm.C2297d;
import com.google.android.finsky.utils.FinskyLog;

final class C2542e implements C2297d {
    public final /* synthetic */ C2541d f13615a;

    C2542e(C2541d c2541d) {
        this.f13615a = c2541d;
    }

    public final void mo2939a() {
        FinskyLog.m21669e("Unexpected install success for %s", this.f13615a.f13614b.f13600g);
        this.f13615a.f13614b.f13610q = true;
    }

    public final void mo2940a(int i, Throwable th) {
        this.f13615a.f13614b.m13504a(i, th);
    }
}
