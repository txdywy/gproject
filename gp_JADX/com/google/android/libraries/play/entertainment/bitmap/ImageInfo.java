package com.google.android.libraries.play.entertainment.bitmap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.wireless.android.finsky.dfe.g.a.ad;

public class ImageInfo implements Parcelable {
    public static final Creator CREATOR = new C6046o();
    public final String f30112a;
    public final boolean f30113b;
    public final int f30114c;
    public final int f30115d;
    public final double f30116e;
    public final double f30117f;
    public final double f30118g;
    public final double f30119h;

    public static ImageInfo m27916a(String str, boolean z, int i, int i2, ad adVar) {
        return new ImageInfo(str, z, i, i2, adVar.b, adVar.d, adVar.c, adVar.e);
    }

    public static ImageInfo m27915a(String str, boolean z, int i, int i2) {
        return new ImageInfo(str, z, i, i2, -1.0d, -1.0d, -1.0d, -1.0d);
    }

    private ImageInfo(String str, boolean z, int i, int i2, double d, double d2, double d3, double d4) {
        this.f30112a = str;
        this.f30113b = z;
        this.f30114c = i;
        this.f30115d = i2;
        this.f30116e = C6045n.m27942a(d);
        this.f30117f = C6045n.m27942a(d2);
        this.f30118g = C6045n.m27942a(d3);
        this.f30119h = C6045n.m27942a(d4);
    }

    public final boolean m27917a() {
        return this.f30116e != -1.0d && this.f30118g != -1.0d && this.f30116e < this.f30117f && this.f30118g < this.f30117f;
    }

    ImageInfo(Parcel parcel) {
        this.f30112a = parcel.readString();
        this.f30113b = parcel.readInt() != 0;
        this.f30114c = parcel.readInt();
        this.f30115d = parcel.readInt();
        this.f30116e = parcel.readDouble();
        this.f30117f = parcel.readDouble();
        this.f30118g = parcel.readDouble();
        this.f30119h = parcel.readDouble();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30112a);
        parcel.writeInt(this.f30113b ? 1 : 0);
        parcel.writeInt(this.f30114c);
        parcel.writeInt(this.f30115d);
        parcel.writeDouble(this.f30116e);
        parcel.writeDouble(this.f30117f);
        parcel.writeDouble(this.f30118g);
        parcel.writeDouble(this.f30119h);
    }
}
