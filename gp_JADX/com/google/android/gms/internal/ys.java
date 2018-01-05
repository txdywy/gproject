package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.ConditionVariable;

@C5302b
public final class ys {
    public final Object f27739a = new Object();
    public final ConditionVariable f27740b = new ConditionVariable();
    public volatile boolean f27741c = false;
    public SharedPreferences f27742d = null;

    public final Object m26014a(yk ykVar) {
        if (this.f27740b.block(5000)) {
            if (!this.f27741c || this.f27742d == null) {
                synchronized (this.f27739a) {
                    if (!this.f27741c || this.f27742d == null) {
                        Object obj = ykVar.f27735b;
                        return obj;
                    }
                }
            }
            return ak.m24180a(new yt(this, ykVar));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }
}
