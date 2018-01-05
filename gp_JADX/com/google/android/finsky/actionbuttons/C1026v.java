package com.google.android.finsky.actionbuttons;

import android.widget.Toast;
import com.squareup.leakcanary.C7582R;

final class C1026v implements Runnable {
    public final /* synthetic */ C1024t f6282a;

    C1026v(C1024t c1024t) {
        this.f6282a = c1024t;
    }

    public final void run() {
        Toast.makeText(this.f6282a.a, C7582R.string.cancel_preorder_okay, 0).show();
    }
}
