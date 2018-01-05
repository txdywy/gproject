package com.google.android.finsky.family.remoteescalation;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.utils.FinskyLog;

final class C3094l implements C0657w {
    C3094l() {
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(C1473m.f7980a.f7981b, C1290m.m7702a(C1473m.f7980a.f7981b, volleyError), 1).show();
        FinskyLog.m21660a(volleyError, "error updating remote escalation", new Object[0]);
    }
}
