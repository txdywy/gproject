package org.chromium.net.impl;

import java.nio.ByteBuffer;

final class ak implements bd {
    public final /* synthetic */ aj f40802a;

    ak(aj ajVar) {
        this.f40802a = ajVar;
    }

    public final void mo6615a() {
        int i;
        if (this.f40802a.f40801b.f40789p == null) {
            i = -1;
        } else {
            i = this.f40802a.f40801b.f40789p.read(this.f40802a.f40800a);
        }
        af afVar = this.f40802a.f40801b;
        ByteBuffer byteBuffer = this.f40802a.f40800a;
        if (i != -1) {
            aw awVar = afVar.f40775b;
            awVar.m38086a(new az(awVar, afVar.f40790q, byteBuffer));
            return;
        }
        if (afVar.f40789p != null) {
            afVar.f40789p.close();
        }
        if (afVar.f40780g.compareAndSet(bq.READING, bq.COMPLETE)) {
            afVar.m38079e();
            awVar = afVar.f40775b;
            awVar.f40818b.execute(new bb(awVar, afVar.f40790q));
        }
    }
}
