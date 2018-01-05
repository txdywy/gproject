package com.google.android.gms.peerdownloadmanager.comms.rpc;

import android.bluetooth.BluetoothSocket;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.aa;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5400g;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5401c;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5403e;
import com.google.android.gms.peerdownloadmanager.p290b.C5350a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public final class C5466i implements C5403e {
    public final String f28205a;
    public BluetoothSocket f28206b;
    public final C5401c f28207c;

    public C5466i(C5401c c5401c) {
        this.f28207c = c5401c;
        this.f28205a = c5401c.f28027a.getAddress();
    }

    public C5466i(BluetoothSocket bluetoothSocket) {
        this.f28206b = bluetoothSocket;
        this.f28205a = bluetoothSocket.getRemoteDevice().getAddress();
        this.f28207c = new C5401c(bluetoothSocket.getRemoteDevice());
    }

    public final boolean mo5020c() {
        if (this.f28206b != null) {
            throw new IllegalStateException("open must not be called on server sockets");
        }
        this.f28206b = this.f28207c.f28027a.createInsecureRfcommSocketToServiceRecord(UUID.nameUUIDFromBytes(C5350a.m26079a().mo4966b().getBytes()));
        String valueOf;
        try {
            this.f28206b.connect();
            valueOf = String.valueOf(this.f28207c);
            Log.d("CommsBluetoothSocket", new StringBuilder(String.valueOf(valueOf).length() + 14).append("Connected to: ").append(valueOf).toString());
            return true;
        } catch (IOException e) {
            valueOf = String.valueOf(this.f28207c);
            Log.d("CommsBluetoothSocket", new StringBuilder(String.valueOf(valueOf).length() + 28).append("Couldn't connect to device: ").append(valueOf).toString());
            return false;
        }
    }

    public final InputStream mo5018a() {
        return this.f28206b.getInputStream();
    }

    public final OutputStream mo5019b() {
        return this.f28206b.getOutputStream();
    }

    public final void close() {
        aa.m26135a(this.f28206b);
    }

    public final void mo5022e() {
        aa.m26135a(this.f28206b);
    }

    public final C5400g mo5021d() {
        return this.f28207c;
    }

    public final String toString() {
        return this.f28205a;
    }
}
