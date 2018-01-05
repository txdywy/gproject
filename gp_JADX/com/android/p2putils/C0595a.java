package com.android.p2putils;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class C0595a implements C0594b {
    public final ByteBuffer f3930a;

    public C0595a(ByteBuffer byteBuffer) {
        this.f3930a = byteBuffer.slice();
    }

    public final long mo1016a() {
        return (long) this.f3930a.capacity();
    }

    public final void mo1017a(MessageDigest[] messageDigestArr, long j, int i) {
        synchronized (this.f3930a) {
            this.f3930a.position((int) j);
            this.f3930a.limit(((int) j) + i);
            ByteBuffer slice = this.f3930a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
