package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ni {
    static {
        ni.class.getClassLoader();
    }

    private ni() {
    }

    public static Parcelable m25192a(Parcel parcel, Creator creator) {
        return parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
    }

    public static void m25193a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static void m25194a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void m25195a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean m25196a(Parcel parcel) {
        return parcel.readInt() == 1;
    }
}
