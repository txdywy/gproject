package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.am;
import java.util.concurrent.Executor;

final class C5602s extends C5587d {
    public final Object f28528a = new Object();
    public final C5600q f28529b = new C5600q();
    public boolean f28530c;
    public Object f28531d;
    public Exception f28532e;

    C5602s() {
    }

    private final void m26595f() {
        synchronized (this.f28528a) {
            if (this.f28530c) {
                this.f28529b.m26593a((C5587d) this);
                return;
            }
        }
    }

    public final C5587d mo5055a(C4751a c4751a) {
        return mo5056a(C5589f.f28506a, c4751a);
    }

    public final C5587d mo5056a(Executor executor, C4751a c4751a) {
        this.f28529b.m26594a(new C5594j(executor, c4751a));
        m26595f();
        return this;
    }

    public final C5587d mo5057a(Executor executor, C5585b c5585b) {
        this.f28529b.m26594a(new C5596l(executor, c5585b));
        m26595f();
        return this;
    }

    public final C5587d mo5058a(Executor executor, C5586c c5586c) {
        this.f28529b.m26594a(new C5598n(executor, c5586c));
        m26595f();
        return this;
    }

    public final boolean mo5059a() {
        boolean z;
        synchronized (this.f28528a) {
            z = this.f28530c;
        }
        return z;
    }

    public final boolean m26601a(Exception exception) {
        boolean z = true;
        am.m23734a((Object) exception, (Object) "Exception must not be null");
        synchronized (this.f28528a) {
            if (this.f28530c) {
                z = false;
            } else {
                this.f28530c = true;
                this.f28532e = exception;
                this.f28529b.m26593a((C5587d) this);
            }
        }
        return z;
    }

    public final boolean mo5060b() {
        boolean z;
        synchronized (this.f28528a) {
            z = this.f28530c && this.f28532e == null;
        }
        return z;
    }

    public final Object mo5061c() {
        Object obj;
        synchronized (this.f28528a) {
            am.m23739a(this.f28530c, (Object) "Task is not yet complete");
            if (this.f28532e != null) {
                throw new RuntimeExecutionException(this.f28532e);
            }
            obj = this.f28531d;
        }
        return obj;
    }

    public final Exception mo5062d() {
        Exception exception;
        synchronized (this.f28528a) {
            exception = this.f28532e;
        }
        return exception;
    }

    final void m26605e() {
        am.m23739a(!this.f28530c, (Object) "Task is already complete");
    }
}
