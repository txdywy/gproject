package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class OverflowMenuItem extends zza {
    public static final Creator CREATOR = new C5230m();
    public int f26300a;
    public String f26301b;
    public Intent f26302c;

    public OverflowMenuItem(int i, String str, Intent intent) {
        this.f26300a = i;
        this.f26301b = str;
        this.f26302c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f26300a);
        C5130b.m23844a(parcel, 3, this.f26301b);
        C5130b.m23842a(parcel, 4, this.f26302c, i);
        C5130b.m23853b(parcel, a);
    }
}
