package com.google.android.finsky.billing.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.finsky.cv.a.eu;
import com.google.android.finsky.utils.ParcelableProto;

public class RedeemCodeResult implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final boolean c;
    public final Bundle d;
    public final com.google.android.finsky.cv.a.eu e;
    public final String f;

    static {
        RedeemCodeResult.CREATOR = new com.google.android.finsky.billing.common.p();
    }

    RedeemCodeResult(Parcel p0) {
        v0 = 1;
        this.a = p0.readString();
        v1 = p0.readByte();
        if (v1 == -1)
            this.b = 0;
        else {
            this.b = new byte[v1];
            p0.readByteArray(this.b);
        }
        if (p0.readByte() != 1)
            v0 = 0;
        this.c = v0;
        this.d = p0.readBundle();
        this.e = (com.google.android.finsky.cv.a.eu)ParcelableProto.a(p0);
        this.f = p0.readString();
    }

    RedeemCodeResult(String p0, byte[] p1, boolean p2, Bundle p3, com.google.android.finsky.cv.a.eu p4, String p5) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
    }

    public final String a() {
        if (this.c != 0)
            v0 = this.f;
        else
            v0 = 0;
        return v0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        p0.writeString(this.a);
        if (this.b == 0)
            p0.writeInt(-1);
        else {
            p0.writeInt(this.b.length);
            p0.writeByteArray(this.b);
        }
        if (this.c != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeByte((byte)v0);
        p0.writeBundle(this.d);
        p0.writeParcelable(ParcelableProto.a(this.e), 0);
        p0.writeString(this.f);
    }

}
