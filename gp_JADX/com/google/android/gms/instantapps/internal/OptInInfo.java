package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class OptInInfo extends zza {
    public static final Creator CREATOR = new C5289s();
    public final int f26425a;
    public final String f26426b;
    public final Account[] f26427c;
    public final boolean f26428d;

    OptInInfo(int i, String str, Account[] accountArr, boolean z) {
        this.f26425a = i;
        this.f26426b = str;
        this.f26427c = accountArr;
        this.f26428d = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f26425a);
        C5130b.m23844a(parcel, 3, this.f26426b);
        C5130b.m23849a(parcel, 4, this.f26427c, i);
        C5130b.m23846a(parcel, 5, this.f26428d);
        C5130b.m23853b(parcel, a);
    }
}
