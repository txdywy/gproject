package org.chromium.net.impl;

import java.nio.channels.Channels;

final class bk implements bd {
    public final /* synthetic */ bg f40857a;

    bk(bg bgVar) {
        this.f40857a = bgVar;
    }

    public final void mo6615a() {
        if (this.f40857a.f40845f == null) {
            this.f40857a.f40851l.f40787n = 10;
            this.f40857a.f40843d.connect();
            this.f40857a.f40851l.f40787n = 12;
            this.f40857a.f40846g = this.f40857a.f40843d.getOutputStream();
            this.f40857a.f40845f = Channels.newChannel(this.f40857a.f40846g);
        }
        this.f40857a.f40840a.set(bp.AWAITING_READ_RESULT);
        this.f40857a.m38092a(new bl(this));
    }
}
