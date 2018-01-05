package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5136j implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C5129a.m23816a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new ConnectionResult(i2, i, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
