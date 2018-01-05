package com.google.android.libraries.bind.p323a;

import com.google.android.libraries.bind.p324c.C5875b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class C5864j implements Executor {
    public static final List f29379a = new ArrayList();
    public final String f29380b;
    public Executor f29381c;
    public final int f29382d = 2;
    public final ThreadGroup f29383e;

    public C5864j(String str) {
        C5865k c5865k = new C5865k(this);
        this.f29380b = str;
        f29379a.add(this);
        this.f29383e = new ThreadGroup(str);
        this.f29381c = new C5868n(this.f29382d, this.f29382d, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C5866l(this));
    }

    public C5864j(String str, Executor executor) {
        C5865k c5865k = new C5865k(this);
        this.f29380b = str;
        f29379a.add(this);
        this.f29383e = new ThreadGroup(str);
        this.f29381c = executor;
    }

    public final void execute(Runnable runnable) {
        this.f29381c.execute(runnable);
    }

    public final String toString() {
        return this.f29380b;
    }

    static {
        C5875b.m27305a(C5869o.class);
    }
}
