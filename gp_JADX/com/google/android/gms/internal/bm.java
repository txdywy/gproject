package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C4926b;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.bd;

public final class bm extends C4951c {
    public final C4926b f26502a;

    public bm(Context context, Looper looper, bd bdVar, C4926b c4926b, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 68, bdVar, c1632q, c1634r);
        this.f26502a = c4926b;
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof bn ? (bn) queryLocalInterface : new bo(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    protected final String cu_() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    protected final Bundle mo4514i() {
        if (this.f26502a == null) {
            return new Bundle();
        }
        C4926b c4926b = this.f26502a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", c4926b.f25345a);
        bundle.putParcelable("password_specification", c4926b.f25346b);
        return bundle;
    }
}
