package com.google.android.gms.instantapps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.common.internal.C4951c;

public final class C5285o extends C4951c {
    public C5285o(Context context, Looper looper, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 121, new C5089p(context).m23651a(), c1632q, c1634r);
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        return queryLocalInterface instanceof ah ? (ah) queryLocalInterface : new ai(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    protected final String cu_() {
        return "com.google.android.gms.instantapps.START";
    }
}
