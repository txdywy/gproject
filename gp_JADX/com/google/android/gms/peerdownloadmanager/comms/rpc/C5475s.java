package com.google.android.gms.peerdownloadmanager.comms.rpc;

import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.aa;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5400g;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5403e;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5405h;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.SocketFactory;

public final class C5475s implements C5403e {
    public Socket f28216a;
    public final String f28217b;
    public final C5405h f28218c;
    public AtomicReference f28219d = new AtomicReference(null);

    public C5475s(C5405h c5405h) {
        this.f28217b = c5405h.f28028a;
        this.f28218c = c5405h;
    }

    public C5475s(Socket socket) {
        this.f28216a = socket;
        this.f28217b = socket.getInetAddress().toString();
        this.f28218c = new C5405h(this.f28217b, socket.getPort());
    }

    public final boolean mo5020c() {
        this.f28216a = SocketFactory.getDefault().createSocket(this.f28217b, this.f28218c.f28029b);
        String valueOf = String.valueOf(this.f28216a);
        Log.d("CommsSocket", new StringBuilder(String.valueOf(valueOf).length() + 23).append("open: connected socket ").append(valueOf).toString());
        return true;
    }

    public final InputStream mo5018a() {
        return this.f28216a.getInputStream();
    }

    public final OutputStream mo5019b() {
        return this.f28216a.getOutputStream();
    }

    public final void close() {
        aa.m26135a(this.f28216a);
        CommsRunnable commsRunnable = (CommsRunnable) this.f28219d.getAndSet(null);
        if (commsRunnable != null) {
            commsRunnable.m26286g();
        }
    }

    public final void mo5022e() {
        aa.m26135a(this.f28216a);
    }

    public final String toString() {
        return this.f28217b;
    }

    public final C5400g mo5021d() {
        return this.f28218c;
    }
}
