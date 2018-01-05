package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5103i implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int a = C5129a.m23814a(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    strArr = C5129a.m23833n(parcel, readInt);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) C5129a.m23820b(parcel, readInt, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    bundle = C5129a.m23829j(parcel, readInt);
                    break;
                case 1000:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.m23678a();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
