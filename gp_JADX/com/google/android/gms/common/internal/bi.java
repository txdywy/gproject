package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

public final class bi extends bh {
    public /* synthetic */ Intent f26019a;
    public /* synthetic */ Activity f26020b;
    public /* synthetic */ int f26021c;

    public bi(Intent intent, Activity activity, int i) {
        this.f26019a = intent;
        this.f26020b = activity;
        this.f26021c = i;
    }

    public final void mo4618a() {
        if (this.f26019a != null) {
            this.f26020b.startActivityForResult(this.f26019a, this.f26021c);
        }
    }
}
