package com.google.android.gms.internal;

final class jf implements Runnable {
    public /* synthetic */ long f27049a;
    public /* synthetic */ jb f27050b;

    jf(jb jbVar, long j) {
        this.f27050b = jbVar;
        this.f27049a = j;
    }

    public final void run() {
        hy hyVar = this.f27050b;
        long j = this.f27049a;
        hyVar.mo4728b();
        hyVar.m24877t();
        hyVar.f27040c.m24504c();
        hyVar.f27041d.m24504c();
        hyVar.mo4742p().f26851j.m24653a("Activity resumed, time", Long.valueOf(j));
        hyVar.f27039b = j;
        if (hyVar.mo4735i().mo4629a() - hyVar.mo4743q().f26873k.m24685a() > hyVar.mo4743q().f26875m.m24685a()) {
            hyVar.mo4743q().f26874l.m24684a(true);
            hyVar.mo4743q().f26876n.m24686a(0);
        }
        hk hkVar = hyVar.mo4743q().f26874l;
        if (!hkVar.f26880c) {
            hkVar.f26880c = true;
            hkVar.f26881d = hkVar.f26882e.f26864b.getBoolean(hkVar.f26878a, hkVar.f26879b);
        }
        if (hkVar.f26881d) {
            hyVar.f27040c.m24502a(Math.max(0, hyVar.mo4743q().f26872j.m24685a() - hyVar.mo4743q().f26876n.m24685a()));
        } else {
            hyVar.f27041d.m24502a(Math.max(0, 3600000 - hyVar.mo4743q().f26876n.m24685a()));
        }
    }
}
