package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.google.android.finsky.z.e;

public final class com.google.android.finsky.activities.bb implements com.google.android.finsky.z.f
{

    public final Context a;

    bb(Context p0) {
        this.a = p0;
    }

    public final void a(com.google.android.finsky.z.e p0) {
        Toast.makeText(this.a, "Scheduled Debug Job", 0).show();
    }

}
