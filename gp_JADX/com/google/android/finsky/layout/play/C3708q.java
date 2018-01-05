package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.activities.DebugActivity;

final class C3708q implements Runnable {
    public final /* synthetic */ Context f18791a;

    C3708q(Context context) {
        this.f18791a = context;
    }

    public final void run() {
        this.f18791a.startActivity(new Intent(this.f18791a, DebugActivity.class));
    }
}
