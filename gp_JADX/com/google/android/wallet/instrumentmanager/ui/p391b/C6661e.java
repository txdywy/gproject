package com.google.android.wallet.instrumentmanager.ui.p391b;

import com.google.android.wallet.ui.common.FormEditText;

final class C6661e implements Runnable {
    public final /* synthetic */ FormEditText f32866a;
    public final /* synthetic */ int f32867b;

    C6661e(FormEditText formEditText, int i) {
        this.f32866a = formEditText;
        this.f32867b = i;
    }

    public final void run() {
        this.f32866a.setThreshold(this.f32867b);
        this.f32866a.m30525i();
    }
}
