package com.google.android.gms.internal;

import com.google.android.gms.ads.p270c.C4909c;

final class ga implements Runnable {
    public /* synthetic */ fz f26770a;

    ga(fz fzVar) {
        this.f26770a = fzVar;
    }

    public final void run() {
        if (this.f26770a.f26769d == null) {
            synchronized (fz.f26765b) {
                if (this.f26770a.f26769d != null) {
                    return;
                }
                boolean booleanValue = ((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27750f)).booleanValue();
                if (booleanValue) {
                    try {
                        fz.f26766c = new xs(this.f26770a.f26768a.f27072b, "ADSHIELD");
                    } catch (Throwable th) {
                        booleanValue = false;
                    }
                }
                this.f26770a.f26769d = Boolean.valueOf(booleanValue);
                fz.f26765b.open();
            }
        }
    }
}
