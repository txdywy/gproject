package com.google.android.gms.internal;

import com.google.android.gms.car.C1636d;
import java.util.List;

final class cb implements Runnable {
    public /* synthetic */ List f26545a;
    public /* synthetic */ bv f26546b;
    public /* synthetic */ bz f26547c;

    cb(bz bzVar, List list, bv bvVar) {
        this.f26547c = bzVar;
        this.f26545a = list;
        this.f26546b = bvVar;
    }

    public final void run() {
        for (C1636d c1636d : this.f26545a) {
            if (this.f26546b.f26516a.m23140j()) {
                boolean contains;
                synchronized (this.f26547c) {
                    contains = this.f26546b.f26532q.contains(c1636d);
                }
                if (contains) {
                    c1636d.mo2366b();
                }
            } else {
                return;
            }
        }
    }
}
