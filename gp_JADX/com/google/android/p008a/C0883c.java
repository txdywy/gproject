package com.google.android.p008a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class C0883c {
    private C0883c() {
    }

    public static boolean m5517a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void m5516a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static Parcelable m5513a(Parcel parcel, Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void m5515a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void m5518b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    public static void m5514a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    static {
        C0883c.class.getClassLoader();
    }
}
