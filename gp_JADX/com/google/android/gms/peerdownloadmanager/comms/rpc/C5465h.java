package com.google.android.gms.peerdownloadmanager.comms.rpc;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5402d;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5403e;
import com.google.android.gms.peerdownloadmanager.p290b.C5350a;
import java.util.UUID;

public final class C5465h implements C5402d {
    public final BluetoothAdapter f28202a = BluetoothAdapter.getDefaultAdapter();
    public BluetoothServerSocket f28203b;
    public boolean f28204c = false;

    public final void mo5017c() {
        String b = C5350a.m26079a().mo4966b();
        UUID nameUUIDFromBytes = UUID.nameUUIDFromBytes(b.getBytes());
        String valueOf = String.valueOf(nameUUIDFromBytes);
        Log.d("CommsServerSocket", new StringBuilder((String.valueOf(b).length() + 49) + String.valueOf(valueOf).length()).append("listening on a bt socket using service ").append(b).append(" and uuid ").append(valueOf).toString());
        this.f28203b = this.f28202a.listenUsingInsecureRfcommWithServiceRecord(b, nameUUIDFromBytes);
    }

    public final boolean mo5015a() {
        return this.f28204c;
    }

    public final C5403e mo5016b() {
        return new C5466i(this.f28203b.accept());
    }

    public final void close() {
        if (this.f28203b != null && !this.f28204c) {
            this.f28203b.close();
            this.f28204c = true;
        }
    }

    public final String toString() {
        return this.f28202a.getAddress();
    }
}
