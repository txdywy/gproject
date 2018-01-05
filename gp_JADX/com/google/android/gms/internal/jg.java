package com.google.android.gms.internal;

final class jg implements Runnable {
    public /* synthetic */ long f27051a;
    public /* synthetic */ jb f27052b;

    jg(jb jbVar, long j) {
        this.f27052b = jbVar;
        this.f27051a = j;
    }

    public final void run() {
        hy hyVar = this.f27052b;
        long j = this.f27051a;
        hyVar.mo4728b();
        hyVar.m24877t();
        hyVar.f27040c.m24504c();
        hyVar.f27041d.m24504c();
        hyVar.mo4742p().f26851j.m24653a("Activity paused, time", Long.valueOf(j));
        if (hyVar.f27039b != 0) {
            hyVar.mo4743q().f26876n.m24686a((j - hyVar.f27039b) + hyVar.mo4743q().f26876n.m24685a());
        }
    }
}
