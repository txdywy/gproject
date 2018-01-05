package com.google.android.finsky.instantapps.p214b;

import android.os.ConditionVariable;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.p217e.bb;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C3405b implements C3379a {
    public final C5785k f17421a;
    public final bb f17422b;
    public final C5710a f17423c;

    public C3405b(C5785k c5785k, bb bbVar, C5710a c5710a) {
        this.f17421a = c5785k;
        this.f17422b = bbVar;
        this.f17423c = c5710a;
    }

    public final /* synthetic */ Object call() {
        ConditionVariable conditionVariable = new ConditionVariable();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f17421a.m27186a(new C3406c(this, atomicBoolean, conditionVariable));
        conditionVariable.block();
        return Boolean.valueOf(atomicBoolean.get());
    }
}
