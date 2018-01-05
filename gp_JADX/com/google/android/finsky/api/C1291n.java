package com.google.android.finsky.api;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.play.utils.m;

final class C1291n implements m {
    public final /* synthetic */ Context f7688a;
    public final /* synthetic */ Intent f7689b;

    C1291n(Context context, Intent intent) {
        this.f7688a = context;
        this.f7689b = intent;
    }

    public final void m7705a(View view, String str) {
        this.f7688a.startActivity(this.f7689b);
    }
}
