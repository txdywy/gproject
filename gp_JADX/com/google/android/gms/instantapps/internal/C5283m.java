package com.google.android.gms.instantapps.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.C5264c;

final class C5283m implements C5264c {
    public final Status f26465a;
    public final InstantAppPreLaunchInfo f26466b;

    C5283m(Status status, InstantAppPreLaunchInfo instantAppPreLaunchInfo) {
        this.f26466b = instantAppPreLaunchInfo;
        this.f26465a = status;
    }

    public final InstantAppPreLaunchInfo mo4690a() {
        return this.f26466b;
    }

    public final Status mo4505b() {
        return this.f26465a;
    }
}
