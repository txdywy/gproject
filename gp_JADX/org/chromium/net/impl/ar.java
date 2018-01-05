package org.chromium.net.impl;

import java.net.URI;
import java.util.List;
import java.util.Map;

final class ar implements Runnable {
    public final /* synthetic */ Map f40809a;
    public final /* synthetic */ af f40810b;

    ar(af afVar, Map map) {
        this.f40810b = afVar;
        this.f40809a = map;
    }

    public final void run() {
        this.f40810b.f40791r = URI.create(this.f40810b.f40788o).resolve((String) ((List) this.f40809a.get("location")).get(0)).toString();
        this.f40810b.f40779f.add(this.f40810b.f40791r);
        this.f40810b.m38074a(bq.REDIRECT_RECEIVED, bq.AWAITING_FOLLOW_REDIRECT, new as(this));
    }
}
