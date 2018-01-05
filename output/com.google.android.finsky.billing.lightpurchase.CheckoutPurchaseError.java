package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.finsky.cv.a.ip;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.fa;
import com.google.wireless.android.finsky.dfe.nano.fc;

public class CheckoutPurchaseError implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final com.google.wireless.android.finsky.dfe.nano.fa f;
    public final com.google.android.finsky.cv.a.ip g;

    static {
        CheckoutPurchaseError.CREATOR = new com.google.android.finsky.billing.lightpurchase.h();
    }

    CheckoutPurchaseError() {
        CheckoutPurchaseError(0);
    }

    CheckoutPurchaseError(int p0, com.google.wireless.android.finsky.dfe.nano.fc p1, String p2) {
        CheckoutPurchaseError(p0, p1.b, p1.c, p1.d, p2, 0, 0);
    }

    CheckoutPurchaseError(int p0, String p1) {
        CheckoutPurchaseError(p0, 0, p1, 0, 0, 0, 0);
    }

    CheckoutPurchaseError(int p0, String p1, String p2, String p3, com.google.android.finsky.cv.a.ip p4) {
        CheckoutPurchaseError(p0, p1, p2, p3, 0, 0, p4);
    }

    CheckoutPurchaseError(int p0, String p1, String p2, String p3, String p4, com.google.wireless.android.finsky.dfe.nano.fa p5, com.google.android.finsky.cv.a.ip p6) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
    }

    CheckoutPurchaseError(String p0) {
        CheckoutPurchaseError(0, p0);
    }

    CheckoutPurchaseError(String p0, String p1) {
        CheckoutPurchaseError(p0, p1, 0);
    }

    CheckoutPurchaseError(String p0, String p1, byte p2) {
        CheckoutPurchaseError(0, p0, p1, 0, 0, 0, 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        p0.writeInt(this.a);
        p0.writeString(this.b);
        p0.writeString(this.c);
        p0.writeString(this.d);
        p0.writeString(this.e);
        p0.writeParcelable(ParcelableProto.a(this.f), p1);
        p0.writeParcelable(ParcelableProto.a(this.g), p1);
    }

}
