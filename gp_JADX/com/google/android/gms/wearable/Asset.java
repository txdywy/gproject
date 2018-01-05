package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class Asset extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C5658u();
    public byte[] f28554a;
    public String f28555b;
    public ParcelFileDescriptor f28556c;
    public Uri f28557d;

    Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f28554a = bArr;
        this.f28555b = str;
        this.f28556c = parcelFileDescriptor;
        this.f28557d = uri;
    }

    public static Asset m26607a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            return new Asset(null, null, parcelFileDescriptor, null);
        }
        throw new IllegalArgumentException("Asset fd cannot be null");
    }

    public static Asset m26608a(String str) {
        if (str != null) {
            return new Asset(null, str, null, null);
        }
        throw new IllegalArgumentException("Asset digest cannot be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f28554a, asset.f28554a) && ad.m23722a(this.f28555b, asset.f28555b) && ad.m23722a(this.f28556c, asset.f28556c) && ad.m23722a(this.f28557d, asset.f28557d);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f28554a, this.f28555b, this.f28556c, this.f28557d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asset[@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.f28555b == null) {
            stringBuilder.append(", nodigest");
        } else {
            stringBuilder.append(", ");
            stringBuilder.append(this.f28555b);
        }
        if (this.f28554a != null) {
            stringBuilder.append(", size=");
            stringBuilder.append(this.f28554a.length);
        }
        if (this.f28556c != null) {
            stringBuilder.append(", fd=");
            stringBuilder.append(this.f28556c);
        }
        if (this.f28557d != null) {
            stringBuilder.append(", uri=");
            stringBuilder.append(this.f28557d);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i | 1;
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23847a(parcel, 2, this.f28554a);
        C5130b.m23844a(parcel, 3, this.f28555b);
        C5130b.m23842a(parcel, 4, this.f28556c, i2);
        C5130b.m23842a(parcel, 5, this.f28557d, i2);
        C5130b.m23853b(parcel, a);
    }
}
