package com.google.android.finsky.installqueue.p141a;

import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0957n;

public final class C3336h {
    public final C0956c f17193a = new C0956c("install_queue");
    public final C0957n f17194b = this.f17193a.m5751a("last-job-id", Integer.valueOf(0));

    public final int m16723a() {
        int intValue;
        synchronized (this.f17194b) {
            intValue = (((Integer) this.f17194b.m5760a()).intValue() + 1) % 1000000000;
            this.f17194b.m5763a(Integer.valueOf(intValue));
        }
        return intValue;
    }
}
