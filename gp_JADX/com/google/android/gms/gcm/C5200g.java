package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ng;

public final class C5200g extends ng implements C5199f {
    C5200g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    public final void mo4639a(int i) {
        Parcel cw_ = cw_();
        cw_.writeInt(i);
        m23095b(2, cw_);
    }
}
