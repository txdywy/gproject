package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class TogglingData extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C5231n();
    public String f26303a;
    public String f26304b;
    public String f26305c;

    private TogglingData() {
    }

    TogglingData(String str, String str2, String str3) {
        this.f26303a = str;
        this.f26304b = str2;
        this.f26305c = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26303a);
        C5130b.m23844a(parcel, 3, this.f26304b);
        C5130b.m23844a(parcel, 4, this.f26305c);
        C5130b.m23853b(parcel, a);
    }
}
