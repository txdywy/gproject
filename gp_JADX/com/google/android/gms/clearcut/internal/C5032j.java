package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class C5032j extends ng implements C5031i {
    C5032j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void mo4529a(C5024g c5024g, LogEventParcelable logEventParcelable) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5024g);
        ni.m25194a(cw_, (Parcelable) logEventParcelable);
        m23096c(1, cw_);
    }
}
