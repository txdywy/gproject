package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class SettingState extends zza {
    public static final Creator CREATOR = new C5608h();
    public int f28540a;
    public int f28541b;

    public SettingState(int i, int i2) {
        this.f28540a = i;
        this.f28541b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingState)) {
            return false;
        }
        SettingState settingState = (SettingState) obj;
        return ad.m23722a(Integer.valueOf(this.f28540a), Integer.valueOf(settingState.f28540a)) && ad.m23722a(Integer.valueOf(this.f28541b), Integer.valueOf(settingState.f28541b));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28540a), Integer.valueOf(this.f28541b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28540a);
        C5130b.m23854b(parcel, 3, this.f28541b);
        C5130b.m23853b(parcel, a);
    }
}
