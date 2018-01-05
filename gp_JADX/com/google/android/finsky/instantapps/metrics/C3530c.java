package com.google.android.finsky.instantapps.metrics;

import android.os.ConditionVariable;
import com.google.android.finsky.instantapps.p214b.C3379a;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.C5718h;
import java.util.concurrent.TimeUnit;

public final class C3530c implements C3379a {
    public final C5710a f17789a;
    public final C5718h f17790b;

    public C3530c(C5710a c5710a, C5718h c5718h) {
        this.f17789a = c5710a;
        this.f17790b = c5718h;
    }

    public final /* synthetic */ Object call() {
        this.f17790b.m27013a(this.f17789a.m26982b());
        ConditionVariable conditionVariable = new ConditionVariable();
        this.f17789a.m26981a(new C3531d(conditionVariable));
        return Boolean.valueOf(conditionVariable.block(TimeUnit.SECONDS.toMillis(30)));
    }
}
