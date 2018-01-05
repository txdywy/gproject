package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.bs;
import com.google.android.gms.common.api.internal.cg;

public final class ab {
    public bs f25637a;
    public Looper f25638b;

    public final C5088n m23275a() {
        if (this.f25637a == null) {
            this.f25637a = new cg();
        }
        if (this.f25638b == null) {
            if (Looper.myLooper() != null) {
                this.f25638b = Looper.myLooper();
            } else {
                this.f25638b = Looper.getMainLooper();
            }
        }
        return new C5088n(this.f25637a, this.f25638b);
    }
}
