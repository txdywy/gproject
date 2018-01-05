package com.google.android.wallet.common.util;

import android.content.Context;
import android.widget.Toast;

final class C6602n implements Runnable {
    public final /* synthetic */ Context f32759a;
    public final /* synthetic */ String f32760b;

    C6602n(Context context, String str) {
        this.f32759a = context;
        this.f32760b = str;
    }

    public final void run() {
        Toast.makeText(this.f32759a, String.format("Overriding MCC/MNC with %s", new Object[]{this.f32760b}), 0).show();
    }
}
