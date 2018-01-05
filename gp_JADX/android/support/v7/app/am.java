package android.support.v7.app;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class am {
    public bq f2300a;
    public boolean f2301b;
    public BroadcastReceiver f2302c;
    public IntentFilter f2303d;
    public final /* synthetic */ ak f2304e;

    am(ak akVar, bq bqVar) {
        this.f2304e = akVar;
        this.f2300a = bqVar;
        this.f2301b = bqVar.m2534a();
    }

    final void m2459a() {
        if (this.f2302c != null) {
            this.f2304e.e.unregisterReceiver(this.f2302c);
            this.f2302c = null;
        }
    }
}
