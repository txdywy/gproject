package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.at.C1508k;
import com.squareup.leakcanary.C7582R;

final class ce implements OnClickListener {
    public final /* synthetic */ String f6596a;
    public final /* synthetic */ ViewGroup f6597b;
    public final /* synthetic */ bq f6598c;

    ce(bq bqVar, String str, ViewGroup viewGroup) {
        this.f6598c = bqVar;
        this.f6596a = str;
        this.f6597b = viewGroup;
    }

    public final void onClick(View view) {
        C1473m c1473m = C1473m.f7980a;
        this.f6598c.m6350d(2911);
        if (c1473m.mo2258q().m11723e()) {
            this.f6598c.f6551b.mo3462p(this.f6596a);
            this.f6597b.setVisibility(0);
            return;
        }
        C1508k c1508k = new C1508k();
        c1508k.m8848a((int) C7582R.string.network_error).m8860d((int) C7582R.string.ok);
        c1508k.mo2272a().m625a(this.f6598c.A.f730B, "download_no_network_dialog");
    }
}
