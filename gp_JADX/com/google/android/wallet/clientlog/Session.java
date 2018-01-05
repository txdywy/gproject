package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Session implements Parcelable {
    public static final Creator CREATOR = new C6545i();
    public final String f32619a;
    public final int f32620b;
    public boolean f32621c;
    public int f32622d;
    public int[] f32623e;
    public boolean f32624f;

    protected Session(String str, int i) {
        this.f32619a = str;
        this.f32620b = i;
    }

    protected Session(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f32619a = parcel.readString();
        this.f32620b = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f32621c = z;
        this.f32622d = parcel.readInt();
        this.f32623e = parcel.createIntArray();
        if (parcel.readInt() != 1) {
            z2 = false;
        }
        this.f32624f = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        parcel.writeString(this.f32619a);
        parcel.writeInt(this.f32620b);
        if (this.f32621c) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f32622d);
        parcel.writeIntArray(this.f32623e);
        if (!this.f32624f) {
            i3 = 0;
        }
        parcel.writeInt(i3);
    }
}
