package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.play.utils.m;

final class C1930d implements m {
    public final /* synthetic */ C1927b f9885a;

    C1930d(C1927b c1927b) {
        this.f9885a = c1927b;
    }

    public final void m10336a(View view, String str) {
        this.f9885a.m10227a(756, false);
        this.f9885a.m580a(new Intent("android.intent.action.VIEW", Uri.parse(this.f9885a.ao.m10002a(this.f9885a.an.name))));
    }
}
