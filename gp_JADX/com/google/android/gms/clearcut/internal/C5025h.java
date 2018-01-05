package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class C5025h extends nh implements C5024g {
    public C5025h() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo4523a((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 2:
                ni.m25192a(parcel, Status.CREATOR);
                mo4522a();
                break;
            case 3:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.readLong();
                mo4524b();
                break;
            case 4:
                ni.m25192a(parcel, Status.CREATOR);
                mo4525c();
                break;
            case 5:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.readLong();
                mo4526d();
                break;
            case 6:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.createTypedArray(LogEventParcelable.CREATOR);
                mo4527e();
                break;
            case 7:
                ni.m25192a(parcel, DataHolder.CREATOR);
                mo4528f();
                break;
            default:
                return false;
        }
        return true;
    }
}
