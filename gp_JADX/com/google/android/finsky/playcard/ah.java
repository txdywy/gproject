package com.google.android.finsky.playcard;

import android.support.v4.p037h.C0314i;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.utils.bb;
import com.google.android.play.layout.e;
import java.util.HashSet;
import java.util.Set;

final class ah {
    public final Set f19561a = new HashSet();
    public final ao f19562b;
    public final C3340g f19563c;
    public final C2206c f19564d;
    public final C3851f f19565e;
    public an f19566f;
    public final C0314i f19567g = new ai(this);
    public boolean f19568h;

    ah(ao aoVar, C3340g c3340g, C2206c c2206c, C3851f c3851f) {
        this.f19562b = aoVar;
        this.f19563c = c3340g;
        this.f19564d = c2206c;
        this.f19565e = c3851f;
    }

    final void m18484a() {
        bb.m21791a();
        if (!this.f19568h) {
            this.f19563c.mo3481a(new aj(this));
            this.f19564d.mo2814a(new ak(this));
            this.f19565e.mo3818a(new al(this));
            e.b.a(new am(this));
            this.f19568h = true;
        }
    }

    final void m18485b() {
        bb.m21791a();
        m18484a();
        this.f19567g.m1694a(-1);
        this.f19566f = null;
    }
}
