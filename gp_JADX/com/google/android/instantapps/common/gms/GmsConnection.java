package com.google.android.instantapps.common.gms;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.instantapps.C5263b;
import com.google.android.instantapps.common.C5804k;
import com.google.common.f.a.bf;
import java.util.LinkedList;
import p002a.C0002a;

public final class GmsConnection implements C1632q, C1634r {
    public static final C5804k f29180a = new C5804k("GmsConnection");
    public final C0002a f29181b;
    public final Handler f29182c;
    public final bf f29183d = new bf();
    public C5058o f29184e;
    public boolean f29185f;
    public final LinkedList f29186g = new LinkedList();

    class DisconnectedException extends Exception {
        DisconnectedException() {
        }
    }

    public GmsConnection(Context context, C0002a c0002a) {
        this.f29181b = c0002a;
        HandlerThread handlerThread = new HandlerThread("GmsConnection", 1);
        handlerThread.start();
        this.f29182c = new Handler(handlerThread.getLooper());
        this.f29182c.post(new ah(this, context));
    }

    public final C5263b m27163a() {
        return (C5263b) this.f29181b.mo1a();
    }

    public final void mo2363a(Bundle bundle) {
        Trace.endSection();
        f29180a.m27209b("onConnected", new Object[0]);
        this.f29183d.a(null);
        this.f29185f = false;
        f29180a.m27209b("Running %d queued calls", Integer.valueOf(this.f29186g.size()));
        while (!this.f29186g.isEmpty()) {
            ((aj) this.f29186g.remove()).mo5160a();
        }
    }

    public final void mo2362a(int i) {
        f29180a.m27209b("onConnectionSuspended: %d", Integer.valueOf(i));
        this.f29185f = false;
    }

    final void m27168a(Exception exception) {
        this.f29183d.a(exception);
        this.f29185f = true;
        f29180a.m27209b("Failing %d queued calls", Integer.valueOf(this.f29186g.size()));
        while (!this.f29186g.isEmpty()) {
            ((aj) this.f29186g.remove()).mo5161b();
        }
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        f29180a.m27211d("onConnectionFailed: %s", connectionResult);
        m27168a(new DisconnectedException());
    }

    public final void m27167a(aj ajVar) {
        this.f29182c.post(new ai(this, ajVar));
    }
}
