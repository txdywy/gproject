package com.google.android.finsky.hygiene;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.preregistration.C3197o;
import com.squareup.leakcanary.C7582R;

final class C3198h implements C3197o {
    public final /* synthetic */ C1473m f16495a;
    public final /* synthetic */ C1254c f16496b;
    public final /* synthetic */ boolean f16497c;
    public final /* synthetic */ DailyHygiene f16498d;

    C3198h(DailyHygiene dailyHygiene, C1473m c1473m, C1254c c1254c, boolean z) {
        this.f16498d = dailyHygiene;
        this.f16495a = c1473m;
        this.f16496b = c1254c;
        this.f16497c = z;
    }

    public final void mo3372a(Document document, String str) {
        Context context = this.f16498d.f16436h;
        ab r = this.f16495a.mo2259r();
        C2495w a = this.f16498d.f16442n.m13365a();
        context.getResources().getDimensionPixelSize(C7582R.dimen.notification_icon_size);
        r.mo3775a(document, str, C1600a.m9198a(document), a);
    }

    public final void mo3373a(boolean z) {
        DailyHygiene dailyHygiene = this.f16498d;
        C1254c c1254c = this.f16496b;
        boolean z2 = this.f16497c && z;
        dailyHygiene.m16194b(c1254c, z2);
    }
}
