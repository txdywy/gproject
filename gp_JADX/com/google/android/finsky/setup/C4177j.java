package com.google.android.finsky.setup;

import android.graphics.Bitmap;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

final class C4177j implements y {
    public final /* synthetic */ String f21098a;
    public final /* synthetic */ C4176i f21099b;

    C4177j(C4176i c4176i, String str) {
        this.f21099b = c4176i;
        this.f21098a = str;
    }

    public final void m19499a(x xVar) {
        Bitmap b = xVar.b();
        if (b != null) {
            FinskyLog.m21659a("Received bitmap for %s", this.f21098a);
            this.f21099b.m19497a(this.f21098a, b);
            return;
        }
        FinskyLog.m21665c("Unable to downloadIcon bitmap for %s", this.f21098a);
        this.f21099b.m19496a(this.f21098a);
    }

    public final /* synthetic */ void b_(Object obj) {
        m19499a((x) obj);
    }
}
