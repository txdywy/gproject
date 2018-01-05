package com.google.android.wallet.ui.card;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

final class C6736b implements OnLayoutChangeListener {
    public final /* synthetic */ C6649a f33261a;

    C6736b(C6649a c6649a) {
        this.f33261a = c6649a;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f33261a.f32839d.getLayoutParams().height = i4 - i2;
        this.f33261a.f32841f.removeOnLayoutChangeListener(this);
    }
}
