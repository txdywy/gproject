package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.am;

public final class C5588e {
    public final C5602s f28505a = new C5602s();

    public final void m26583a(Object obj) {
        C5587d c5587d = this.f28505a;
        synchronized (c5587d.f28528a) {
            c5587d.m26605e();
            c5587d.f28530c = true;
            c5587d.f28531d = obj;
        }
        c5587d.f28529b.m26593a(c5587d);
    }

    public final boolean m26584b(Exception exception) {
        return this.f28505a.m26601a(exception);
    }

    public final void m26582a(Exception exception) {
        C5587d c5587d = this.f28505a;
        am.m23734a((Object) exception, (Object) "Exception must not be null");
        synchronized (c5587d.f28528a) {
            c5587d.m26605e();
            c5587d.f28530c = true;
            c5587d.f28532e = exception;
        }
        c5587d.f28529b.m26593a(c5587d);
    }
}
