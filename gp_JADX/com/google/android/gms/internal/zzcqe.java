package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzcqe extends zza {
    public static final Creator CREATOR = new gg();
    public final String f27793a;
    public final String f27794b;
    public final String f27795c;
    public final String f27796d;
    public final long f27797e;
    public final long f27798f;
    public final String f27799g;
    public final boolean f27800h;
    public final boolean f27801i;
    public final long f27802j;
    public final String f27803k;
    public final long f27804l;
    public final long f27805m;
    public final int f27806n;

    zzcqe(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i) {
        am.m23735a(str);
        this.f27793a = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        this.f27794b = str2;
        this.f27795c = str3;
        this.f27802j = j;
        this.f27796d = str4;
        this.f27797e = j2;
        this.f27798f = j3;
        this.f27799g = str5;
        this.f27800h = z;
        this.f27801i = z2;
        this.f27803k = str6;
        this.f27804l = 0;
        this.f27805m = j4;
        this.f27806n = i;
    }

    zzcqe(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i) {
        this.f27793a = str;
        this.f27794b = str2;
        this.f27795c = str3;
        this.f27802j = j3;
        this.f27796d = str4;
        this.f27797e = j;
        this.f27798f = j2;
        this.f27799g = str5;
        this.f27800h = z;
        this.f27801i = z2;
        this.f27803k = str6;
        this.f27804l = j4;
        this.f27805m = j5;
        this.f27806n = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f27793a);
        C5130b.m23844a(parcel, 3, this.f27794b);
        C5130b.m23844a(parcel, 4, this.f27795c);
        C5130b.m23844a(parcel, 5, this.f27796d);
        C5130b.m23839a(parcel, 6, this.f27797e);
        C5130b.m23839a(parcel, 7, this.f27798f);
        C5130b.m23844a(parcel, 8, this.f27799g);
        C5130b.m23846a(parcel, 9, this.f27800h);
        C5130b.m23846a(parcel, 10, this.f27801i);
        C5130b.m23839a(parcel, 11, this.f27802j);
        C5130b.m23844a(parcel, 12, this.f27803k);
        C5130b.m23839a(parcel, 13, this.f27804l);
        C5130b.m23839a(parcel, 14, this.f27805m);
        C5130b.m23854b(parcel, 15, this.f27806n);
        C5130b.m23853b(parcel, a);
    }
}
