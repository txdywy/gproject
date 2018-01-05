package com.google.android.finsky.activities;

import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.deviceconfig.e;
import com.google.android.finsky.m;

public final class com.google.android.finsky.activities.aj implements com.google.android.finsky.deviceconfig.j
{

    public final com.google.android.finsky.deviceconfig.e a;
    public final com.google.android.finsky.activities.t b;

    aj(com.google.android.finsky.activities.t p0, com.google.android.finsky.deviceconfig.e p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a() {
        if (com.google.android.finsky.m.a.ap().c() != 0) {
            v2 = new Object[1];
            v2[0] = this.a.a(com.google.android.finsky.m.a.ap().c());
            Toast.makeText(this.b, this.b.getString(2131952030, v2), 1).show();
        }
    }

    public final void a(VolleyError p0) {
        v2 = new Object[1];
        v2[0] = com.google.android.finsky.api.m.a(this.b, p0);
        Toast.makeText(this.b, this.b.getString(2131952029, v2), 1).show();
    }

}
