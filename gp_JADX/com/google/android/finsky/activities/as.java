package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.aa.C0957n;

final class as implements OnClickListener {
    public final /* synthetic */ C0957n f6462a;
    public final /* synthetic */ C1033t f6463b;

    as(C1033t c1033t, C0957n c0957n) {
        this.f6463b = c1033t;
        this.f6462a = c0957n;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6462a.m5765c();
        C1033t.m6043c();
        new Handler(Looper.getMainLooper()).postDelayed(this.f6463b.f6307b, 3000);
    }
}
