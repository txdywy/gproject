package com.google.android.wallet.analytics;

import android.os.Handler;
import com.google.android.wallet.a.a;

public final class C6502j {
    public Handler f32556a = new Handler();
    public boolean f32557b;
    public final C6496d f32558c;

    public C6502j(boolean z, C6496d c6496d) {
        this.f32557b = z;
        this.f32558c = c6496d;
    }

    public final void m29545a(C6504m c6504m) {
        if (!this.f32557b) {
            this.f32556a.removeCallbacksAndMessages(null);
            this.f32556a.postDelayed(new C6503k(this, c6504m), (long) ((Integer) a.k.a()).intValue());
        }
    }
}
