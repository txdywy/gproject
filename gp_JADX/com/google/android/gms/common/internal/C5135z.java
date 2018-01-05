package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class C5135z implements C5133x {
    public final IBinder f26061a;

    C5135z(IBinder iBinder) {
        this.f26061a = iBinder;
    }

    public final void mo4626a(C5113v c5113v, zzz com_google_android_gms_common_internal_zzz) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(c5113v.asBinder());
            obtain.writeInt(1);
            com_google_android_gms_common_internal_zzz.writeToParcel(obtain, 0);
            this.f26061a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f26061a;
    }
}
