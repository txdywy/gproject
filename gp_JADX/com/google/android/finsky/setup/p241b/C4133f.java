package com.google.android.finsky.setup.p241b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;
import com.google.android.finsky.setup.dq;

final class C4133f implements ServiceConnection {
    public final C4132e f20840a;
    public final ConditionVariable f20841b;
    public final /* synthetic */ C4131d f20842c;

    public C4133f(C4131d c4131d, ConditionVariable conditionVariable) {
        this.f20842c = c4131d;
        this.f20841b = conditionVariable;
        this.f20840a = new C4132e(c4131d, this.f20841b);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (!((dq) iBinder).f21084a.m19154a(this.f20840a, this.f20842c.f20834a)) {
            this.f20841b.open();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
