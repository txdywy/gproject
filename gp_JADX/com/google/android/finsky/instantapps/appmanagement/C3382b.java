package com.google.android.finsky.instantapps.appmanagement;

import android.os.ConditionVariable;
import com.google.android.gms.common.api.C3381y;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.instantapps.C5265d;
import java.util.concurrent.atomic.AtomicReference;

final class C3382b extends C3381y {
    public final /* synthetic */ AtomicReference f17356a;
    public final /* synthetic */ ConditionVariable f17357b;
    public final /* synthetic */ C3380a f17358c;

    C3382b(C3380a c3380a, AtomicReference atomicReference, ConditionVariable conditionVariable) {
        this.f17358c = c3380a;
        this.f17356a = atomicReference;
        this.f17357b = conditionVariable;
    }

    public final void mo3501a() {
        this.f17358c.f17355h.mo5136a(2117);
        this.f17356a.set(null);
        this.f17357b.open();
    }

    public final /* synthetic */ void mo3502b(C4980w c4980w) {
        this.f17356a.set(((C5265d) c4980w).mo4691a());
        this.f17357b.open();
    }
}
