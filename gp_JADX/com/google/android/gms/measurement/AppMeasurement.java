package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.internal.hv;

@Keep
@Deprecated
public class AppMeasurement {
    public final hv f27839a;

    public AppMeasurement(hv hvVar) {
        am.m23733a((Object) hvVar);
        this.f27839a = hvVar;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return hv.m24753a(context).f26933h;
    }

    public final byte[] m26062a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        return this.f27839a.m24763f().m24777a(str, "app", str2, bundle);
    }
}
