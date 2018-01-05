package com.google.android.wallet.ui.common;

import android.support.v4.view.by;
import android.view.View;

final class bk extends by {
    public int f33566a;
    public final /* synthetic */ MaterialFieldLayout f33567b;

    bk(MaterialFieldLayout materialFieldLayout, int i) {
        this.f33567b = materialFieldLayout;
        this.f33566a = i;
    }

    public final void m30750b(View view) {
        super.b(view);
        view.setVisibility(this.f33566a);
        view.setAlpha(1.0f);
        if (this.f33566a == 8) {
            this.f33567b.setPadding(this.f33567b.getPaddingLeft(), this.f33567b.getPaddingTop(), this.f33567b.getPaddingRight(), this.f33567b.f33432e);
        }
        this.f33567b.m30669b();
    }
}
