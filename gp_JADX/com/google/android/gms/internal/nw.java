package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.bd;

public final class nw extends C4951c {
    public nw(Context context, Looper looper, bd bdVar, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 35, bdVar, c1632q, c1634r);
        am.m23734a(bdVar.f26004a, (Object) "Must pass an account via UdcOptions or call GoogleApiClient.Builder.setAccount()");
    }

    public final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.udc.internal.IUdcService");
        return queryLocalInterface instanceof no ? (no) queryLocalInterface : new np(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.udc.internal.IUdcService";
    }

    protected final String cu_() {
        return "com.google.android.gms.udc.service.START";
    }

    public final boolean mo4844v() {
        return true;
    }
}
