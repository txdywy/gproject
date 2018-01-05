package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class C5256c extends ng implements C5255b {
    C5256c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void mo4666a(Message message) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) message);
        m23096c(1, cw_);
    }
}
