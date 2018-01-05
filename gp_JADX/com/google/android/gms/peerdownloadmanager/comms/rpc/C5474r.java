package com.google.android.gms.peerdownloadmanager.comms.rpc;

import com.google.android.gms.peerdownloadmanager.comms.p294a.C5402d;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5403e;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5406i;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;

public final class C5474r implements C5402d {
    public ServerSocket f28215a;

    public final void mo5017c() {
        this.f28215a = ServerSocketFactory.getDefault().createServerSocket();
        this.f28215a.bind(new InetSocketAddress(C5406i.m26185a(), 0));
    }

    public final boolean mo5015a() {
        return this.f28215a.isClosed();
    }

    public final void close() {
        this.f28215a.close();
    }

    public final String toString() {
        InetAddress a = C5406i.m26185a();
        return a != null ? a.getHostAddress() : null;
    }

    public final /* synthetic */ C5403e mo5016b() {
        return new C5475s(this.f28215a.accept());
    }
}
