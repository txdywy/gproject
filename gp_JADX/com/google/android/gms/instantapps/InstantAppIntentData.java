package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class InstantAppIntentData extends zza {
    public static final Creator CREATOR = new C5268g();
    public static final InstantAppIntentData f26380a = new InstantAppIntentData(null, 1);
    public final Intent f26381b;
    public final int f26382c;

    public InstantAppIntentData(Intent intent, int i) {
        this.f26381b = intent;
        this.f26382c = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 1, this.f26381b, i);
        C5130b.m23854b(parcel, 2, this.f26382c);
        C5130b.m23853b(parcel, a);
    }
}
