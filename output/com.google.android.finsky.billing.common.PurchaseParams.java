package com.google.android.finsky.billing.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.v;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.ez;

public class PurchaseParams implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final com.google.android.finsky.cv.a.ax a;
    public final String b;
    public final Document c;
    public final int d;
    public final String e;
    public final com.google.android.finsky.dfemodel.v f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;
    public final int l;
    public final String m;
    public final com.google.wireless.android.finsky.dfe.nano.ez n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final boolean s;
    public final int t;
    public final byte[] u;
    public boolean v;

    static {
        PurchaseParams.CREATOR = new com.google.android.finsky.billing.common.n();
    }

    PurchaseParams(Parcel p0) {
        v1 = 1;
        this.a = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(p0);
        this.b = p0.readString();
        this.c = (Document)p0.readParcelable(Document.getClassLoader());
        this.d = p0.readInt();
        this.e = p0.readString();
        if (p0.readByte() == 1)
            this.f = com.google.android.finsky.dfemodel.v.valueOf(p0.readString());
        else
            this.f = 0;
        this.g = p0.readInt();
        this.h = p0.readString();
        this.i = p0.readString();
        this.m = p0.readString();
        this.n = (com.google.wireless.android.finsky.dfe.nano.ez)ParcelableProto.a(p0);
        this.k = p0.readString();
        this.l = p0.readInt();
        this.j = p0.readInt();
        if (p0.readByte() == 1)
            v0 = 1;
        else
            v0 = 0;
        this.o = v0;
        if (p0.readByte() == 1)
            v0 = 1;
        else
            v0 = 0;
        this.s = v0;
        this.t = p0.readInt();
        v0 = p0.readInt();
        if (v0 > 0) {
            this.u = new byte[v0];
            p0.readByteArray(this.u);
        }
        else
            this.u = 0;
        if (p0.readByte() == 1)
            v0 = 1;
        else
            v0 = 0;
        this.v = v0;
        if (p0.readByte() == 1)
            v0 = 1;
        else
            v0 = 0;
        this.p = v0;
        if (p0.readByte() != 1)
            v1 = 0;
        this.q = v1;
        this.r = p0.readString();
    }

    PurchaseParams(com.google.android.finsky.billing.common.o p0) {
        this.a = p0.a;
        if (this.a == 0)
            throw new IllegalArgumentException("docid cannot be null");
        this.b = p0.b;
        if (this.b == 0)
            throw new IllegalArgumentException("docidStr cannot be null");
        this.c = p0.c;
        this.d = p0.d;
        this.e = p0.e;
        this.f = p0.f;
        this.g = p0.g;
        this.h = p0.h;
        this.i = p0.i;
        this.j = p0.n;
        this.m = p0.j;
        this.n = p0.k;
        this.k = p0.l;
        this.l = p0.m;
        this.o = p0.o;
        this.s = p0.p;
        this.t = p0.q;
        this.u = p0.r;
        this.v = p0.s;
        this.p = p0.t;
        this.q = p0.u;
        this.r = p0.v;
    }

    public static com.google.android.finsky.billing.common.o b() {
        return new com.google.android.finsky.billing.common.o();
    }

    public final boolean a() {
        if (this.d != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        v1 = 1;
        p0.writeParcelable(ParcelableProto.a(this.a), p1);
        p0.writeString(this.b);
        p0.writeParcelable(this.c, p1);
        p0.writeInt(this.d);
        p0.writeString(this.e);
        if (this.f == 0)
            p0.writeByte(0);
        else {
            p0.writeByte(1);
            p0.writeString(this.f.name());
        }
        p0.writeInt(this.g);
        p0.writeString(this.h);
        p0.writeString(this.i);
        p0.writeString(this.m);
        p0.writeParcelable(ParcelableProto.a(this.n), p1);
        p0.writeString(this.k);
        p0.writeInt(this.l);
        p0.writeInt(this.j);
        if (this.o != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeByte(v0);
        if (this.s != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeByte(v0);
        p0.writeInt(this.t);
        if (this.u == 0 || this.u.length == 0)
            p0.writeInt(0);
        else {
            p0.writeInt(this.u.length);
            p0.writeByteArray(this.u);
        }
        if (this.v != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeByte(v0);
        if (this.p != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeByte(v0);
        if (this.q == 0)
            v1 = 0;
        p0.writeByte(v1);
        p0.writeString(this.r);
    }

}
