package com.google.android.finsky.setup;

import android.graphics.Bitmap;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

final class au implements y {
    public final /* synthetic */ String f20801a;
    public final /* synthetic */ RestoreService f20802b;

    au(RestoreService restoreService, String str) {
        this.f20802b = restoreService;
        this.f20801a = str;
    }

    public final void m19235a(x xVar) {
        Bitmap b = xVar.b();
        if (b != null) {
            FinskyLog.m21659a("Received appIcon for %s", this.f20801a);
            this.f20802b.f20583q.remove(this.f20801a);
            this.f20802b.m19097a(this.f20801a, b);
            return;
        }
        int i;
        FinskyLog.m21665c("Unable to download appIcon for %s", this.f20801a);
        bb bbVar = this.f20802b.f20572e;
        String str = this.f20801a;
        ax axVar = (ax) bbVar.f20856e.get(str);
        if (axVar == null) {
            i = 0;
        } else if (axVar.f20807a >= ((Integer) C0955b.br.m28964b()).intValue()) {
            FinskyLog.m21659a("Reached limit %d for %s", Integer.valueOf(axVar.f20807a), str);
            i = 0;
        } else if (!bbVar.f20855d.containsKey(str)) {
            i = 0;
        } else if (C1473m.f7980a.mo2032L().mo2854a(str) != null) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            FinskyLog.m21665c("Unable to download appIcon for %s", this.f20801a);
            RestoreService restoreService = this.f20802b;
            String str2 = this.f20801a;
            FinskyLog.m21659a("Canceling bitmap for %s", str2);
            restoreService.f20583q.remove(str2);
            restoreService.f20572e.m19265f(str2);
            return;
        }
        restoreService = this.f20802b;
        str2 = this.f20801a;
        FinskyLog.m21659a("Canceling bitmap for %s", str2);
        restoreService.f20583q.remove(str2);
        restoreService.f20572e.m19265f(str2);
    }

    public final /* synthetic */ void b_(Object obj) {
        m19235a((x) obj);
    }
}
