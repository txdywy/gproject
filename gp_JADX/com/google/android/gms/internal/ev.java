package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.au;

public final class ev extends ar {
    public ev(Context context, Looper looper, at atVar, au auVar) {
        super(context, looper, 116, atVar, auVar);
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof ey ? (ey) queryLocalInterface : new ez(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    protected final String cu_() {
        return "com.google.android.gms.gass.START";
    }

    public final ey mo4511f() {
        return (ey) super.m23032u();
    }
}
