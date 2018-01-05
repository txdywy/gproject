package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class ContentRating extends zza {
    public static final Creator CREATOR = new ad();
    public final String f26414a;
    public final String f26415b;

    public ContentRating(String str, String str2) {
        this.f26414a = str;
        this.f26415b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26414a);
        C5130b.m23844a(parcel, 3, this.f26415b);
        C5130b.m23853b(parcel, a);
    }
}
