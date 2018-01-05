package org.chromium.net.impl;

import java.nio.ByteBuffer;

final class aj implements Runnable {
    public final /* synthetic */ ByteBuffer f40800a;
    public final /* synthetic */ af f40801b;

    aj(af afVar, ByteBuffer byteBuffer) {
        this.f40801b = afVar;
        this.f40800a = byteBuffer;
    }

    public final void run() {
        this.f40801b.f40776c.execute(this.f40801b.m38066a(new ak(this)));
    }
}
