package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.bd;

public final class C5225h extends C4951c {
    public C5225h(Context context, Looper looper, bd bdVar, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 63, bdVar, c1632q, c1634r);
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return queryLocalInterface instanceof C5228k ? (C5228k) queryLocalInterface : new C5229l(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    protected final String cu_() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }
}
