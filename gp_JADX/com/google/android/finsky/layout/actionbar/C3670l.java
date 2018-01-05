package com.google.android.finsky.layout.actionbar;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;

final class C3670l implements OnClickListener {
    public final /* synthetic */ OnClickListener f18476a;
    public final /* synthetic */ FinskySearchToolbar f18477b;

    C3670l(FinskySearchToolbar finskySearchToolbar, OnClickListener onClickListener) {
        this.f18477b = finskySearchToolbar;
        this.f18476a = onClickListener;
    }

    public final void onClick(View view) {
        this.f18477b.f18437T.m13379b(new C2475d(this.f18477b.m17372k()));
        if (this.f18477b.f18433P != null) {
            this.f18477b.f18433P.mo1262a(this.f18477b.f18437T.m13365a());
        }
        if (this.f18476a != null) {
            this.f18476a.onClick(view);
        }
    }
}
