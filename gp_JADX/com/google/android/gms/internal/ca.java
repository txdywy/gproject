package com.google.android.gms.internal;

import com.google.android.gms.car.C1636d;
import java.util.List;

final class ca implements Runnable {
    public /* synthetic */ List f26542a;
    public /* synthetic */ bv f26543b;
    public /* synthetic */ bz f26544c;

    ca(bz bzVar, List list, bv bvVar) {
        this.f26544c = bzVar;
        this.f26542a = list;
        this.f26543b = bvVar;
    }

    public final void run() {
        for (C1636d c1636d : this.f26542a) {
            if (this.f26543b.f26516a.m23140j()) {
                boolean contains;
                synchronized (this.f26544c) {
                    contains = this.f26543b.f26532q.contains(c1636d);
                }
                if (contains) {
                    c1636d.mo2365a();
                }
            } else {
                return;
            }
        }
    }
}
