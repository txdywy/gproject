package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.bg;

public final class bk extends bh {
    public /* synthetic */ Intent f26025a;
    public /* synthetic */ bg f26026b;
    public /* synthetic */ int f26027c = 2;

    public bk(Intent intent, bg bgVar) {
        this.f26025a = intent;
        this.f26026b = bgVar;
    }

    public final void mo4618a() {
        if (this.f26025a != null) {
            this.f26026b.startActivityForResult(this.f26025a, this.f26027c);
        }
    }
}
