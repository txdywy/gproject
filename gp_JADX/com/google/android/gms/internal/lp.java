package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.bd;

public final class lp extends C4951c {
    public lp(Context context, Looper looper, bd bdVar, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 38, bdVar, c1632q, c1634r);
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
        return queryLocalInterface instanceof lh ? (lh) queryLocalInterface : new li(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService";
    }

    protected final String cu_() {
        return "com.google.android.gms.pseudonymous.service.START";
    }
}
