package android.support.v7.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class an extends BroadcastReceiver {
    public final /* synthetic */ am f2305a;

    an(am amVar) {
        this.f2305a = amVar;
    }

    public final void onReceive(Context context, Intent intent) {
        am amVar = this.f2305a;
        boolean a = amVar.f2300a.m2534a();
        if (a != amVar.f2301b) {
            amVar.f2301b = a;
            amVar.f2304e.mo508l();
        }
    }
}
