package com.google.android.finsky.updatechecker.impl;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.dr.C2883a;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.dt.C2887a;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p167r.C3951d;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.p232s.C4006e;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.updatechecker.C4638a;
import com.google.android.finsky.updatechecker.C4639b;
import com.google.android.finsky.updatechecker.C4640d;
import com.google.android.finsky.updatechecker.C4641e;
import com.google.android.finsky.utils.ai;
import p002a.C0002a;

public final class aa implements C4640d {
    public final C4006e f23876A;
    public final Context f23877a;
    public final C0002a f23878b;
    public final C0002a f23879c;
    public final C0988c f23880d;
    public final C1461c f23881e;
    public final C2906h f23882f;
    public final C3027b f23883g;
    public final C0002a f23884h;
    public final C0002a f23885i;
    public final C0002a f23886j;
    public final C0002a f23887k;
    public final C0002a f23888l;
    public final C0002a f23889m;
    public final C0002a f23890n;
    public final C0002a f23891o;
    public final C0002a f23892p;
    public final C2887a f23893q;
    public final C3028c f23894r;
    public final C0002a f23895s;
    public final bb f23896t;
    public final C0002a f23897u;
    public final C3951d f23898v;
    public final C1502a f23899w;
    public final C3960a f23900x;
    public final C3654j f23901y;
    public final C1500a f23902z;

    public aa(Context context, C0002a c0002a, C0002a c0002a2, C0988c c0988c, C1461c c1461c, C2906h c2906h, C3027b c3027b, bb bbVar, C0002a c0002a3, C0002a c0002a4, C0002a c0002a5, C0002a c0002a6, C0002a c0002a7, C0002a c0002a8, C0002a c0002a9, C0002a c0002a10, C0002a c0002a11, C2887a c2887a, C3028c c3028c, C0002a c0002a12, C0002a c0002a13, C3951d c3951d, C1502a c1502a, C3960a c3960a, C3654j c3654j, C1500a c1500a, C4006e c4006e) {
        this.f23877a = context;
        this.f23878b = c0002a;
        this.f23879c = c0002a2;
        this.f23880d = c0988c;
        this.f23881e = c1461c;
        this.f23882f = c2906h;
        this.f23883g = c3027b;
        this.f23884h = c0002a3;
        this.f23885i = c0002a4;
        this.f23886j = c0002a5;
        this.f23887k = c0002a6;
        this.f23888l = c0002a7;
        this.f23889m = c0002a8;
        this.f23890n = c0002a9;
        this.f23891o = c0002a10;
        this.f23892p = c0002a11;
        this.f23893q = c2887a;
        this.f23894r = c3028c;
        this.f23895s = c0002a12;
        this.f23896t = bbVar;
        this.f23897u = c0002a13;
        this.f23898v = c3951d;
        this.f23899w = c1502a;
        this.f23900x = c3960a;
        this.f23901y = c3654j;
        this.f23902z = c1500a;
        this.f23876A = c4006e;
    }

    public final C4639b mo4314a() {
        C4638a c4656o;
        if (VERSION.SDK_INT < 21 || ((Long) C0955b.ds.m28964b()).longValue() <= 0) {
            if (this.f23881e.dj().mo2294a(12633420)) {
                c4656o = new C4656o(this.f23877a, (C2266a) this.f23895s.mo1a(), (C2206c) this.f23878b.mo1a(), (C3646a) this.f23879c.mo1a(), (C1627b) this.f23892p.mo1a(), this, this.f23896t, this.f23899w, this.f23900x);
            } else {
                c4656o = new ReschedulerUsingAlarmManager(this.f23877a, (C2266a) this.f23895s.mo1a(), (C2206c) this.f23878b.mo1a(), (C3646a) this.f23879c.mo1a(), (C1627b) this.f23892p.mo1a(), this, this.f23899w, this.f23900x);
            }
        } else if (this.f23881e.dj().mo2294a(12633420)) {
            c4656o = new C4651j(this.f23877a, (C2266a) this.f23895s.mo1a(), (C2206c) this.f23878b.mo1a(), (C3646a) this.f23879c.mo1a(), (C1627b) this.f23892p.mo1a(), this, this.f23881e.dj(), this.f23896t, this.f23899w, this.f23900x);
        } else {
            c4656o = new ReschedulerUsingJobScheduler(this.f23877a, (C2266a) this.f23895s.mo1a(), (C2206c) this.f23878b.mo1a(), (C3646a) this.f23879c.mo1a(), (C1627b) this.f23892p.mo1a(), this, this.f23881e.dj(), (ai) this.f23897u.mo1a(), this.f23899w, this.f23900x);
        }
        return m21607a(c4656o);
    }

    public final C4639b mo4315b() {
        return m21607a(new C4649h(this.f23877a, (C2266a) this.f23895s.mo1a(), (C2206c) this.f23878b.mo1a(), (C3646a) this.f23879c.mo1a(), (C1627b) this.f23892p.mo1a(), this, this.f23899w, this.f23900x));
    }

    private final C4639b m21607a(C4638a c4638a) {
        C4641e c4664w;
        C0988c c0988c = this.f23880d;
        C1461c c1461c = this.f23881e;
        C1506e c1506e = (C1506e) this.f23885i.mo1a();
        boolean z = C2883a.m15119a(c0988c, c1506e, c1461c) && (C2883a.m15122b(c1506e, c1461c) || C2883a.m15120a(c1506e, c1461c));
        if (z) {
            c4664w = new C4664w((C3646a) this.f23879c.mo1a(), this.f23880d, this.f23881e, (C2320a) this.f23891o.mo1a(), (C1506e) this.f23885i.mo1a(), this.f23882f);
        } else {
            Object c4643a = new C4643a((C2206c) this.f23878b.mo1a(), (C3646a) this.f23879c.mo1a(), this.f23880d, this.f23881e, this.f23882f, (C2885b) this.f23884h.mo1a(), (C1506e) this.f23885i.mo1a(), (C1627b) this.f23892p.mo1a());
        }
        Context context = this.f23877a;
        C3646a c3646a = (C3646a) this.f23879c.mo1a();
        C2206c c2206c = (C2206c) this.f23878b.mo1a();
        C0988c c0988c2 = this.f23880d;
        C1461c c1461c2 = this.f23881e;
        C3027b c3027b = this.f23883g;
        C2127b c2127b = (C2127b) this.f23886j.mo1a();
        this.f23887k.mo1a();
        return new ab(context, c3646a, c2206c, c0988c2, c1461c2, c3027b, c2127b, (C3340g) this.f23888l.mo1a(), (C3300k) this.f23889m.mo1a(), (ab) this.f23890n.mo1a(), (C2320a) this.f23891o.mo1a(), c4638a, (C1627b) this.f23892p.mo1a(), this.f23893q, this.f23894r, this.f23898v, this.f23899w, c4664w, z, this.f23900x, this.f23901y, (C1506e) this.f23885i.mo1a(), this.f23902z, this.f23876A);
    }
}
