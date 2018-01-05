package com.android.p2putils;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.security.MessageDigest;

public final class com.android.p2putils.c implements com.android.p2putils.b
{

    public final FileChannel a;
    public final long b;
    public final long c;

    c(FileChannel p0, long p1, long p3) {
        this.a = p0;
        this.b = p1;
        this.c = p3;
    }

    public final long a() {
        return this.c;
    }

    public final void a(MessageDigest[] p0, long p1, int p3) {
        v1 = this.a.map(FileChannel$MapMode.READ_ONLY, this.b + p1, (long)p3);
        v1.load();
        v0 = 0;
        while (v0 < p0.length) {
            v1.position(0);
            p0[v0].update(v1);
            v0 = v0 + 1;
        }
    }

}
