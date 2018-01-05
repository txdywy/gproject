package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class SettingDisplayInfo extends zza {
    public static final Creator CREATOR = new C5607g();
    public SettingState f28537a;
    public String f28538b;
    public String f28539c;

    public SettingDisplayInfo(SettingState settingState, String str, String str2) {
        this.f28537a = settingState;
        this.f28538b = str;
        this.f28539c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingDisplayInfo)) {
            return false;
        }
        SettingDisplayInfo settingDisplayInfo = (SettingDisplayInfo) obj;
        return ad.m23722a(this.f28538b, settingDisplayInfo.f28538b) && ad.m23722a(this.f28539c, settingDisplayInfo.f28539c) && ad.m23722a(this.f28537a, settingDisplayInfo.f28537a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28537a, this.f28538b, this.f28539c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 2, this.f28537a, i);
        C5130b.m23844a(parcel, 3, this.f28538b);
        C5130b.m23844a(parcel, 4, this.f28539c);
        C5130b.m23853b(parcel, a);
    }
}
