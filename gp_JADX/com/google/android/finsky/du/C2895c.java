package com.google.android.finsky.du;

import android.widget.Toast;
import com.squareup.leakcanary.C7582R;

final class C2895c implements Runnable {
    public final /* synthetic */ C2893a f15398a;

    C2895c(C2893a c2893a) {
        this.f15398a = c2893a;
    }

    public final void run() {
        Toast.makeText(this.f15398a.f15392a, C7582R.string.refunded, 1).show();
    }
}
