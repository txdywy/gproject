package com.google.android.gms.peerdownloadmanager.comms.rpc.p299a;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class C5437a implements Runnable {
    public final byte[] f28132a = new byte[65536];
    public final DataInputStream f28133b;
    public final DataOutputStream f28134c;
    public final C5438b f28135d;

    C5437a(InputStream inputStream, OutputStream outputStream, C5438b c5438b) {
        this.f28133b = new DataInputStream(inputStream);
        this.f28134c = new DataOutputStream(outputStream);
        this.f28135d = c5438b;
    }

    abstract void mo5009a(C5439c c5439c);

    public void run() {
        C5439c c5439c = new C5439c();
        try {
            Log.d("Bridge", "transfer starting");
            mo5009a(c5439c);
            Log.d("Bridge", "transfer succeeded");
        } catch (Throwable e) {
            Log.e("Bridge", "transfer failed", e);
        } finally {
            this.f28135d.mo5013a(c5439c);
        }
    }
}
