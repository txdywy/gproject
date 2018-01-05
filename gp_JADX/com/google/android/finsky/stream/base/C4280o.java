package com.google.android.finsky.stream.base;

import android.support.v7.widget.dg;
import com.google.android.finsky.utils.FinskyLog;

final class C4280o extends dg {
    public final /* synthetic */ C4279n f21588c;

    C4280o(C4279n c4279n) {
        this.f21588c = c4279n;
    }

    public final int mo813a(int i) {
        C4279n c4279n = this.f21588c;
        for (int i2 = 0; i2 < c4279n.f21580d.size(); i2++) {
            C1169s c1169s = (C1169s) c4279n.f21580d.get(i2);
            int a = c1169s.mo1508a();
            if (i < c1169s.mo1508a()) {
                c4279n.f21580d.get(i2);
                break;
            }
            i -= a;
        }
        FinskyLog.m21667d("StreamSectionController not found for position: %d", Integer.valueOf(i));
        return 60;
    }
}
