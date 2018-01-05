package com.google.android.finsky.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VoucherParams implements Parcelable {
    public static final Creator CREATOR = new C1302z();
    public final String f7419a;
    public final boolean f7420b;
    public final boolean f7421c;

    public VoucherParams(String str, boolean z, boolean z2) {
        this.f7419a = str;
        this.f7420b = z;
        this.f7421c = z2;
    }

    VoucherParams(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f7419a = parcel.readString();
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.f7420b = z;
        if (parcel.readByte() != (byte) 1) {
            z2 = false;
        }
        this.f7421c = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        parcel.writeString(this.f7419a);
        if (this.f7420b) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        if (!this.f7421c) {
            i3 = 0;
        }
        parcel.writeByte((byte) i3);
    }
}
