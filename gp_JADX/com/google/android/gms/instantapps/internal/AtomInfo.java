package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class AtomInfo extends zza {
    public static final Creator CREATOR = new ab();
    public final String f26407a;
    public final String f26408b;
    public final String[] f26409c;
    public final int[] f26410d;
    public final int f26411e;
    public final byte[] f26412f;
    public final boolean f26413g;

    public AtomInfo(String str, String str2, String[] strArr, int[] iArr, int i, byte[] bArr, boolean z) {
        this.f26407a = str;
        this.f26408b = str2;
        this.f26409c = strArr;
        this.f26410d = iArr;
        this.f26411e = i;
        this.f26412f = bArr;
        this.f26413g = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26407a);
        C5130b.m23844a(parcel, 4, this.f26408b);
        C5130b.m23850a(parcel, 5, this.f26409c);
        C5130b.m23854b(parcel, 6, this.f26411e);
        C5130b.m23847a(parcel, 7, this.f26412f);
        C5130b.m23848a(parcel, 8, this.f26410d);
        C5130b.m23846a(parcel, 9, this.f26413g);
        C5130b.m23853b(parcel, a);
    }
}
