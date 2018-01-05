package com.google.android.finsky.api;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.play.utils.m;

final class C1292o implements m {
    public final /* synthetic */ Context f7690a;
    public final /* synthetic */ Intent f7691b;

    C1292o(Context context, Intent intent) {
        this.f7690a = context;
        this.f7691b = intent;
    }

    public final void m7706a(View view, String str) {
        this.f7690a.startActivity(this.f7691b);
    }
}
