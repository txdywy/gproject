package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class UsesApp extends zza {
    public static final Creator CREATOR = new C5296z();
    public final String f26446a;

    public UsesApp(String str) {
        this.f26446a = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26446a);
        C5130b.m23853b(parcel, a);
    }
}
