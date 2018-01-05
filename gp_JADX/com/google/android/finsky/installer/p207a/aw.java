package com.google.android.finsky.installer.p207a;

import android.os.AsyncTask;
import android.support.v7.widget.eq;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.dk.C2830g;

final class aw extends AsyncTask {
    public final /* synthetic */ long f16953a;
    public final /* synthetic */ C3288f f16954b;
    public final /* synthetic */ C2129c f16955c;
    public final /* synthetic */ ay f16956d;
    public final /* synthetic */ ah f16957e;

    aw(ah ahVar, long j, C3288f c3288f, C2129c c2129c, ay ayVar) {
        this.f16957e = ahVar;
        this.f16953a = j;
        this.f16954b = c3288f;
        this.f16955c = c2129c;
        this.f16956d = ayVar;
    }

    private final Long m16470a() {
        if (this.f16957e.f16892W) {
            C3299r c3299r = this.f16957e.f16873D;
            this.f16957e.f16877H.m14975a(C3299r.m16527a(this.f16953a), false);
            return Long.valueOf(this.f16957e.f16877H.m14976c());
        }
        C2830g c2830g = this.f16957e.f16877H;
        return Long.valueOf(C2830g.m14967b());
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Long l = (Long) obj;
        this.f16954b.f17027f = l.longValue();
        if (l.longValue() > 0) {
            C3299r c3299r = this.f16957e.f16873D;
            if (C3299r.m16527a(this.f16953a) <= l.longValue()) {
                C3288f c3288f = this.f16954b;
                c3288f.f17023b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }
        this.f16957e.m16428a(this.f16955c, this.f16954b, this.f16956d);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m16470a();
    }
}
