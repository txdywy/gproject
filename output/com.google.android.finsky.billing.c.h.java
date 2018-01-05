package com.google.android.finsky.billing.c;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.finsky.ba.e;
import com.google.android.gms.measurement.AppMeasurement;

public class com.google.android.finsky.billing.c.h
{

    public final Context a;
    public AppMeasurement b;
    public AsyncTask c;
    public String d;

    h(Context p0, com.google.android.finsky.ba.e p1, Bundle p2) {
        this.a = p0;
        if (p1.a(12641226))
            this.b = AppMeasurement.getInstance(this.a);
        if (p2 != 0)
            this.d = p2.getString("AcquireScionPayloadModel.payload");
    }

}
