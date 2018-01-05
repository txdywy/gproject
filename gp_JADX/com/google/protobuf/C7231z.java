package com.google.protobuf;

import java.nio.ByteBuffer;

final class C7231z extends C7230y {
    public final ByteBuffer f35513i;
    public int f35514j;

    C7231z(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.f35513i = byteBuffer;
        this.f35514j = byteBuffer.position();
    }

    public final void mo6050h() {
        this.f35513i.position(this.f35514j + (this.f35512h - this.f35510f));
    }
}
