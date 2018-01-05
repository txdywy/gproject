package com.google.android.finsky.setup;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class ac implements Runnable {
    public final /* synthetic */ List f20760a;
    public final /* synthetic */ aa f20761b;

    ac(aa aaVar, List list) {
        this.f20761b = aaVar;
        this.f20760a = list;
    }

    public final void run() {
        FinskyLog.m21659a("Restoring %d packages.", Integer.valueOf(this.f20760a.size()));
        C1473m.f7980a.cK().mo3928a(this.f20761b.f20757b, this.f20760a, true);
    }
}
