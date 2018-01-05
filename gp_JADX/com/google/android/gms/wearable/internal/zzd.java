package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzd extends zza {
    public static final Creator CREATOR = new ah();
    public aq f28639a;
    public IntentFilter[] f28640b;
    public String f28641c;
    public String f28642d;

    zzd(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        aq aqVar = null;
        if (iBinder != null) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
                aqVar = queryLocalInterface instanceof aq ? (aq) queryLocalInterface : new as(iBinder);
            }
            this.f28639a = aqVar;
        } else {
            this.f28639a = null;
        }
        this.f28640b = intentFilterArr;
        this.f28641c = str;
        this.f28642d = str2;
    }

    public zzd(bv bvVar) {
        this.f28639a = bvVar;
        throw new NoSuchMethodError();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23841a(parcel, 2, this.f28639a == null ? null : this.f28639a.asBinder());
        C5130b.m23849a(parcel, 3, this.f28640b, i);
        C5130b.m23844a(parcel, 4, this.f28641c);
        C5130b.m23844a(parcel, 5, this.f28642d);
        C5130b.m23853b(parcel, a);
    }
}
