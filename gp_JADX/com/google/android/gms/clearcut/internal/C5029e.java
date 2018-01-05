package com.google.android.gms.clearcut.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.bd;

public final class C5029e extends C4951c {
    public C5029e(Context context, Looper looper, bd bdVar, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 40, bdVar, c1632q, c1634r);
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof C5031i ? (C5031i) queryLocalInterface : new C5032j(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    protected final String cu_() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
