package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class SafeBrowsingData extends zza {
    public static final Creator CREATOR = new C5578m();
    public String f28487a;
    public DataHolder f28488b;

    public SafeBrowsingData(String str, DataHolder dataHolder) {
        this.f28487a = str;
        this.f28488b = dataHolder;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28487a);
        C5130b.m23842a(parcel, 3, this.f28488b, i);
        C5130b.m23853b(parcel, a);
    }
}
