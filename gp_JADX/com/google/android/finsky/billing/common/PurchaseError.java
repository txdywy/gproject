package com.google.android.finsky.billing.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PurchaseError implements Parcelable {
    public static final Creator CREATOR = new C1795k();
    public final int f9281a;
    public final int f9282b;

    public PurchaseError(int i) {
        this(i, 0);
    }

    public PurchaseError(int i, int i2) {
        this.f9281a = i;
        this.f9282b = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9281a);
        parcel.writeInt(this.f9282b);
    }

    public String toString() {
        int i = this.f9281a;
        return "PurchaseError{type=" + i + " subtype=" + this.f9282b + "}";
    }
}
