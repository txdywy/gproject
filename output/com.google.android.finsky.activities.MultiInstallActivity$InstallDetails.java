package com.google.android.finsky.activities;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.f.d;

public class MultiInstallActivity$InstallDetails implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String[] b;
    public final Document c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        MultiInstallActivity$InstallDetails.CREATOR = new com.google.android.finsky.activities.ez();
    }

    MultiInstallActivity$InstallDetails(Parcel p0) {
        v1 = 1;
        if (p0.readByte() > 0)
            v0 = 1;
        else
            v0 = 0;
        this.e = v0;
        if (p0.readByte() > 0)
            v0 = 1;
        else
            v0 = 0;
        this.f = v0;
        if (p0.readByte() <= 0)
            v1 = 0;
        this.d = v1;
        this.a = p0.readString();
        this.c = (Document)Document.CREATOR.createFromParcel(p0);
        if (this.f != 0) {
            this.b = new String[p0.readInt()];
            p0.readStringArray(this.b);
        }
        else
            this.b = 0;
    }

    MultiInstallActivity$InstallDetails(Document p0, com.google.android.finsky.f.d p1, String p2) {
        this.d = p1.c;
        this.e = p1.a;
        this.f = p1.b;
        this.c = p0;
        this.a = p2;
        if (this.f != 0)
            this.b = p0.N().g;
        else
            this.b = 0;
    }

    public final boolean a() {
        if (this.e == 0 && this.f == 0 && this.d == 0)
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
        if (this.e != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeByte((byte)v0);
        if (this.f != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeByte((byte)v0);
        if (this.d == 0)
            v1 = 0;
        p0.writeByte((byte)v1);
        p0.writeString(this.a);
        this.c.writeToParcel(p0, p1);
        if (this.f != 0) {
            p0.writeInt(this.b.length);
            p0.writeStringArray(this.b);
        }
    }

}
