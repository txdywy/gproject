package com.google.android.gms.instantapps.internal;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class ag extends nh implements af {
    public ag() {
        attachInterface(this, "com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                mo4681a((Status) ni.m25192a(parcel, Status.CREATOR), (InstantAppPreLaunchInfo) ni.m25192a(parcel, InstantAppPreLaunchInfo.CREATOR));
                break;
            case 9:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, Permissions.CREATOR);
                mo4680a();
                break;
            case 10:
                parcel.readInt();
                mo4683b();
                break;
            case 12:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.readInt();
                mo4684c();
                break;
            case 13:
                mo4682a((Status) ni.m25192a(parcel, Status.CREATOR), (OptInInfo) ni.m25192a(parcel, OptInInfo.CREATOR));
                break;
            case 18:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, PackageInfo.CREATOR);
                mo4685d();
                break;
            case 19:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, LaunchData.CREATOR);
                mo4686e();
                break;
            case 20:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.createTypedArrayList(VisitedApplication.CREATOR);
                mo4687f();
                break;
            case 21:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, ParcelFileDescriptor.CREATOR);
                mo4688g();
                break;
            default:
                return false;
        }
        return true;
    }
}
