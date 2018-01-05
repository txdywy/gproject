package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public class StorageInfoResponse extends zza {
    public static final Creator CREATOR = new bj();
    public final int f28583a;
    public final long f28584b;
    public final List f28585c;

    public StorageInfoResponse(int i, long j, List list) {
        this.f28583a = i;
        this.f28584b = j;
        this.f28585c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28583a);
        C5130b.m23839a(parcel, 3, this.f28584b);
        C5130b.m23855b(parcel, 4, this.f28585c);
        C5130b.m23853b(parcel, a);
    }
}
