package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;

public final class ts extends ng implements tr {
    ts(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void mo4880a() {
        m23095b(3, cw_());
    }

    public final void mo4881a(int i) {
        Parcel cw_ = cw_();
        cw_.writeInt(i);
        m23095b(6, cw_);
    }

    public final void mo4882a(C5161a c5161a, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_.writeString(str);
        cw_.writeString(null);
        m23095b(8, cw_);
    }

    public final void mo4883a(byte[] bArr) {
        Parcel cw_ = cw_();
        cw_.writeByteArray(bArr);
        m23095b(5, cw_);
    }

    public final void mo4884a(int[] iArr) {
        Parcel cw_ = cw_();
        cw_.writeIntArray(iArr);
        m23095b(4, cw_);
    }

    public final void mo4885b(int i) {
        Parcel cw_ = cw_();
        cw_.writeInt(i);
        m23095b(7, cw_);
    }
}
