package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.List;

public class UdcCacheResponse extends zza {
    public static final Creator CREATOR = new C5611k();
    public final List f28547a;
    public final int[] f28548b;
    public final boolean f28549c;

    public class SettingAvailability extends zza {
        public static final Creator CREATOR = new C5606f();
        public final boolean f28543a;

        public SettingAvailability(boolean z) {
            this.f28543a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof SettingAvailability)) {
                return false;
            }
            return this.f28543a == ((SettingAvailability) obj).f28543a;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f28543a)});
        }

        public String toString() {
            return ad.m23721a(this).m23723a("CanShowValue", Boolean.valueOf(this.f28543a)).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C5130b.m23836a(parcel, 20293);
            C5130b.m23846a(parcel, 2, this.f28543a);
            C5130b.m23853b(parcel, a);
        }
    }

    public class UdcSetting extends zza {
        public static final Creator CREATOR = new C5612l();
        public final int f28544a;
        public final int f28545b;
        public final SettingAvailability f28546c;

        public UdcSetting(int i, int i2, SettingAvailability settingAvailability) {
            this.f28544a = i;
            this.f28545b = i2;
            this.f28546c = settingAvailability;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof UdcSetting)) {
                return false;
            }
            UdcSetting udcSetting = (UdcSetting) obj;
            return this.f28544a == udcSetting.f28544a && this.f28545b == udcSetting.f28545b && ad.m23722a(this.f28546c, udcSetting.f28546c);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28544a), Integer.valueOf(this.f28545b), this.f28546c});
        }

        public String toString() {
            return ad.m23721a(this).m23723a("SettingId", Integer.valueOf(this.f28544a)).m23723a("SettingValue", Integer.valueOf(this.f28545b)).m23723a("SettingAvailability", this.f28546c).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C5130b.m23836a(parcel, 20293);
            C5130b.m23854b(parcel, 2, this.f28544a);
            C5130b.m23854b(parcel, 3, this.f28545b);
            C5130b.m23842a(parcel, 4, this.f28546c, i);
            C5130b.m23853b(parcel, a);
        }
    }

    public UdcCacheResponse(List list, int[] iArr, boolean z) {
        this.f28547a = list;
        this.f28548b = iArr;
        this.f28549c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof UdcCacheResponse)) {
            return false;
        }
        UdcCacheResponse udcCacheResponse = (UdcCacheResponse) obj;
        return this.f28547a.equals(udcCacheResponse.f28547a) && Arrays.equals(this.f28548b, udcCacheResponse.f28548b) && this.f28549c == udcCacheResponse.f28549c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28547a, this.f28548b, Boolean.valueOf(this.f28549c)});
    }

    public String toString() {
        return ad.m23721a(this).m23723a("Settings", this.f28547a).m23723a("ConsentableSettings", Arrays.toString(this.f28548b)).m23723a("CanMostLikelyStartConsentFlow", Boolean.valueOf(this.f28549c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23855b(parcel, 2, this.f28547a);
        C5130b.m23848a(parcel, 3, this.f28548b);
        C5130b.m23846a(parcel, 4, this.f28549c);
        C5130b.m23853b(parcel, a);
    }
}
