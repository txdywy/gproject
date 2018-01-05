package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.car.C1636d;
import com.google.android.gms.car.C4988b;
import com.google.android.gms.car.C4994i;
import com.google.android.gms.car.C4996l;
import com.google.android.gms.car.C4997m;
import com.google.android.gms.car.C4998n;
import com.google.android.gms.car.C4999o;
import com.google.android.gms.car.C5000p;
import com.google.android.gms.car.C5004t;
import com.google.android.gms.car.CarNotConnectedException;
import com.google.android.gms.car.aa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(21)
public final class bv {
    public final cc f26516a;
    public final Looper f26517b;
    public final Object f26518c = new Object();
    public bs f26519d;
    public ch f26520e;
    public cg f26521f;
    public cf f26522g;
    public C4998n f26523h;
    public C4994i f26524i;
    public final HashMap f26525j = new HashMap();
    public ce f26526k;
    public bu f26527l;
    public C4999o f26528m;
    public C5000p f26529n;
    public C4996l f26530o;
    public final AtomicBoolean f26531p = new AtomicBoolean(false);
    public final List f26532q = new ArrayList();
    public final bz f26533r = new bz(this);
    public by f26534s;
    public volatile C4988b f26535t;
    public bx f26536u;
    public C5004t f26537v;

    public bv(cc ccVar, Looper looper, C1636d c1636d) {
        this.f26516a = ccVar;
        this.f26517b = looper;
        if (c1636d != null) {
            synchronized (this.f26533r) {
                if (!this.f26532q.contains(c1636d)) {
                    this.f26532q.add(c1636d);
                    bz bzVar = this.f26533r;
                    bv bvVar = (bv) bzVar.f26541b.get();
                    if (bvVar == null) {
                        Log.i("CAR.CLIENT", "Null carClient in ICarConnectionListenerImpl.onCCLAL");
                    } else {
                        List list = null;
                        if (bvVar.m24235a()) {
                            if (bzVar.f26540a) {
                                list = Collections.singletonList(c1636d);
                            } else {
                                list = new ArrayList(bvVar.f26532q);
                            }
                            bzVar.f26540a = true;
                        }
                        if (list != null) {
                            try {
                                bvVar.m24232e();
                                bzVar.m24240a(bvVar, list);
                            } catch (CarNotConnectedException e) {
                                bzVar.f26540a = false;
                            }
                        }
                    }
                } else if (C4997m.m23159a("CAR.CLIENT", 3)) {
                    String valueOf = String.valueOf(c1636d);
                    Log.d("CAR.CLIENT", new StringBuilder(String.valueOf(valueOf).length() + 53).append("registerCarConnectionListener(): ").append(valueOf).append(" already registered.").toString());
                }
            }
        }
    }

    public final void m24233a(RemoteException remoteException) {
        if (C4997m.m23159a("CAR.CLIENT", 4)) {
            String str = "CAR.CLIENT";
            String str2 = "Remote exception from car service:";
            String valueOf = String.valueOf(remoteException.getMessage());
            Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        if (!this.f26531p.getAndSet(true)) {
            this.f26533r.mo4707b();
            aa.m23137a(this.f26517b, new bw(this));
        } else if (C4997m.m23159a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "Already handling a remote exception, ignoring");
        }
    }

    public final synchronized void m24234a(C5004t c5004t) {
        if (this.f26536u == null) {
            this.f26536u = new bx(this);
            try {
                this.f26537v = c5004t;
                this.f26537v.asBinder().linkToDeath(this.f26536u, 0);
            } catch (RemoteException e) {
                Log.e("CAR.CLIENT", "Unable to link death recipient to ICar.");
                this.f26536u = null;
                this.f26537v = null;
            }
        }
    }

    public final boolean m24235a() {
        boolean z = false;
        if (this.f26516a.m23140j()) {
            try {
                z = this.f26516a.mo4511f().mo4518a();
            } catch (RemoteException e) {
                m24233a(e);
            }
        }
        return z;
    }

    public final synchronized void m24238d() {
        if (!(this.f26536u == null || this.f26537v == null)) {
            try {
                this.f26537v.asBinder().unlinkToDeath(this.f26536u, 0);
            } catch (NoSuchElementException e) {
            }
            this.f26536u = null;
            this.f26537v = null;
        }
    }

    private final int m24232e() {
        Throwable e;
        IllegalStateException illegalStateException;
        try {
            return this.f26516a.mo4511f().mo4519b();
        } catch (RemoteException e2) {
            e = e2;
            if (e instanceof RemoteException) {
                m24233a((RemoteException) e);
                throw new CarNotConnectedException();
            } else if (e instanceof IllegalStateException) {
                throw new RuntimeException("Unexpected exception", e);
            } else {
                illegalStateException = (IllegalStateException) e;
                if ("CarNotConnected".equals(illegalStateException.getMessage())) {
                    throw illegalStateException;
                }
                throw new CarNotConnectedException();
            }
        } catch (IllegalStateException e3) {
            e = e3;
            if (e instanceof RemoteException) {
                m24233a((RemoteException) e);
                throw new CarNotConnectedException();
            } else if (e instanceof IllegalStateException) {
                throw new RuntimeException("Unexpected exception", e);
            } else {
                illegalStateException = (IllegalStateException) e;
                if ("CarNotConnected".equals(illegalStateException.getMessage())) {
                    throw illegalStateException;
                }
                throw new CarNotConnectedException();
            }
        }
    }

    public final void m24236b() {
        synchronized (this.f26518c) {
            if (this.f26530o != null) {
                throw new NoSuchMethodError();
            }
        }
    }

    public final void m24237c() {
        synchronized (this.f26518c) {
            if (this.f26519d != null) {
                throw new NoSuchMethodError();
            } else if (this.f26520e != null) {
                throw new NoSuchMethodError();
            } else if (this.f26526k != null) {
                throw new NoSuchMethodError();
            } else if (this.f26527l != null) {
                throw new NoSuchMethodError();
            } else if (this.f26522g != null) {
                if (C4997m.m23159a("CAR.SENSOR", 3)) {
                    Log.d("CAR.SENSOR", "handleCarDisconnection");
                }
                throw new NoSuchMethodError();
            } else if (this.f26523h != null) {
                throw new NoSuchMethodError();
            } else if (this.f26524i != null) {
                throw new NoSuchMethodError();
            } else if (this.f26528m != null) {
                throw new NoSuchMethodError();
            } else if (this.f26521f != null) {
                throw new NoSuchMethodError();
            } else if (this.f26529n != null) {
                throw new NoSuchMethodError();
            } else {
                this.f26525j.clear();
            }
        }
    }
}
