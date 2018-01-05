package com.google.android.gms.instantapps.internal;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public class AppInfo extends zza {
    public static final Creator CREATOR = new C5281j();
    public final String f26396a;
    public final String f26397b;
    public BitmapTeleporter f26398c;
    public final List f26399d;
    public final List f26400e;
    public final int f26401f;
    public final byte[] f26402g;
    public final PackageInfo f26403h;
    public final List f26404i;
    public final List f26405j;
    public final byte[] f26406k;

    AppInfo(String str, String str2, BitmapTeleporter bitmapTeleporter, List list, List list2, List list3, int i, byte[] bArr, PackageInfo packageInfo, List list4, byte[] bArr2) {
        this.f26396a = str;
        this.f26397b = str2;
        this.f26398c = bitmapTeleporter;
        this.f26399d = list;
        this.f26400e = list2;
        this.f26401f = i;
        this.f26402g = bArr;
        this.f26403h = packageInfo;
        this.f26404i = list4;
        this.f26405j = list3;
        this.f26406k = bArr2;
        if (bitmapTeleporter != null) {
            bitmapTeleporter.m23673a();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26396a);
        C5130b.m23844a(parcel, 3, this.f26397b);
        C5130b.m23842a(parcel, 4, this.f26398c, i);
        C5130b.m23855b(parcel, 5, this.f26399d);
        C5130b.m23855b(parcel, 6, this.f26400e);
        C5130b.m23854b(parcel, 7, this.f26401f);
        C5130b.m23847a(parcel, 8, this.f26402g);
        C5130b.m23842a(parcel, 9, this.f26403h, i);
        C5130b.m23855b(parcel, 10, this.f26404i);
        C5130b.m23855b(parcel, 11, this.f26405j);
        C5130b.m23847a(parcel, 12, this.f26406k);
        C5130b.m23853b(parcel, a);
    }
}
