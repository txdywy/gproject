package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class C5219b extends nh implements C5218a {
    public C5219b() {
        attachInterface(this, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo4642a((GoogleHelp) ni.m25192a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                ni.m25192a(parcel, TogglingData.CREATOR);
                mo4641a();
                parcel2.writeNoException();
                break;
            case 3:
                mo4643b();
                parcel2.writeNoException();
                break;
            case 4:
                mo4644c();
                parcel2.writeNoException();
                break;
            case 5:
                mo4645d();
                parcel2.writeNoException();
                break;
            case 6:
                mo4646e();
                parcel2.writeNoException();
                break;
            case 7:
                mo4647f();
                break;
            case 8:
                mo4648g();
                break;
            case 9:
                parcel.readInt();
                mo4649h();
                parcel2.writeNoException();
                break;
            case 10:
                mo4650i();
                parcel2.writeNoException();
                break;
            case 11:
                mo4651j();
                parcel2.writeNoException();
                break;
            case 12:
                mo4652k();
                parcel2.writeNoException();
                break;
            case 13:
                parcel.createByteArray();
                mo4653l();
                parcel2.writeNoException();
                break;
            case 14:
                mo4654m();
                parcel2.writeNoException();
                break;
            case 15:
                parcel.createByteArray();
                mo4655n();
                parcel2.writeNoException();
                break;
            case 16:
                mo4656o();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
