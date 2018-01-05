package com.google.android.gms.peerdownloadmanager.comms.p294a;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.p289a.C5346a;
import com.google.android.gms.peerdownloadmanager.p289a.C5347b;
import com.google.common.f.a.a;
import com.google.common.f.a.bf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class C5398a {
    public final Context f28021a;
    public final BluetoothAdapter f28022b;
    public final C5346a f28023c;
    public bf f28024d;
    public final BroadcastReceiver f28025e = new C5399b(this);

    public C5398a(Context context, BluetoothAdapter bluetoothAdapter, boolean z, C5346a c5346a) {
        this.f28021a = context;
        this.f28022b = bluetoothAdapter;
        this.f28023c = c5346a;
        if (z) {
            C5347b.m26073b(c5346a.f27858a).putBoolean("bt_needs_cleanup", true).putBoolean("bt_on", bluetoothAdapter.isEnabled()).apply();
        }
    }

    public final boolean m26165a() {
        Throwable e;
        a aVar = null;
        try {
            if (this.f28022b.enable()) {
                boolean booleanValue = ((Boolean) this.f28024d.get(10, TimeUnit.SECONDS)).booleanValue();
                this.f28021a.unregisterReceiver(this.f28025e);
                this.f28024d.cancel(true);
                return booleanValue;
            }
            this.f28021a.unregisterReceiver(this.f28025e);
            this.f28024d.cancel(true);
            return false;
        } catch (InterruptedException e2) {
            e = e2;
            try {
                Log.e("BluetoothActivator", "Failed to activate bluetooth", e);
                return aVar;
            } finally {
                this.f28021a.unregisterReceiver(this.f28025e);
                aVar = this.f28024d;
                aVar.cancel(true);
            }
        } catch (ExecutionException e3) {
            e = e3;
            Log.e("BluetoothActivator", "Failed to activate bluetooth", e);
            return aVar;
        } catch (TimeoutException e4) {
            e = e4;
            Log.e("BluetoothActivator", "Failed to activate bluetooth", e);
            return aVar;
        }
    }

    public final boolean m26166b() {
        return this.f28023c.m26070a() || this.f28022b.disable();
    }
}
