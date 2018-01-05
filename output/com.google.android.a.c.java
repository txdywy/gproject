package com.google.android.a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable$Creator;

public static class com.google.android.a.c
{

    static {
        com.google.android.a.c.getClassLoader();
    }

    c() {
    }

    public static Parcelable a(Parcel p0, Parcelable$Creator p1) {
        if (p0.readInt() == 0)
            v0 = 0;
        else
            v0 = (Parcelable)p1.createFromParcel(p0);
        return v0;
    }

    public static void a(Parcel p0, IInterface p1) {
        if (p1 == 0)
            p0.writeStrongBinder(0);
        else
            p0.writeStrongBinder(p1.asBinder());
    }

    public static void a(Parcel p0, Parcelable p1) {
        if (p1 == 0)
            p0.writeInt(0);
        else {
            p0.writeInt(1);
            p1.writeToParcel(p0, 0);
        }
    }

    public static void a(Parcel p0, boolean p1) {
        if (p1 != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeInt(v0);
    }

    public static boolean a(Parcel p0) {
        if (p0.readInt() != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public static void b(Parcel p0, Parcelable p1) {
        if (p1 == 0)
            p0.writeInt(0);
        else {
            p0.writeInt(1);
            p1.writeToParcel(p0, 1);
        }
    }

}
