package com.google.android.finsky.contentfilterui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class C2348l implements OnClickListener {
    public final /* synthetic */ int f11532a;
    public final /* synthetic */ C2346j f11533b;

    C2348l(C2346j c2346j, int i) {
        this.f11533b = c2346j;
        this.f11532a = i;
    }

    public final void onClick(View view) {
        if (this.f11533b.ah.m11964b()) {
            this.f11533b.m11956b(this.f11532a);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("authSuccess", 3);
        bundle.putInt("filterRangeIndex", this.f11532a);
        this.f11533b.m11952a(bundle, false);
    }
}
