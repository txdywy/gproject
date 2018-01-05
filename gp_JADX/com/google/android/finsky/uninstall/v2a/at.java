package com.google.android.finsky.uninstall.v2a;

import android.content.Intent;
import android.view.View;
import com.google.android.play.utils.m;

final class at implements m {
    public final /* synthetic */ Intent f23739a;
    public final /* synthetic */ as f23740b;

    at(as asVar, Intent intent) {
        this.f23740b = asVar;
        this.f23739a = intent;
    }

    public final void m21517a(View view, String str) {
        this.f23740b.f23738a.startActivity(this.f23739a);
    }
}
