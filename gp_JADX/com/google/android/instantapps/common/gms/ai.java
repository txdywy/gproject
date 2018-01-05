package com.google.android.instantapps.common.gms;

final /* synthetic */ class ai implements Runnable {
    public final GmsConnection f29208a;
    public final aj f29209b;

    ai(GmsConnection gmsConnection, aj ajVar) {
        this.f29208a = gmsConnection;
        this.f29209b = ajVar;
    }

    public final void run() {
        GmsConnection gmsConnection = this.f29208a;
        aj ajVar = this.f29209b;
        if (gmsConnection.f29184e != null && gmsConnection.f29184e.mo4562j()) {
            ajVar.mo5160a();
        } else if (gmsConnection.f29185f) {
            ajVar.mo5161b();
        } else {
            GmsConnection.f29180a.m27209b("Queuing call", new Object[0]);
            gmsConnection.f29186g.add(ajVar);
        }
    }
}
