package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class UdcCacheRequest extends zza {
    public static final Creator CREATOR = new C5610j();
    public final int[] f28542a;

    public UdcCacheRequest(int[] iArr) {
        this.f28542a = iArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UdcCacheRequest)) {
            return false;
        }
        return Arrays.equals(this.f28542a, ((UdcCacheRequest) obj).f28542a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28542a});
    }

    public String toString() {
        return ad.m23721a(this).m23723a("SettingId", Arrays.toString(this.f28542a)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23848a(parcel, 2, this.f28542a);
        C5130b.m23853b(parcel, a);
    }
}
