package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5162b;

public final class to extends ng implements tm {
    to(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    public final C5161a mo4867a(C5161a c5161a, C5161a c5161a2) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        ni.m25193a(cw_, (IInterface) c5161a2);
        cw_ = m23094a(6, cw_);
        C5161a a = C5162b.m23905a(cw_.readStrongBinder());
        cw_.recycle();
        return a;
    }

    public final String mo4868a() {
        Parcel a = m23094a(1, cw_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String mo4869a(C5161a c5161a, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_.writeString(str);
        cw_ = m23094a(8, cw_);
        String readString = cw_.readString();
        cw_.recycle();
        return readString;
    }

    public final String mo4870a(C5161a c5161a, byte[] bArr) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_.writeByteArray(bArr);
        cw_ = m23094a(12, cw_);
        String readString = cw_.readString();
        cw_.recycle();
        return readString;
    }

    public final void mo4871a(String str) {
        Parcel cw_ = cw_();
        cw_.writeString(str);
        m23095b(5, cw_);
    }

    public final void mo4872a(String str, String str2) {
        Parcel cw_ = cw_();
        cw_.writeString(str);
        cw_.writeString(str2);
        m23095b(2, cw_);
    }

    public final boolean mo4873a(C5161a c5161a) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_ = m23094a(3, cw_);
        boolean a = ni.m25196a(cw_);
        cw_.recycle();
        return a;
    }

    public final boolean mo4874a(String str, boolean z) {
        Parcel cw_ = cw_();
        cw_.writeString(str);
        ni.m25195a(cw_, z);
        cw_ = m23094a(11, cw_);
        boolean a = ni.m25196a(cw_);
        cw_.recycle();
        return a;
    }

    public final C5161a mo4875b(C5161a c5161a, C5161a c5161a2) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        ni.m25193a(cw_, (IInterface) c5161a2);
        cw_ = m23094a(10, cw_);
        C5161a a = C5162b.m23905a(cw_.readStrongBinder());
        cw_.recycle();
        return a;
    }

    public final boolean mo4876b(C5161a c5161a) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_ = m23094a(4, cw_);
        boolean a = ni.m25196a(cw_);
        cw_.recycle();
        return a;
    }

    public final String mo4877c(C5161a c5161a) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_ = m23094a(7, cw_);
        String readString = cw_.readString();
        cw_.recycle();
        return readString;
    }

    public final void mo4878d(C5161a c5161a) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        m23095b(9, cw_);
    }
}
