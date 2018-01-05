package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.bd;

public final class bi extends C4951c {
    public bi(Context context, Looper looper, bd bdVar, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 74, bdVar, c1632q, c1634r);
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
        return queryLocalInterface instanceof bj ? (bj) queryLocalInterface : new bk(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService";
    }

    protected final String cu_() {
        return "com.google.android.gms.auth.api.accountactivationstate.START";
    }
}
