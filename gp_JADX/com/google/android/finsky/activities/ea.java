package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;

final class ea implements OnClickListener {
    public final /* synthetic */ C2473o f6693a;
    public final /* synthetic */ dx f6694b;

    ea(dx dxVar, C2473o c2473o) {
        this.f6694b = dxVar;
        this.f6693a = c2473o;
    }

    public final void onClick(View view) {
        this.f6694b.bw.m13379b(new C2475d(this.f6693a));
        this.f6694b.bp.mo3666a(this.f6694b.f6681a.f14885a.f12116w, null, this.f6694b.f6685h, this.f6694b.bu, null, false, this.f6694b.bw);
    }
}
