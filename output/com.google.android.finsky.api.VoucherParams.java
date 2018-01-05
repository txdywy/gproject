package com.google.android.finsky.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class VoucherParams implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final boolean b;
    public final boolean c;

    static {
        VoucherParams.CREATOR = new com.google.android.finsky.api.z();
    }

    VoucherParams(Parcel p0) {
        v1 = 1;
        this.a = p0.readString();
        if (p0.readByte() == 1)
            v0 = 1;
        else
            v0 = 0;
        this.b = v0;
        if (p0.readByte() != 1)
            v1 = 0;
        this.c = v1;
    }

    VoucherParams(String p0, boolean p1, boolean p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        v1 = 1;
        p0.writeString(this.a);
        if (this.b != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeByte((byte)v0);
        if (this.c == 0)
            v1 = 0;
        p0.writeByte((byte)v1);
    }

}
