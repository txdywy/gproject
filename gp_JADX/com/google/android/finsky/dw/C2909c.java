package com.google.android.finsky.dw;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.finsky.utils.FinskyLog;

public final class C2909c {
    public final C2907a f15463a;

    public C2909c(Context context) {
        if (VERSION.SDK_INT < 17) {
            this.f15463a = new C2907a();
            return;
        }
        C2907a c2908b;
        try {
            c2908b = new C2908b(context);
        } catch (NoSuchMethodException e) {
            FinskyLog.m21669e("Unable to reflect into UserManager: %s", e);
            c2908b = new C2907a();
        }
        this.f15463a = c2908b;
    }
}
