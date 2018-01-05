package com.google.android.finsky.billing.profile;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.wireless.android.finsky.a.a.ao;

final class C2052g implements OnClickListener {
    public final /* synthetic */ ao f10551a;
    public final /* synthetic */ String f10552b;
    public final /* synthetic */ C2048c f10553c;

    C2052g(C2048c c2048c, ao aoVar, String str) {
        this.f10553c = c2048c;
        this.f10551a = aoVar;
        this.f10552b = str;
    }

    public final void onClick(View view) {
        this.f10553c.af.m13379b(new C2475d(this.f10553c).m13256a(818).m13258a(this.f10551a.v));
        this.f10553c.m10803b(this.f10552b, this.f10551a.z);
    }
}
