package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p108z.C4831h;

final class bs implements OnClickListener {
    public final /* synthetic */ String f6571a;
    public final /* synthetic */ ViewGroup f6572b;
    public final /* synthetic */ bq f6573c;

    bs(bq bqVar, String str, ViewGroup viewGroup) {
        this.f6573c = bqVar;
        this.f6571a = str;
        this.f6572b = viewGroup;
    }

    public final void onClick(View view) {
        this.f6573c.m6350d(2917);
        if (C1473m.f7980a.dj().mo2294a(12643667)) {
            this.f6573c.m6392e();
        } else {
            this.f6573c.f6552c.m16742a(this.f6571a).mo4398a(C4831h.f25111a);
        }
        this.f6572b.setVisibility(4);
    }
}
