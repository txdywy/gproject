package com.google.android.finsky.api;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public final class com.google.android.finsky.api.o implements com.google.android.play.utils.m
{

    public final Context a;
    public final Intent b;

    o(Context p0, Intent p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(View p0, String p1) {
        this.a.startActivity(this.b);
    }

}
