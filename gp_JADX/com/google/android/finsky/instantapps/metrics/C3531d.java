package com.google.android.finsky.instantapps.metrics;

import android.os.ConditionVariable;

final /* synthetic */ class C3531d implements Runnable {
    public final ConditionVariable f17791a;

    C3531d(ConditionVariable conditionVariable) {
        this.f17791a = conditionVariable;
    }

    public final void run() {
        this.f17791a.open();
    }
}
