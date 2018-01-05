package com.google.android.wallet.common.util;

import android.content.Context;
import android.widget.Toast;

final class C6601m implements Runnable {
    public final /* synthetic */ Context f32757a;
    public final /* synthetic */ String f32758b;

    C6601m(Context context, String str) {
        this.f32757a = context;
        this.f32758b = str;
    }

    public final void run() {
        Toast.makeText(this.f32757a, String.format("Overriding client id with %s", new Object[]{this.f32758b}), 0).show();
    }
}
