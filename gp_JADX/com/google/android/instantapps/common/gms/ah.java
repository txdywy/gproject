package com.google.android.instantapps.common.gms;

import android.content.Context;
import android.os.Trace;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.instantapps.C5260a;
import com.google.android.instantapps.p309a.C5699f;

final /* synthetic */ class ah implements Runnable {
    public final GmsConnection f29206a;
    public final Context f29207b;

    ah(GmsConnection gmsConnection, Context context) {
        this.f29206a = gmsConnection;
        this.f29207b = context;
    }

    public final void run() {
        C1634r c1634r = this.f29206a;
        Context context = this.f29207b;
        try {
            C5699f.m26963b(C5095d.m23655a(context) == 0);
            c1634r.f29184e = new C5089p(context).m23649a((C1632q) c1634r).m23647a(C5260a.f26391c).m23650a(c1634r).m23646a(c1634r.f29182c).m23652b();
            Trace.beginSection("GoogleApiClient.connect");
            c1634r.f29184e.mo4557e();
        } catch (Exception e) {
            c1634r.m27168a(e);
        }
    }
}
