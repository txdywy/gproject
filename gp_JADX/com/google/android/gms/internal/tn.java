package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5162b;

public abstract class tn extends nh implements tm {
    public tn() {
        attachInterface(this, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        String a;
        boolean a2;
        IInterface a3;
        switch (i) {
            case 1:
                a = mo4868a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                mo4872a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                a2 = mo4873a(C5162b.m23905a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ni.m25195a(parcel2, a2);
                return true;
            case 4:
                a2 = mo4876b(C5162b.m23905a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ni.m25195a(parcel2, a2);
                return true;
            case 5:
                mo4871a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                a3 = mo4867a(C5162b.m23905a(parcel.readStrongBinder()), C5162b.m23905a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ni.m25193a(parcel2, a3);
                return true;
            case 7:
                a = mo4877c(C5162b.m23905a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 8:
                a = mo4869a(C5162b.m23905a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 9:
                mo4878d(C5162b.m23905a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                a3 = mo4875b(C5162b.m23905a(parcel.readStrongBinder()), C5162b.m23905a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ni.m25193a(parcel2, a3);
                return true;
            case 11:
                a2 = mo4874a(parcel.readString(), ni.m25196a(parcel));
                parcel2.writeNoException();
                ni.m25195a(parcel2, a2);
                return true;
            case 12:
                a = mo4870a(C5162b.m23905a(parcel.readStrongBinder()), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            default:
                return false;
        }
    }
}
