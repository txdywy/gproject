package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C4038n implements C0978f {
    public final Exception f20321a;
    public final int f20322b;
    public final int f20323c;

    C4038n(Exception exception, int i, int i2) {
        this.f20321a = exception;
        this.f20322b = i;
        this.f20323c = i2;
    }

    public final void mo1172a(C4809e c4809e) {
        FinskyLog.m21660a(this.f20321a, "JobComponent not found for job id: %d, consumer id: ", Integer.valueOf(this.f20322b), Integer.valueOf(this.f20323c));
    }
}
