package com.google.android.libraries.performance.primes;

import android.content.Context;
import com.google.android.p102c.C0925g;

final class at {
    public volatile boolean f29677a;

    at() {
    }

    final boolean m27648a(Context context, String str, boolean z) {
        if (!this.f29677a) {
            try {
                z = C0925g.m5657a(context.getContentResolver(), str, z);
            } catch (Throwable e) {
                this.f29677a = true;
                C5989do.m27828b("GservicesWrapper", "Failed to read GServices.", e, new Object[0]);
            }
        }
        return z;
    }

    final float m27647a(Context context, String str) {
        if (!this.f29677a) {
            try {
                return C0925g.m5648a(context.getContentResolver(), str);
            } catch (Throwable e) {
                this.f29677a = true;
                C5989do.m27828b("GservicesWrapper", "Failed to read GServices.", e, new Object[0]);
            }
        }
        return 0.95f;
    }
}
