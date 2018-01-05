package com.google.android.instantapps.common.p221d.p222a;

import android.os.ConditionVariable;

final /* synthetic */ class aa implements Runnable {
    public final ConditionVariable f28897a;

    aa(ConditionVariable conditionVariable) {
        this.f28897a = conditionVariable;
    }

    public final void run() {
        this.f28897a.open();
    }
}
