package com.google.android.finsky.setup;

import android.content.Intent;
import com.google.android.finsky.C1473m;

final class as implements Runnable {
    public int f20795a;
    public final /* synthetic */ Intent f20796b;
    public final /* synthetic */ RestoreService f20797c;

    as(RestoreService restoreService, Intent intent) {
        this.f20797c = restoreService;
        this.f20796b = intent;
    }

    public final void run() {
        this.f20795a++;
        if (this.f20795a == 4) {
            bb bbVar = this.f20797c.f20572e;
            bbVar.f20858g--;
            boolean a = this.f20797c.m19099a(this.f20796b);
            RestoreService restoreService = this.f20797c;
            if (!restoreService.f20573f) {
                C1473m.f7980a.bw().mo3481a(restoreService.f20572e);
                restoreService.f20573f = true;
            }
            if (!a) {
                this.f20797c.f20572e.m19256a();
            }
        }
    }
}
