package com.google.android.finsky.billing.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.ez;

public class PurchaseParams implements Parcelable {
    public static final Creator CREATOR = new C1798n();
    public final ax f9285a;
    public final String f9286b;
    public final Document f9287c;
    public final int f9288d;
    public final String f9289e;
    public final C2731v f9290f;
    public final int f9291g;
    public final String f9292h;
    public final String f9293i;
    public final int f9294j;
    public final String f9295k;
    public final int f9296l;
    public final String f9297m;
    public final ez f9298n;
    public final boolean f9299o;
    public final boolean f9300p;
    public final boolean f9301q;
    public final String f9302r;
    public final boolean f9303s;
    public final int f9304t;
    public final byte[] f9305u;
    public boolean f9306v;

    PurchaseParams(C1799o c1799o) {
        this.f9285a = c1799o.f9330a;
        if (this.f9285a == null) {
            throw new IllegalArgumentException("docid cannot be null");
        }
        this.f9286b = c1799o.f9331b;
        if (this.f9286b == null) {
            throw new IllegalArgumentException("docidStr cannot be null");
        }
        this.f9287c = c1799o.f9332c;
        this.f9288d = c1799o.f9333d;
        this.f9289e = c1799o.f9334e;
        this.f9290f = c1799o.f9335f;
        this.f9291g = c1799o.f9336g;
        this.f9292h = c1799o.f9337h;
        this.f9293i = c1799o.f9338i;
        this.f9294j = c1799o.f9343n;
        this.f9297m = c1799o.f9339j;
        this.f9298n = c1799o.f9340k;
        this.f9295k = c1799o.f9341l;
        this.f9296l = c1799o.f9342m;
        this.f9299o = c1799o.f9344o;
        this.f9303s = c1799o.f9345p;
        this.f9304t = c1799o.f9346q;
        this.f9305u = c1799o.f9347r;
        this.f9306v = c1799o.f9348s;
        this.f9300p = c1799o.f9349t;
        this.f9301q = c1799o.f9350u;
        this.f9302r = c1799o.f9351v;
    }

    PurchaseParams(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f9285a = (ax) ParcelableProto.m21674a(parcel);
        this.f9286b = parcel.readString();
        this.f9287c = (Document) parcel.readParcelable(Document.class.getClassLoader());
        this.f9288d = parcel.readInt();
        this.f9289e = parcel.readString();
        if (parcel.readByte() == (byte) 1) {
            this.f9290f = C2731v.valueOf(parcel.readString());
        } else {
            this.f9290f = null;
        }
        this.f9291g = parcel.readInt();
        this.f9292h = parcel.readString();
        this.f9293i = parcel.readString();
        this.f9297m = parcel.readString();
        this.f9298n = (ez) ParcelableProto.m21674a(parcel);
        this.f9295k = parcel.readString();
        this.f9296l = parcel.readInt();
        this.f9294j = parcel.readInt();
        this.f9299o = parcel.readByte() == (byte) 1;
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.f9303s = z;
        this.f9304t = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f9305u = new byte[readInt];
            parcel.readByteArray(this.f9305u);
        } else {
            this.f9305u = null;
        }
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.f9306v = z;
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.f9300p = z;
        if (parcel.readByte() != (byte) 1) {
            z2 = false;
        }
        this.f9301q = z2;
        this.f9302r = parcel.readString();
    }

    public final boolean m9748a() {
        return this.f9288d != 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        byte b;
        byte b2 = (byte) 1;
        parcel.writeParcelable(ParcelableProto.m21671a(this.f9285a), i);
        parcel.writeString(this.f9286b);
        parcel.writeParcelable(this.f9287c, i);
        parcel.writeInt(this.f9288d);
        parcel.writeString(this.f9289e);
        if (this.f9290f == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f9290f.name());
        }
        parcel.writeInt(this.f9291g);
        parcel.writeString(this.f9292h);
        parcel.writeString(this.f9293i);
        parcel.writeString(this.f9297m);
        parcel.writeParcelable(ParcelableProto.m21671a(this.f9298n), i);
        parcel.writeString(this.f9295k);
        parcel.writeInt(this.f9296l);
        parcel.writeInt(this.f9294j);
        if (this.f9299o) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (this.f9303s) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        parcel.writeInt(this.f9304t);
        if (this.f9305u == null || this.f9305u.length == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(this.f9305u.length);
            parcel.writeByteArray(this.f9305u);
        }
        if (this.f9306v) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (this.f9300p) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (!this.f9301q) {
            b2 = (byte) 0;
        }
        parcel.writeByte(b2);
        parcel.writeString(this.f9302r);
    }

    public static C1799o m9747b() {
        return new C1799o();
    }
}
