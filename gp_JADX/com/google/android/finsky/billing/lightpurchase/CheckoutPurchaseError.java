package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.fa;
import com.google.wireless.android.finsky.dfe.nano.fc;

public class CheckoutPurchaseError implements Parcelable {
    public static final Creator CREATOR = new C1949h();
    public final int f9626a;
    public final String f9627b;
    public final String f9628c;
    public final String f9629d;
    public final String f9630e;
    public final fa f9631f;
    public final ip f9632g;

    public CheckoutPurchaseError() {
        this(null);
    }

    public CheckoutPurchaseError(String str) {
        this(0, str);
    }

    public CheckoutPurchaseError(String str, String str2) {
        this(str, str2, (byte) 0);
    }

    private CheckoutPurchaseError(String str, String str2, byte b) {
        this(0, str, str2, null, null, null, null);
    }

    public CheckoutPurchaseError(int i, String str) {
        this(i, null, str, null, null, null, null);
    }

    public CheckoutPurchaseError(int i, fc fcVar, String str) {
        this(i, fcVar.b, fcVar.c, fcVar.d, str, null, null);
    }

    public CheckoutPurchaseError(int i, String str, String str2, String str3, ip ipVar) {
        this(i, str, str2, str3, null, null, ipVar);
    }

    public CheckoutPurchaseError(int i, String str, String str2, String str3, String str4, fa faVar, ip ipVar) {
        this.f9626a = i;
        this.f9627b = str;
        this.f9628c = str2;
        this.f9629d = str3;
        this.f9630e = str4;
        this.f9631f = faVar;
        this.f9632g = ipVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9626a);
        parcel.writeString(this.f9627b);
        parcel.writeString(this.f9628c);
        parcel.writeString(this.f9629d);
        parcel.writeString(this.f9630e);
        parcel.writeParcelable(ParcelableProto.m21671a(this.f9631f), i);
        parcel.writeParcelable(ParcelableProto.m21671a(this.f9632g), i);
    }
}
