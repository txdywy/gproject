package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.C5618f;

@KeepName
public class DataItemAssetParcelable extends zza implements ReflectedParcelable, C5618f {
    public static final Creator CREATOR = new C5644u();
    public final String f28578a;
    public final String f28579b;

    public DataItemAssetParcelable(C5618f c5618f) {
        this.f28578a = (String) am.m23733a(c5618f.mo5066b());
        this.f28579b = (String) am.m23733a(c5618f.mo5067c());
    }

    DataItemAssetParcelable(String str, String str2) {
        this.f28578a = str;
        this.f28579b = str2;
    }

    public final /* bridge */ /* synthetic */ Object mo5065a() {
        if (this != null) {
            return this;
        }
        throw null;
    }

    public final String mo5066b() {
        return this.f28578a;
    }

    public final String mo5067c() {
        return this.f28579b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.f28578a == null) {
            stringBuilder.append(",noid");
        } else {
            stringBuilder.append(",");
            stringBuilder.append(this.f28578a);
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.f28579b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28578a);
        C5130b.m23844a(parcel, 3, this.f28579b);
        C5130b.m23853b(parcel, a);
    }
}
