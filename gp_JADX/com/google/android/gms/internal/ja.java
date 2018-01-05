package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.am;

public final class ja {
    public static boolean m24856a(Context context) {
        am.m23733a((Object) context);
        return VERSION.SDK_INT >= 24 ? jl.m24920b(context, "com.google.android.gms.measurement.AppMeasurementJobService") : jl.m24920b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }
}
