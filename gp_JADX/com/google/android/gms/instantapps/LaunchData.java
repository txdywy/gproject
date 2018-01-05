package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class LaunchData extends zza {
    public static final Creator CREATOR = new C5270i();
    public final Intent f26383a;
    public final String f26384b;
    public final String f26385c;
    public BitmapTeleporter f26386d;

    public LaunchData(Intent intent, String str, String str2, BitmapTeleporter bitmapTeleporter) {
        this.f26383a = intent;
        this.f26384b = str;
        this.f26385c = str2;
        this.f26386d = bitmapTeleporter;
        if (bitmapTeleporter != null) {
            bitmapTeleporter.m23673a();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 2, this.f26383a, i);
        C5130b.m23844a(parcel, 3, this.f26384b);
        C5130b.m23844a(parcel, 4, this.f26385c);
        C5130b.m23842a(parcel, 5, this.f26386d, i);
        C5130b.m23853b(parcel, a);
    }
}
