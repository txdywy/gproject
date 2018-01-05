package com.google.android.libraries.play.entertainment.p192l;

import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.concurrent.atomic.AtomicInteger;

public final class C6113c implements Comparable {
    public static final AtomicInteger f30284a = new AtomicInteger(Integer.MIN_VALUE);
    public final C6101b f30285b;
    public final int f30286c;
    public final int f30287d = f30284a.getAndIncrement();

    public C6113c(C6101b c6101b, int i) {
        this.f30285b = (C6101b) C6116b.m28100a((Object) c6101b);
        this.f30286c = i;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C6113c c6113c = (C6113c) obj;
        if (this == c6113c) {
            return 0;
        }
        int i = this.f30286c - c6113c.f30286c;
        if (i != 0) {
            return i;
        }
        if (this.f30286c == 0) {
            return c6113c.f30287d - this.f30287d;
        }
        return this.f30287d - c6113c.f30287d;
    }
}
