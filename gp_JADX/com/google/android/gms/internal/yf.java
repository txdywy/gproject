package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;

public final class yf extends ng implements ye {
    yf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final zf mo4951a(C5161a c5161a) {
        zf zfVar;
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        Parcel a = m23094a(8, cw_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            zfVar = queryLocalInterface instanceof zf ? (zf) queryLocalInterface : new zg(readStrongBinder);
        }
        a.recycle();
        return zfVar;
    }
}
