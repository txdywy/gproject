package com.google.android.wallet.common.pub;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class C6582c implements OnFocusChangeListener {
    public boolean f32718a;
    public final /* synthetic */ C6529a f32719b;

    C6582c(C6529a c6529a) {
        this.f32719b = c6529a;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z && !this.f32718a) {
            this.f32718a = true;
            this.f32719b.m29604W();
        }
    }
}
