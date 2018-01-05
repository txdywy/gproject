package com.google.android.finsky.actionbuttons;

import android.view.View;
import android.view.View.OnClickListener;

final class C1022r implements OnClickListener {
    public final /* synthetic */ OnClickListener f6269a;
    public final /* synthetic */ C1021q f6270b;

    C1022r(C1021q c1021q, OnClickListener onClickListener) {
        this.f6270b = c1021q;
        this.f6269a = onClickListener;
    }

    public final void onClick(View view) {
        if (this.f6270b.f6268r && this.f6270b.f6256f.f14885a.f12099f == 3) {
            this.f6270b.f6261k.m8973a(this.f6270b.a, this.f6270b.f6256f, "23", view.getWidth(), view.getHeight(), this.f6270b.f6257g.mo3705g());
        }
        this.f6269a.onClick(view);
    }
}
