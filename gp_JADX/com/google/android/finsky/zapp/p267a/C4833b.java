package com.google.android.finsky.zapp.p267a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C4833b extends C0022b implements C4832a {
    public C4833b() {
        attachInterface(this, "com.google.android.finsky.zapp.protocol.IDynamicModuleDownloader");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        Parcelable a;
        switch (i) {
            case 1:
                a = mo4406a(parcel.createTypedArrayList(Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 2:
                a = mo4407b((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 3:
                a = mo4405a((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 4:
                a = mo4408c((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 5:
                a = mo4404a(parcel.readLong());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 6:
                a = mo4409d((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            default:
                return false;
        }
        return true;
    }
}
