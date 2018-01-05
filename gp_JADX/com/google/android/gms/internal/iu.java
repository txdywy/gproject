package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.p282a.C5051b;

public final class iu implements ServiceConnection, at, au {
    public volatile boolean f27025a;
    public volatile hb f27026b;
    public final /* synthetic */ il f27027c;

    protected iu(il ilVar) {
        this.f27027c = ilVar;
    }

    public final void mo4619a() {
        am.m23741b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                gu guVar = (gu) this.f27026b.m23032u();
                this.f27026b = null;
                this.f27027c.mo4741o().m24733a(new ix(this, guVar));
            } catch (DeadObjectException e) {
                this.f27026b = null;
                this.f27025a = false;
            } catch (IllegalStateException e2) {
                this.f27026b = null;
                this.f27025a = false;
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gu guVar;
        am.m23741b("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f27025a = false;
                this.f27027c.mo4742p().f26845d.m24652a("Service connected with null binder");
                return;
            }
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder == null) {
                        guVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        guVar = queryLocalInterface instanceof gu ? (gu) queryLocalInterface : new gw(iBinder);
                    }
                    try {
                        this.f27027c.mo4742p().f26851j.m24652a("Bound to IMeasurementService interface");
                    } catch (RemoteException e) {
                        this.f27027c.mo4742p().f26845d.m24652a("Service connect failed to get IMeasurementService");
                        if (guVar != null) {
                            this.f27027c.mo4741o().m24733a(new iv(this, guVar));
                        } else {
                            this.f27025a = false;
                            try {
                                C5051b.m23267a();
                                this.f27027c.mo4736j().unbindService(this.f27027c.f26999a);
                            } catch (IllegalArgumentException e2) {
                            }
                        }
                    }
                    if (guVar != null) {
                        this.f27025a = false;
                        C5051b.m23267a();
                        this.f27027c.mo4736j().unbindService(this.f27027c.f26999a);
                    } else {
                        this.f27027c.mo4741o().m24733a(new iv(this, guVar));
                    }
                }
                this.f27027c.mo4742p().f26845d.m24653a("Got binder with a wrong descriptor", interfaceDescriptor);
                guVar = null;
                if (guVar != null) {
                    this.f27027c.mo4741o().m24733a(new iv(this, guVar));
                } else {
                    this.f27025a = false;
                    C5051b.m23267a();
                    this.f27027c.mo4736j().unbindService(this.f27027c.f26999a);
                }
            } catch (RemoteException e3) {
                guVar = null;
                this.f27027c.mo4742p().f26845d.m24652a("Service connect failed to get IMeasurementService");
                if (guVar != null) {
                    this.f27025a = false;
                    C5051b.m23267a();
                    this.f27027c.mo4736j().unbindService(this.f27027c.f26999a);
                } else {
                    this.f27027c.mo4741o().m24733a(new iv(this, guVar));
                }
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        am.m23741b("MeasurementServiceConnection.onServiceDisconnected");
        this.f27027c.mo4742p().f26850i.m24652a("Service disconnected");
        this.f27027c.mo4741o().m24733a(new iw(this, componentName));
    }

    public final void mo4620a(int i) {
        am.m23741b("MeasurementServiceConnection.onConnectionSuspended");
        this.f27027c.mo4742p().f26850i.m24652a("Service connection suspended");
        this.f27027c.mo4741o().m24733a(new iy(this));
    }

    public final void mo4621a(ConnectionResult connectionResult) {
        hc hcVar = null;
        am.m23741b("MeasurementServiceConnection.onConnectionFailed");
        hv hvVar = this.f27027c.p;
        if (hvVar.f26930e != null && hvVar.f26930e.m24431w()) {
            hcVar = hvVar.f26930e;
        }
        if (hcVar != null) {
            hcVar.f26847f.m24653a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f27025a = false;
            this.f27026b = null;
        }
        this.f27027c.mo4741o().m24733a(new iz(this));
    }
}
