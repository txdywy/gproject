package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ao implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ConnectionResult connectionResult = null;
        boolean z = false;
        int a = C5129a.m23814a(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    iBinder = C5129a.m23828i(parcel, readInt);
                    break;
                case 3:
                    connectionResult = (ConnectionResult) C5129a.m23816a(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 5:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzbv(i, iBinder, connectionResult, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbv[i];
    }
}
