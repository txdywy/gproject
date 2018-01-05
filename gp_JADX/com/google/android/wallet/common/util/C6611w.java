package com.google.android.wallet.common.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

public final class C6611w {
    public final Context f32779a;
    public C6614z f32780b;

    public C6611w(Context context, C6614z c6614z) {
        this.f32779a = context;
        this.f32780b = c6614z;
    }

    public final void m29988a(int i) {
        if (this.f32780b != null) {
            new Handler(Looper.getMainLooper()).post(new C6613y(this, i));
        }
    }
}
