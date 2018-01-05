package com.google.android.gms.common.internal;

import android.content.Intent;
import android.support.v4.app.Fragment;

public final class bj extends bh {
    public /* synthetic */ Intent f26022a;
    public /* synthetic */ Fragment f26023b;
    public /* synthetic */ int f26024c;

    public bj(Intent intent, Fragment fragment, int i) {
        this.f26022a = intent;
        this.f26023b = fragment;
        this.f26024c = i;
    }

    public final void mo4618a() {
        if (this.f26022a != null) {
            this.f26023b.startActivityForResult(this.f26022a, this.f26024c);
        }
    }
}
