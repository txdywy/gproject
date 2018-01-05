package com.google.android.wallet.ui.common;

import android.support.v4.view.b;
import android.view.View;

final class bd extends b {
    public final /* synthetic */ InlineSelectView f33557a;

    bd(InlineSelectView inlineSelectView) {
        this.f33557a = inlineSelectView;
    }

    public final void m30747a(View view, android.support.v4.view.a.b bVar) {
        super.a(view, bVar);
        Integer num = (Integer) view.getTag();
        bVar.a(true);
        bVar.b(num.intValue() == this.f33557a.getSelectedItemIndex());
    }
}
