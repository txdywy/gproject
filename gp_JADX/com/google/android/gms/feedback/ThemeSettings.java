package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class ThemeSettings extends zza {
    public static final Creator CREATOR = new C5194g();
    public int f26201a;
    public int f26202b;

    public ThemeSettings() {
        this(0, 0);
    }

    ThemeSettings(int i, int i2) {
        this.f26201a = i;
        this.f26202b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f26201a);
        C5130b.m23854b(parcel, 3, this.f26202b);
        C5130b.m23853b(parcel, a);
    }
}
