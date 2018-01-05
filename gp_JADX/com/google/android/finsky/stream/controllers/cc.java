package com.google.android.finsky.stream.controllers;

import com.google.android.finsky.stream.p251b.C4241a;
import com.google.android.finsky.stream.p251b.C4242b;
import com.google.android.finsky.stream.p251b.C4243c;

final class cc implements Runnable {
    public final /* synthetic */ int f22001a;
    public final /* synthetic */ cb f22002b;

    cc(cb cbVar, int i) {
        this.f22002b = cbVar;
        this.f22001a = i;
    }

    public final void run() {
        C4241a c4241a = this.f22002b.f21962F;
        int i = this.f22001a;
        c4241a.m19705g();
        ((C4242b) c4241a.f21462a.peek()).f21467b = i;
        for (int i2 = 0; i2 < c4241a.f21463b.size(); i2++) {
            ((C4243c) c4241a.f21463b.get(i2)).mo4171e(i);
        }
    }
}
