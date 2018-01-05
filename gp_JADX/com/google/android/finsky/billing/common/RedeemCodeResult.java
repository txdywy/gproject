package com.google.android.finsky.billing.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.utils.ParcelableProto;

public class RedeemCodeResult implements Parcelable {
    public static final Creator CREATOR = new C1800p();
    public final String f9307a;
    public final byte[] f9308b;
    public final boolean f9309c;
    public final Bundle f9310d;
    public final eu f9311e;
    public final String f9312f;

    public RedeemCodeResult(String str, byte[] bArr, boolean z, Bundle bundle, eu euVar, String str2) {
        this.f9307a = str;
        this.f9308b = bArr;
        this.f9309c = z;
        this.f9310d = bundle;
        this.f9311e = euVar;
        this.f9312f = str2;
    }

    public RedeemCodeResult(Parcel parcel) {
        boolean z = true;
        this.f9307a = parcel.readString();
        byte readByte = parcel.readByte();
        if (readByte == (byte) -1) {
            this.f9308b = null;
        } else {
            this.f9308b = new byte[readByte];
            parcel.readByteArray(this.f9308b);
        }
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.f9309c = z;
        this.f9310d = parcel.readBundle();
        this.f9311e = (eu) ParcelableProto.m21674a(parcel);
        this.f9312f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f9307a);
        if (this.f9308b == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(this.f9308b.length);
            parcel.writeByteArray(this.f9308b);
        }
        if (this.f9309c) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        parcel.writeBundle(this.f9310d);
        parcel.writeParcelable(ParcelableProto.m21671a(this.f9311e), 0);
        parcel.writeString(this.f9312f);
    }

    public int describeContents() {
        return 0;
    }

    public final String m9749a() {
        return this.f9309c ? this.f9312f : null;
    }
}
