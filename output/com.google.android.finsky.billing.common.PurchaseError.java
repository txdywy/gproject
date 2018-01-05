package com.google.android.finsky.billing.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class PurchaseError implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;

    static {
        PurchaseError.CREATOR = new com.google.android.finsky.billing.common.k();
    }

    PurchaseError(int p0) {
        PurchaseError(p0, 0);
    }

    PurchaseError(int p0, int p1) {
        this.a = p0;
        this.b = p1;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 51 + "PurchaseError{type=" + this.a + " subtype=" + this.b + "}";
    }

    public void writeToParcel(Parcel p0, int p1) {
        p0.writeInt(this.a);
        p0.writeInt(this.b);
    }

}
