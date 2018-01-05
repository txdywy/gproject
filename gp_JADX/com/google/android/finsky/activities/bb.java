package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;

final /* synthetic */ class bb implements C0978f {
    public final Context f6476a;

    bb(Context context) {
        this.f6476a = context;
    }

    public final void mo1172a(C4809e c4809e) {
        Toast.makeText(this.f6476a, "Scheduled Debug Job", 0).show();
    }
}
