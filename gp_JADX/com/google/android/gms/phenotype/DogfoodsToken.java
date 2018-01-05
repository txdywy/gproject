package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class DogfoodsToken extends zza {
    public static final Creator CREATOR = new C5567z();
    public final byte[] f28292a;

    public DogfoodsToken(byte[] bArr) {
        this.f28292a = bArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23847a(parcel, 2, this.f28292a);
        C5130b.m23853b(parcel, a);
    }
}
