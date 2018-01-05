package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.au;

public final class hb extends ar {
    public hb(Context context, Looper looper, at atVar, au auVar) {
        super(context, looper, 93, atVar, auVar);
    }

    public final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof gu ? (gu) queryLocalInterface : new gw(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    protected final String cu_() {
        return "com.google.android.gms.measurement.START";
    }
}
