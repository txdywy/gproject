package com.google.android.finsky.activities;

import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.z implements com.android.volley.w
{

    public final com.google.android.finsky.activities.t a;

    z(com.google.android.finsky.activities.t p0) {
        this.a = p0;
    }

    public final void a(VolleyError p0) {
        v0 = this.a.getString(2131952006);
        Toast.makeText(this.a, v0, 1).show();
        v2 = new Object[2];
        v2[0] = v0;
        v2[1] = p0.getMessage();
        FinskyLog.d("%s Volley error message: %s", v2);
    }

}
