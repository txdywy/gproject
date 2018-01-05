package com.google.android.finsky.billing.p153c;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.finsky.ba.C1552e;
import com.google.android.gms.measurement.AppMeasurement;

public final class C1784h {
    public final Context f9235a;
    public AppMeasurement f9236b;
    public AsyncTask f9237c;
    public String f9238d;

    public C1784h(Context context, C1552e c1552e, Bundle bundle) {
        this.f9235a = context;
        if (c1552e.mo2294a(12641226)) {
            this.f9236b = AppMeasurement.getInstance(this.f9235a);
        }
        if (bundle != null) {
            this.f9238d = bundle.getString("AcquireScionPayloadModel.payload");
        }
    }
}
