package com.google.android.finsky.navigationmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationState implements Parcelable {
    public static final Creator CREATOR = new C3761f();
    public final int f18904a;
    public final int f18905b;
    public final String f18906c;
    public final String f18907d;
    public boolean f18908e;
    public boolean f18909f;
    public C3762g f18910g;
    public int f18911h;
    public boolean f18912i;

    public NavigationState(int i, String str, String str2, int i2) {
        this.f18904a = i;
        if (str == null) {
            str = Integer.toString((int) (Math.random() * 2.147483646E9d));
        }
        this.f18906c = str;
        this.f18907d = str2;
        this.f18905b = i2;
    }

    public String toString() {
        int i = this.f18904a;
        String str = this.f18906c;
        return new StringBuilder(String.valueOf(str).length() + 27).append("[type: ").append(i).append(", name: ").append(str).append("]").toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeInt(this.f18904a);
        parcel.writeString(this.f18906c);
        parcel.writeString(this.f18907d);
        parcel.writeInt(this.f18905b);
        parcel.writeByte((byte) (this.f18908e ? 1 : 0));
        if (!this.f18909f) {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        parcel.writeInt(this.f18911h);
        parcel.writeString(this.f18910g == null ? "" : this.f18910g.f18958b);
        parcel.writeString(this.f18910g == null ? "" : this.f18910g.f18957a);
    }
}
