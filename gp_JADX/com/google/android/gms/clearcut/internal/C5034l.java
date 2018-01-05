package com.google.android.gms.clearcut.internal;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.internal.dr;
import com.google.android.gms.internal.od;

final class C5034l {
    public final ContentResolver f25599a;

    C5034l(Context context) {
        if (context != null) {
            if (C5033k.f25597b == null) {
                C5033k.f25597b = Boolean.valueOf(dr.f26667b.m24299a(context).m24294a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
            }
            if (C5033k.f25597b.booleanValue()) {
                this.f25599a = context.getContentResolver();
                od.m25265a(this.f25599a, "gms:playlog:service:sampling_");
                return;
            }
        }
        this.f25599a = null;
    }
}
