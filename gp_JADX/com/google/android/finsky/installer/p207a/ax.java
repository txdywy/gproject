package com.google.android.finsky.installer.p207a;

import android.os.AsyncTask;
import android.support.v7.widget.eq;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.utils.FinskyLog;

final class ax extends AsyncTask {
    public final /* synthetic */ C3288f f16958a;
    public final /* synthetic */ C2129c f16959b;
    public final /* synthetic */ ay f16960c;
    public final /* synthetic */ ah f16961d;

    ax(ah ahVar, C3288f c3288f, C2129c c2129c, ay ayVar) {
        this.f16961d = ahVar;
        this.f16958a = c3288f;
        this.f16959b = c2129c;
        this.f16960c = ayVar;
    }

    private final Long m16471a() {
        C3299r c3299r = this.f16961d.f16873D;
        long a = C3299r.m16528a(this.f16961d.ah);
        if (this.f16961d.f16892W) {
            this.f16961d.f16877H.m14975a(a, (this.f16958a.f17023b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) == 0);
        }
        return Long.valueOf(this.f16961d.f16873D.m16531a(this.f16958a));
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Long l = (Long) obj;
        C3299r c3299r = this.f16961d.f16873D;
        if (l.longValue() < C3299r.m16528a(this.f16961d.ah)) {
            ah ahVar = this.f16961d;
            String str = this.f16961d.f16878I;
            int i = ahVar.f16893X.p;
            boolean z = ahVar.f16893X.f;
            ahVar.m16432a(ahVar.ah.f8213k);
            ahVar.m16434a(str, 1017, null);
            ahVar.f16893X.f(i);
            ahVar.f16893X.b(z);
            FinskyLog.m21659a("Cannot use gzipped apk %s (adid: %s , isid: %s), need %d, free %d", this.f16961d.f16878I, this.f16961d.ag, this.f16961d.m16445e(), Long.valueOf(r0), l);
            this.f16961d.m16428a(this.f16959b, this.f16958a, this.f16960c);
            return;
        }
        FinskyLog.m21659a("Downloading compressed for %s (adid: %s , isid: %s)", this.f16961d.f16878I, this.f16961d.ag, this.f16961d.m16445e());
        C3288f c3288f = this.f16958a;
        c3288f.f17023b |= 512;
        this.f16961d.m16428a(this.f16959b, this.f16958a, this.f16960c);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m16471a();
    }
}
