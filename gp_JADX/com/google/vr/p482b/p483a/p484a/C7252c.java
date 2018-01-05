package com.google.vr.p482b.p483a.p484a;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.PersistableBundle;
import com.google.android.a.b;
import com.google.android.a.c;
import com.google.vr.p479a.p480a.C7247j;
import com.google.vr.p479a.p480a.C7249l;

public abstract class C7252c extends b implements C7251b {
    public C7252c() {
        attachInterface(this, "com.google.vr.libraries.payments.api.IActivityDelegate");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C7247j c7247j = null;
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 2:
                mo6326a();
                break;
            case 3:
                mo6328a(parcel.readInt(), parcel.readInt(), (Intent) c.a(parcel, Intent.CREATOR));
                break;
            case 4:
                mo6334b();
                break;
            case 5:
                mo6338c();
                break;
            case 6:
                C7247j c7247j2;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c7247j2 = null;
                } else {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.IObjectWrapper");
                    if (queryLocalInterface instanceof C7247j) {
                        c7247j2 = (C7247j) queryLocalInterface;
                    } else {
                        c7247j2 = new C7249l(readStrongBinder);
                    }
                }
                mo6332a(c7247j2);
                break;
            case 7:
                mo6329a((Bundle) c.a(parcel, Bundle.CREATOR));
                break;
            case 8:
                mo6330a((Bundle) c.a(parcel, Bundle.CREATOR), (PersistableBundle) c.a(parcel, PersistableBundle.CREATOR));
                break;
            case 9:
                mo6341d();
                break;
            case 10:
                mo6343e();
                break;
            case 11:
                mo6344f();
                break;
            case 12:
                mo6345g();
                break;
            case 13:
                mo6346h();
                break;
            case 14:
                mo6335b((Bundle) c.a(parcel, Bundle.CREATOR));
                break;
            case 15:
                mo6336b((Bundle) c.a(parcel, Bundle.CREATOR), (PersistableBundle) c.a(parcel, PersistableBundle.CREATOR));
                break;
            case 16:
                mo6347i();
                break;
            case 17:
                mo6348j();
                break;
            case 18:
                mo6339c((Bundle) c.a(parcel, Bundle.CREATOR));
                break;
            case 19:
                mo6340c((Bundle) c.a(parcel, Bundle.CREATOR), (PersistableBundle) c.a(parcel, PersistableBundle.CREATOR));
                break;
            case 20:
                mo6349k();
                break;
            case 21:
                mo6342d((Bundle) c.a(parcel, Bundle.CREATOR));
                break;
            case 22:
                Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.IObjectWrapper");
                    if (queryLocalInterface2 instanceof C7247j) {
                        c7247j = (C7247j) queryLocalInterface2;
                    } else {
                        c7247j = new C7249l(readStrongBinder);
                    }
                }
                mo6331a(bundle, c7247j);
                break;
            case 23:
                mo6350l();
                break;
            case 24:
                mo6351m();
                break;
            case 25:
                mo6327a(parcel.readInt());
                break;
            case 26:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.IObjectWrapper");
                    if (queryLocalInterface instanceof C7247j) {
                        c7247j = (C7247j) queryLocalInterface;
                    } else {
                        c7247j = new C7249l(readStrongBinder);
                    }
                }
                mo6337b(c7247j);
                break;
            case 27:
                mo6333a(c.a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
