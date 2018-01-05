package com.google.android.gms.peerdownloadmanager.comms.rpc.p300b;

import com.google.protobuf.au;
import com.google.protobuf.be;
import com.google.protobuf.ch;

public final class C5456n extends au implements ch {
    C5456n() {
        super(C5454l.f28167d);
    }

    public final C5456n m26323a(C5457o c5457o) {
        b();
        C5454l c5454l = (C5454l) this.b;
        if (c5457o == null) {
            throw new NullPointerException();
        }
        if (!c5454l.f28169a.a()) {
            be beVar = c5454l.f28169a;
            int size = beVar.size();
            c5454l.f28169a = beVar.b(size == 0 ? 10 : size * 2);
        }
        c5454l.f28169a.d(c5457o.m26325a());
        return this;
    }
}
