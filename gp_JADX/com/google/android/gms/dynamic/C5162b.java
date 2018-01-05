package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.nh;

public class C5162b extends nh implements C5161a {
    public C5162b() {
        attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static C5161a m23905a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof C5161a ? (C5161a) queryLocalInterface : new C5163c(iBinder);
    }
}
