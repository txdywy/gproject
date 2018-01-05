package com.google.android.finsky.download;

import android.database.ContentObserver;
import android.os.Handler;

final class aa extends ContentObserver {
    public final /* synthetic */ C2863z f15252a;

    aa(C2863z c2863z, Handler handler) {
        this.f15252a = c2863z;
        super(handler);
    }

    public final boolean deliverSelfNotifications() {
        return false;
    }

    public final void onChange(boolean z) {
        this.f15252a.m15102a();
    }
}
