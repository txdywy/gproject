package com.google.android.instantapps.supervisor.event;

import android.util.Log;
import com.google.android.apps.common.proguard.UsedByNative;

public class EventReceiverClient {
    public final C5841a f29323a;

    @UsedByNative
    public void logEvent(int i) {
        try {
            C5841a c5841a = this.f29323a;
            System.currentTimeMillis();
            c5841a.m27265a();
        } catch (Throwable e) {
            Log.e("EventReceiverClient", "logging event failed", e);
        }
    }
}
