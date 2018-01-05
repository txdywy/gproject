package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzbv;
import com.google.android.gms.internal.zzedc;

final class C5083x extends al {
    public /* synthetic */ C5075p f25910a;
    public /* synthetic */ zzedc f25911b;

    C5083x(aj ajVar, C5075p c5075p, zzedc com_google_android_gms_internal_zzedc) {
        this.f25910a = c5075p;
        this.f25911b = com_google_android_gms_internal_zzedc;
        super(ajVar);
    }

    public final void mo4606a() {
        C5075p c5075p = this.f25910a;
        zzedc com_google_android_gms_internal_zzedc = this.f25911b;
        if (c5075p.m23630b(0)) {
            ConnectionResult connectionResult = com_google_android_gms_internal_zzedc.f27837b;
            if (connectionResult.m23264b()) {
                zzbv com_google_android_gms_common_internal_zzbv = com_google_android_gms_internal_zzedc.f27838c;
                connectionResult = com_google_android_gms_common_internal_zzbv.f26068c;
                if (connectionResult.m23264b()) {
                    c5075p.f25890m = true;
                    c5075p.f25891n = com_google_android_gms_common_internal_zzbv.m23861a();
                    c5075p.f25892o = com_google_android_gms_common_internal_zzbv.f26069d;
                    c5075p.f25893p = com_google_android_gms_common_internal_zzbv.f26070e;
                    c5075p.m23633e();
                    return;
                }
                String valueOf = String.valueOf(connectionResult);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                c5075p.m23627b(connectionResult);
            } else if (c5075p.m23625a(connectionResult)) {
                c5075p.m23634f();
                c5075p.m23633e();
            } else {
                c5075p.m23627b(connectionResult);
            }
        }
    }
}
