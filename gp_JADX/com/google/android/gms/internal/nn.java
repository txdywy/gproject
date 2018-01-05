package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import com.google.android.gms.udc.UdcCacheResponse;

public abstract class nn extends nh implements nm {
    public nn() {
        attachInterface(this, "com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.createByteArray();
                mo4832a();
                break;
            case 2:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.createByteArray();
                mo4834b();
                break;
            case 3:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.createByteArray();
                mo4835c();
                break;
            case 4:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.createByteArray();
                mo4836d();
                break;
            case 5:
                ni.m25192a(parcel, Status.CREATOR);
                parcel.createTypedArrayList(SettingState.CREATOR);
                mo4837e();
                break;
            case 6:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, PendingIntent.CREATOR);
                mo4838f();
                break;
            case 7:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, SettingDisplayInfo.CREATOR);
                ni.m25192a(parcel, PendingIntent.CREATOR);
                mo4839g();
                break;
            case 8:
                mo4833a((Status) ni.m25192a(parcel, Status.CREATOR), (UdcCacheResponse) ni.m25192a(parcel, UdcCacheResponse.CREATOR));
                break;
            case 9:
                ni.m25192a(parcel, Status.CREATOR);
                mo4840h();
                break;
            case 10:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, DeviceDataUploadOptInFlags.CREATOR);
                mo4841i();
                break;
            case 11:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, DeviceDataUploadOptedInAccountsParcelable.CREATOR);
                mo4842j();
                break;
            default:
                return false;
        }
        return true;
    }
}
