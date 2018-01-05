package android.support.p010b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class C0028o extends Binder implements C0027n {
    public C0028o() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                mo9a(readInt);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                mo8a();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                mo10b();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                mo11c();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Uri.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                mo12d();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
