package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import p526e.C7724h;

public abstract class ai {
    public abstract ac mo6416a();

    public abstract void mo6417a(C7724h c7724h);

    public long mo6418b() {
        return -1;
    }

    public static ai m36643a(ac acVar, byte[] bArr) {
        int length = bArr.length;
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        k.a((long) bArr.length, (long) length);
        return new aj(acVar, length, bArr);
    }
}
