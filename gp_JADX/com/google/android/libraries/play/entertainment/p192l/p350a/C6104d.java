package com.google.android.libraries.play.entertainment.p192l.p350a;

import android.support.v4.p037h.C0314i;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class C6104d {
    public static final C6090b f30264a = C6090b.m28050a();
    public final C2983e f30265b;
    public final Executor f30266c;
    public final C0314i f30267d;
    public final Map f30268e;
    public final Object f30269f;

    public C6104d(C2983e c2983e, Executor executor) {
        this(c2983e, executor, (byte) 0);
    }

    private C6104d(C2983e c2983e, Executor executor, byte b) {
        this.f30265b = (C2983e) C6116b.m28100a((Object) c2983e);
        this.f30266c = (Executor) C6116b.m28100a((Object) executor);
        this.f30267d = new C6106f();
        this.f30268e = new HashMap();
        this.f30269f = new Object();
    }

    public final C6105e m28078a(Class cls) {
        C6105e c6105e;
        synchronized (this.f30269f) {
            c6105e = (C6105e) this.f30268e.get(cls);
            if (c6105e == null) {
                c6105e = new C6105e(this, cls);
                this.f30268e.put(cls, c6105e);
            }
        }
        return c6105e;
    }
}
