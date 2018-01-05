package com.android.p2putils;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;

final class C0596c implements C0594b {
    public final FileChannel f3931a;
    public final long f3932b;
    public final long f3933c;

    public C0596c(FileChannel fileChannel, long j, long j2) {
        this.f3931a = fileChannel;
        this.f3932b = j;
        this.f3933c = j2;
    }

    public final long mo1016a() {
        return this.f3933c;
    }

    public final void mo1017a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer map = this.f3931a.map(MapMode.READ_ONLY, this.f3932b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
