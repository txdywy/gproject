package com.google.android.finsky.billing.profile;

import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.a.a.ao;

public final class com.google.android.finsky.billing.profile.g implements View$OnClickListener
{

    public final com.google.wireless.android.finsky.a.a.ao a;
    public final String b;
    public final com.google.android.finsky.billing.profile.c c;

    g(com.google.android.finsky.billing.profile.c p0, com.google.wireless.android.finsky.a.a.ao p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.c.af.b(new com.google.android.finsky.d.d(this.c).a(818).a(this.a.v));
        this.c.b(this.b, this.a.z);
    }

}
