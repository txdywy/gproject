package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzcqh extends zza {
    public static final Creator CREATOR = new gi();
    public int f27807a;
    public String f27808b;
    public String f27809c;
    public zzcvg f27810d;
    public long f27811e;
    public boolean f27812f;
    public String f27813g;
    public zzcqw f27814h;
    public long f27815i;
    public zzcqw f27816j;
    public long f27817k;
    public zzcqw f27818l;

    zzcqh(int i, String str, String str2, zzcvg com_google_android_gms_internal_zzcvg, long j, boolean z, String str3, zzcqw com_google_android_gms_internal_zzcqw, long j2, zzcqw com_google_android_gms_internal_zzcqw2, long j3, zzcqw com_google_android_gms_internal_zzcqw3) {
        this.f27807a = i;
        this.f27808b = str;
        this.f27809c = str2;
        this.f27810d = com_google_android_gms_internal_zzcvg;
        this.f27811e = j;
        this.f27812f = z;
        this.f27813g = str3;
        this.f27814h = com_google_android_gms_internal_zzcqw;
        this.f27815i = j2;
        this.f27816j = com_google_android_gms_internal_zzcqw2;
        this.f27817k = j3;
        this.f27818l = com_google_android_gms_internal_zzcqw3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f27807a);
        C5130b.m23844a(parcel, 2, this.f27808b);
        C5130b.m23844a(parcel, 3, this.f27809c);
        C5130b.m23842a(parcel, 4, this.f27810d, i);
        C5130b.m23839a(parcel, 5, this.f27811e);
        C5130b.m23846a(parcel, 6, this.f27812f);
        C5130b.m23844a(parcel, 7, this.f27813g);
        C5130b.m23842a(parcel, 8, this.f27814h, i);
        C5130b.m23839a(parcel, 9, this.f27815i);
        C5130b.m23842a(parcel, 10, this.f27816j, i);
        C5130b.m23839a(parcel, 11, this.f27817k);
        C5130b.m23842a(parcel, 12, this.f27818l, i);
        C5130b.m23853b(parcel, a);
    }
}
