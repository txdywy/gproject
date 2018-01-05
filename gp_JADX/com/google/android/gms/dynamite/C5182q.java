package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5162b;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class C5182q extends ng implements C5181p {
    C5182q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final C5161a mo4636a(C5161a c5161a, String str, int i, C5161a c5161a2) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_.writeString(str);
        cw_.writeInt(i);
        ni.m25193a(cw_, (IInterface) c5161a2);
        cw_ = m23094a(2, cw_);
        C5161a a = C5162b.m23905a(cw_.readStrongBinder());
        cw_.recycle();
        return a;
    }
}
