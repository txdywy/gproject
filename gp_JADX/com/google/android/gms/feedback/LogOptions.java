package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class LogOptions extends zza {
    public static final Creator CREATOR = new C5193f();
    public String f26199a;
    public boolean f26200b;

    LogOptions(String str, boolean z) {
        this.f26199a = str;
        this.f26200b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26199a);
        C5130b.m23846a(parcel, 3, this.f26200b);
        C5130b.m23853b(parcel, a);
    }
}
