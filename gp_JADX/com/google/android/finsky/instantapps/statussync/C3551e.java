package com.google.android.finsky.instantapps.statussync;

import android.os.ConditionVariable;
import com.google.android.gms.common.api.C3381y;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.instantapps.C5265d;
import java.util.concurrent.atomic.AtomicReference;

final class C3551e extends C3381y {
    public final /* synthetic */ AtomicReference f17816a;
    public final /* synthetic */ ConditionVariable f17817b;

    C3551e(AtomicReference atomicReference, ConditionVariable conditionVariable) {
        this.f17816a = atomicReference;
        this.f17817b = conditionVariable;
    }

    public final void mo3501a() {
        this.f17816a.set(null);
        this.f17817b.open();
    }

    public final /* synthetic */ void mo3502b(C4980w c4980w) {
        this.f17816a.set(((C5265d) c4980w).mo4691a());
        this.f17817b.open();
    }
}
