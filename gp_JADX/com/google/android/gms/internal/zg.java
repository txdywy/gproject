package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C5161a;

public final class zg extends ng implements zf {
    zg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void mo4953a() {
        m23095b(2, cw_());
    }

    public final void mo4954a(int i, int i2, Intent intent) {
        Parcel cw_ = cw_();
        cw_.writeInt(i);
        cw_.writeInt(i2);
        ni.m25194a(cw_, (Parcelable) intent);
        m23095b(12, cw_);
    }

    public final void mo4955a(Bundle bundle) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) bundle);
        m23095b(1, cw_);
    }

    public final void mo4956a(C5161a c5161a) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        m23095b(13, cw_);
    }

    public final void mo4957b() {
        m23095b(3, cw_());
    }

    public final void mo4958b(Bundle bundle) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) bundle);
        cw_ = m23094a(6, cw_);
        if (cw_.readInt() != 0) {
            bundle.readFromParcel(cw_);
        }
        cw_.recycle();
    }

    public final void mo4959c() {
        m23095b(4, cw_());
    }

    public final void mo4960d() {
        m23095b(5, cw_());
    }

    public final void mo4961e() {
        m23095b(7, cw_());
    }

    public final void mo4962f() {
        m23095b(8, cw_());
    }

    public final void mo4963g() {
        m23095b(9, cw_());
    }

    public final boolean mo4964h() {
        Parcel a = m23094a(11, cw_());
        boolean a2 = ni.m25196a(a);
        a.recycle();
        return a2;
    }
}
