package com.google.android.gms.clearcut.internal;

import android.content.Context;
import com.google.android.gms.clearcut.C5012a;
import com.google.android.gms.clearcut.C5018f;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.api.internal.cg;

public final class C5023a extends C5022m implements C5018f {
    private C5023a(Context context) {
        super(context, C5012a.f25522c, new cg());
    }

    public static C5018f m23221a(Context context) {
        return new C5023a(context);
    }

    public final C4954s mo4521a(LogEventParcelable logEventParcelable) {
        return super.m23219a(new C5027c(logEventParcelable, this.f25591g));
    }
}
