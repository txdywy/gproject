package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;

public abstract class lv extends nh implements lu {
    public lv() {
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo4801a((Status) ni.m25192a(parcel, Status.CREATOR), (zza) ni.m25192a(parcel, zza.CREATOR));
                break;
            case 2:
                mo4803a(parcel.readString());
                break;
            case 3:
                mo4800a((Status) ni.m25192a(parcel, Status.CREATOR), (SafeBrowsingData) ni.m25192a(parcel, SafeBrowsingData.CREATOR));
                break;
            case 4:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25196a(parcel);
                mo4798a();
                break;
            case 6:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, zzf.CREATOR);
                mo4805c();
                break;
            case 7:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25196a(parcel);
                mo4806d();
                break;
            case 8:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, zzd.CREATOR);
                mo4804b();
                break;
            case 10:
                mo4802a((Status) ni.m25192a(parcel, Status.CREATOR), ni.m25196a(parcel));
                break;
            case 11:
                mo4799a((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 12:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25196a(parcel);
                mo4807e();
                break;
            case 13:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.readLong();
                mo4808f();
                break;
            default:
                return false;
        }
        return true;
    }
}
