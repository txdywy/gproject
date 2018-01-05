package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class ap extends nh implements ao {
    public ap() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                ni.m25192a(parcel, zzdz.CREATOR);
                mo5068a();
                break;
            case 3:
                mo5072a((zzfs) ni.m25192a(parcel, zzfs.CREATOR));
                break;
            case 4:
                mo5071a((zzef) ni.m25192a(parcel, zzef.CREATOR));
                break;
            case 5:
                mo5069a((DataHolder) ni.m25192a(parcel, DataHolder.CREATOR));
                break;
            case 6:
                mo5070a((zzdj) ni.m25192a(parcel, zzdj.CREATOR));
                break;
            case 7:
                mo5073a((zzfy) ni.m25192a(parcel, zzfy.CREATOR));
                break;
            case 8:
                ni.m25192a(parcel, zzeh.CREATOR);
                mo5078f();
                break;
            case 9:
                ni.m25192a(parcel, zzej.CREATOR);
                mo5079g();
                break;
            case 10:
                ni.m25192a(parcel, zzed.CREATOR);
                mo5080h();
                break;
            case 11:
                ni.m25192a(parcel, Status.CREATOR);
                mo5088p();
                break;
            case 12:
                ni.m25192a(parcel, StorageInfoResponse.CREATOR);
                mo5089q();
                break;
            case 13:
                ni.m25192a(parcel, zzeb.CREATOR);
                mo5074b();
                break;
            case 14:
                ni.m25192a(parcel, zzfp.CREATOR);
                mo5081i();
                break;
            case 15:
                ni.m25192a(parcel, zzbn.CREATOR);
                mo5082j();
                break;
            case 16:
                ni.m25192a(parcel, zzbn.CREATOR);
                mo5083k();
                break;
            case 17:
                ni.m25192a(parcel, zzdp.CREATOR);
                mo5084l();
                break;
            case 18:
                ni.m25192a(parcel, zzdr.CREATOR);
                mo5085m();
                break;
            case 19:
                ni.m25192a(parcel, zzbh.CREATOR);
                mo5086n();
                break;
            case 20:
                ni.m25192a(parcel, zzbj.CREATOR);
                mo5087o();
                break;
            case 22:
                ni.m25192a(parcel, zzdn.CREATOR);
                mo5090r();
                break;
            case 23:
                ni.m25192a(parcel, zzdl.CREATOR);
                mo5091s();
                break;
            case 26:
                ni.m25192a(parcel, zzf.CREATOR);
                mo5092t();
                break;
            case 27:
                ni.m25192a(parcel, zzfw.CREATOR);
                mo5093u();
                break;
            case 28:
                ni.m25192a(parcel, zzdu.CREATOR);
                mo5075c();
                break;
            case 29:
                ni.m25192a(parcel, zzdy.CREATOR);
                mo5077e();
                break;
            case 30:
                ni.m25192a(parcel, zzdw.CREATOR);
                mo5076d();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
