package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class ar extends nh implements aq {
    public ar() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo5094a((DataHolder) ni.m25192a(parcel, DataHolder.CREATOR));
                break;
            case 2:
                mo5097a((zzfc) ni.m25192a(parcel, zzfc.CREATOR));
                break;
            case 3:
                mo5098a((zzfn) ni.m25192a(parcel, zzfn.CREATOR));
                break;
            case 4:
                mo5102b((zzfn) ni.m25192a(parcel, zzfn.CREATOR));
                break;
            case 5:
                mo5101a(parcel.createTypedArrayList(zzfn.CREATOR));
                break;
            case 6:
                mo5100a((zzt) ni.m25192a(parcel, zzt.CREATOR));
                break;
            case 7:
                mo5096a((zzaq) ni.m25192a(parcel, zzaq.CREATOR));
                break;
            case 8:
                mo5095a((zzai) ni.m25192a(parcel, zzai.CREATOR));
                break;
            case 9:
                mo5099a((zzl) ni.m25192a(parcel, zzl.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
