package com.google.android.finsky.stream.base.horizontalclusters;

import com.google.android.finsky.stream.base.horizontalclusters.view.C4268m;
import com.google.android.play.image.x;
import java.util.ArrayList;

final class C4266f implements Runnable {
    public final /* synthetic */ int f21548a;
    public final /* synthetic */ int f21549b;
    public final /* synthetic */ C4268m f21550c;
    public final /* synthetic */ C4265e f21551d;

    C4266f(C4265e c4265e, int i, int i2, C4268m c4268m) {
        this.f21551d = c4265e;
        this.f21548a = i;
        this.f21549b = i2;
        this.f21550c = c4268m;
    }

    public final void run() {
        int min = Math.min(this.f21548a, Math.max(this.f21551d.f21546f.size() - 1, 0));
        int max = Math.max(this.f21549b, 0);
        if (this.f21551d.f21547g == null) {
            this.f21551d.f21547g = new ArrayList();
        }
        while (max < min) {
            x a = this.f21551d.m19797a(max, Integer.valueOf(this.f21550c.mo4083k(max)).intValue(), Integer.valueOf(this.f21550c.mo4082j(max)).intValue());
            if (a != null && a.b() == null) {
                this.f21551d.f21547g.add(a);
            }
            max++;
        }
    }
}
