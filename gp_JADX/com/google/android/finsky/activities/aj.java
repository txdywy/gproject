package com.google.android.finsky.activities;

import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.deviceconfig.C1050j;
import com.google.android.finsky.deviceconfig.C2693e;
import com.squareup.leakcanary.C7582R;

final class aj implements C1050j {
    public final /* synthetic */ C2693e f6447a;
    public final /* synthetic */ C1033t f6448b;

    aj(C1033t c1033t, C2693e c2693e) {
        this.f6448b = c1033t;
        this.f6447a = c2693e;
    }

    public final void mo1306a() {
        if (C1473m.f7980a.ap().mo1636c() != null) {
            Toast.makeText(this.f6448b, this.f6448b.getString(C7582R.string.debug_upload_device_config_toast_success, new Object[]{this.f6447a.mo3111a(C1473m.f7980a.ap().mo1636c())}), 1).show();
        }
    }

    public final void mo1307a(VolleyError volleyError) {
        Toast.makeText(this.f6448b, this.f6448b.getString(C7582R.string.debug_upload_device_config_toast_failure, new Object[]{C1290m.m7702a(this.f6448b, volleyError)}), 1).show();
    }
}
