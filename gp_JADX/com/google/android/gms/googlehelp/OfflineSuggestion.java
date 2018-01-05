package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class OfflineSuggestion extends zza {
    public static final Creator CREATOR = new C5217h();
    public String f26290a;
    public String f26291b;
    public String f26292c;
    public String f26293d;

    public OfflineSuggestion(String str, String str2, String str3, String str4) {
        this.f26290a = str;
        this.f26291b = str2;
        this.f26292c = str4;
        this.f26293d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26290a);
        C5130b.m23844a(parcel, 3, this.f26291b);
        C5130b.m23844a(parcel, 4, this.f26292c);
        C5130b.m23844a(parcel, 5, this.f26293d);
        C5130b.m23853b(parcel, a);
    }
}
