package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzecs extends zza implements C4980w {
    public static final Creator CREATOR = new mw();
    public int f27831a;
    public int f27832b;
    public Intent f27833c;

    public zzecs() {
        this((byte) 0);
    }

    private zzecs(byte b) {
        this(2, 0, null);
    }

    zzecs(int i, int i2, Intent intent) {
        this.f27831a = i;
        this.f27832b = i2;
        this.f27833c = intent;
    }

    public final Status mo4505b() {
        return this.f27832b == 0 ? Status.f25625a : Status.f25629e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f27831a);
        C5130b.m23854b(parcel, 2, this.f27832b);
        C5130b.m23842a(parcel, 3, this.f27833c, i);
        C5130b.m23853b(parcel, a);
    }
}
