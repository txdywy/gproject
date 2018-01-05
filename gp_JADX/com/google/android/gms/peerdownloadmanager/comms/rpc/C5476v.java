package com.google.android.gms.peerdownloadmanager.comms.rpc;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.aa;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5402d;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5403e;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5404f;

final class C5476v extends C5436b {
    public final C5404f f28220n;
    public final String f28221o;
    public final C5463u f28222p;
    public C5402d f28223q;
    public int f28224r = 0;
    public final Handler f28225s;
    public final C5462f f28226t;

    C5476v(C5404f c5404f, String str, C5463u c5463u, C5462f c5462f) {
        this.f28220n = c5404f;
        this.f28221o = str;
        this.f28222p = c5463u;
        this.f28225s = new Handler();
        this.f28226t = c5462f;
    }

    public final void mo5006b() {
        while (!this.f28101c.get()) {
            try {
                Log.d("ServerRunnable", "binding to listen port");
                this.f28223q = this.f28220n.mo4986a();
                this.f28223q.mo5017c();
                String valueOf = String.valueOf(this.f28223q);
                Log.d("ServerRunnable", new StringBuilder(String.valueOf(valueOf).length() + 9).append("bound to ").append(valueOf).toString());
                while (!this.f28101c.get() && !this.f28223q.mo5015a()) {
                    C5403e b = this.f28223q.mo5016b();
                    this.f28224r++;
                    String valueOf2 = String.valueOf(b);
                    Log.d("ServerRunnable", new StringBuilder(String.valueOf(valueOf2).length() + 16).append("connection from ").append(valueOf2).toString());
                    this.f28225s.post(new C5477w(this, b));
                }
                Log.d("ServerRunnable", "server socket was closed");
            } catch (Throwable th) {
                this.f28226t.m26329b(this);
            }
        }
        this.f28226t.m26329b(this);
    }

    public final boolean mo5005a(C5461e c5461e) {
        if (!super.mo5005a(c5461e)) {
            return false;
        }
        aa.m26135a(this.f28223q);
        this.f28223q = null;
        return true;
    }

    public final String mo5008d() {
        long j = this.f28100b;
        String str = this.f28221o;
        return new StringBuilder(String.valueOf(str).length() + 40).append("[").append(j).append("][").append(str).append("] Comms{ACCEPT}: ").toString();
    }

    public final String toString() {
        return "LISTENER: " + this.f28224r + " accepts";
    }
}
