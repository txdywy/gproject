package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5162b;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class C5180o extends ng implements C5179n {
    C5180o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int mo4634a(C5161a c5161a, String str, boolean z) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_.writeString(str);
        ni.m25195a(cw_, z);
        cw_ = m23094a(3, cw_);
        int readInt = cw_.readInt();
        cw_.recycle();
        return readInt;
    }

    public final C5161a mo4635a(C5161a c5161a, String str, int i) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_.writeString(str);
        cw_.writeInt(i);
        cw_ = m23094a(2, cw_);
        C5161a a = C5162b.m23905a(cw_.readStrongBinder());
        cw_.recycle();
        return a;
    }
}
