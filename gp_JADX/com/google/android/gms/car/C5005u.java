package com.google.android.gms.car;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class C5005u extends ng implements C5004t {
    C5005u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICar");
    }

    public final void mo4516a(C5006v c5006v) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5006v);
        m23095b(21, cw_);
    }

    public final void mo4517a(C5009y c5009y) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5009y);
        m23095b(5, cw_);
    }

    public final boolean mo4518a() {
        Parcel a = m23094a(3, cw_());
        boolean a2 = ni.m25196a(a);
        a.recycle();
        return a2;
    }

    public final int mo4519b() {
        Parcel a = m23094a(4, cw_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void mo4520b(C5009y c5009y) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5009y);
        m23095b(6, cw_);
    }
}
