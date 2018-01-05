package com.google.android.finsky.instantappsbackendclient.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

final class C3577d implements ServiceConnection {
    public final /* synthetic */ IBinder[] f17876a;
    public final /* synthetic */ ConditionVariable f17877b;

    C3577d(IBinder[] iBinderArr, ConditionVariable conditionVariable) {
        this.f17876a = iBinderArr;
        this.f17877b = conditionVariable;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f17876a[0] = iBinder;
        this.f17877b.open();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f17877b.open();
    }
}
