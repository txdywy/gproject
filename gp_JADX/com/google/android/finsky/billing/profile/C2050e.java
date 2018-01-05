package com.google.android.finsky.billing.profile;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;

final class C2050e implements OnClickListener {
    public final /* synthetic */ C2066w f10546a;
    public final /* synthetic */ byte[] f10547b;
    public final /* synthetic */ C2048c f10548c;

    C2050e(C2048c c2048c, C2066w c2066w, byte[] bArr) {
        this.f10548c = c2048c;
        this.f10546a = c2066w;
        this.f10547b = bArr;
    }

    public final void onClick(View view) {
        if (this.f10548c.e.as == null) {
            this.f10548c.e.as = this.f10546a.f10593a;
            this.f10548c.af.m13379b(new C2475d(this.f10548c).m13256a(819).m13258a(this.f10546a.f10599g));
            this.f10548c.e.m10817a(this.f10546a.f10597e, this.f10547b, this.f10546a.f10599g, this.f10548c.af);
        }
    }
}
