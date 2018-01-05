package com.google.android.finsky.activities;

import android.widget.Toast;
import com.squareup.leakcanary.C7582R;

final class da implements Runnable {
    public final /* synthetic */ cu f6655a;

    da(cu cuVar) {
        this.f6655a = cuVar;
    }

    public final void run() {
        Toast.makeText(this.f6655a.f6517B, C7582R.string.cancel_preorder_okay, 0).show();
    }
}
