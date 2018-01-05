package com.google.android.gms.car;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.cc;

public final class ab extends C4951c implements cc {
    public final bv f25487a;
    public final int f25488b;

    public ab(Context context, Looper looper, bd bdVar, C1636d c1636d, int i, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 13, bdVar, c1632q, c1634r);
        this.f25487a = new bv(this, looper, c1636d);
        this.f25488b = i;
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICar");
        return queryLocalInterface instanceof C5004t ? (C5004t) queryLocalInterface : new C5005u(iBinder);
    }

    public final void mo4507a(int i) {
        super.mo4507a(i);
        if (C4997m.m23159a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "onConnectionSuspended");
        }
    }

    public final void mo4509a(ax axVar) {
        if (C4997m.m23159a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "connect");
        }
        super.mo4509a(axVar);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.car.ICar";
    }

    protected final String cu_() {
        return "com.google.android.gms.car.service.START";
    }

    public final void mo4510e() {
        C5004t c5004t = null;
        if (C4997m.m23159a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "disconnect");
        }
        bv bvVar = this.f25487a;
        if (C4997m.m23159a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "tearDown");
        }
        bvVar.m24238d();
        bvVar.m24237c();
        bvVar.m24236b();
        try {
            c5004t = bvVar.f26516a.mo4511f();
        } catch (IllegalStateException e) {
        } catch (RemoteException e2) {
        }
        if (c5004t != null) {
            try {
                c5004t.mo4520b(bvVar.f26533r);
                bvVar.f26533r.f26540a = false;
            } catch (RemoteException e3) {
            }
            if (bvVar.f26534s != null) {
                try {
                    c5004t.mo4516a(bvVar.f26534s);
                    bvVar.f26535t = null;
                    bvVar.f26534s = null;
                } catch (RemoteException e4) {
                }
            }
        }
        super.mo4510e();
    }

    public final C5004t mo4511f() {
        return (C5004t) m23032u();
    }

    public final void mo4512g() {
        if (m23021j()) {
            mo4510e();
        }
    }

    protected final int mo4513h() {
        return this.f25488b;
    }

    protected final Bundle mo4514i() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "car-1-0");
        return bundle;
    }

    public final /* synthetic */ void mo4508a(IInterface iInterface) {
        C5004t c5004t = (C5004t) iInterface;
        super.mo4508a((IInterface) c5004t);
        if (C4997m.m23159a("CAR.CLIENT", 2)) {
            Log.v("CAR.CLIENT", "onConnectedLocked");
        }
        bv bvVar = this.f25487a;
        if (C4997m.m23159a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "onICarAvailable");
        }
        try {
            c5004t.mo4517a(bvVar.f26533r);
            bvVar.m24234a(c5004t);
        } catch (RemoteException e) {
            bvVar.m24233a(e);
        }
    }
}
