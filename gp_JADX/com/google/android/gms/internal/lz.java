package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.C5322c;
import com.google.android.gms.safetynet.zza;

final class lz implements C5322c {
    public final Status f27163a;
    public final zza f27164b;

    public lz(Status status, zza com_google_android_gms_safetynet_zza) {
        this.f27163a = status;
        this.f27164b = com_google_android_gms_safetynet_zza;
    }

    public final String mo4817a() {
        if (this.f27164b == null) {
            return null;
        }
        return this.f27164b.f28501a;
    }

    public final Status mo4505b() {
        return this.f27163a;
    }
}
