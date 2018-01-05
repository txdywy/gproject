package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.bd;

public final class fh extends C4951c {
    public fh(Context context, Looper looper, bd bdVar, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 50, bdVar, c1632q, c1634r);
    }

    public final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
        return queryLocalInterface instanceof ff ? (ff) queryLocalInterface : new fg(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService";
    }

    protected final String cu_() {
        return "com.google.android.gms.herrevad.services.LightweightNetworkQualityAndroidService.START";
    }
}
