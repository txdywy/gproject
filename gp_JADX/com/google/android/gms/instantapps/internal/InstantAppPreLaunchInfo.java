package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class InstantAppPreLaunchInfo extends zza {
    public static final Creator CREATOR = new aj();
    public final int f26416a;
    public final String f26417b;
    public final boolean f26418c;
    public final Intent f26419d;
    public final Intent f26420e;
    public final AppInfo f26421f;
    public final Route f26422g;
    public final boolean f26423h;
    public final byte[] f26424i;

    InstantAppPreLaunchInfo(int i, String str, boolean z, Intent intent, Intent intent2, AppInfo appInfo, Route route, boolean z2, byte[] bArr) {
        this.f26416a = i;
        this.f26417b = str;
        this.f26418c = z;
        this.f26419d = intent;
        this.f26420e = intent2;
        this.f26421f = appInfo;
        this.f26422g = route;
        this.f26423h = z2;
        this.f26424i = bArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f26416a);
        C5130b.m23844a(parcel, 3, this.f26417b);
        C5130b.m23846a(parcel, 4, this.f26418c);
        C5130b.m23842a(parcel, 5, this.f26419d, i);
        C5130b.m23842a(parcel, 6, this.f26420e, i);
        C5130b.m23842a(parcel, 8, this.f26421f, i);
        C5130b.m23842a(parcel, 9, this.f26422g, i);
        C5130b.m23846a(parcel, 10, this.f26423h);
        C5130b.m23847a(parcel, 11, this.f26424i);
        C5130b.m23853b(parcel, a);
    }
}
