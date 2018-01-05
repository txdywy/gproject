package com.google.android.gms.internal;

public final class ld extends nd {
    public final StackTraceElement[] f27155a;

    public ld(jp jpVar, String str, String str2, ci ciVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(jpVar, str, str2, ciVar, i, 45);
        this.f27155a = stackTraceElementArr;
    }

    protected final void mo4764a() {
        if (this.f27155a != null) {
            jn jnVar = new jn((String) this.h.invoke(null, new Object[]{this.f27155a}));
            synchronized (this.g) {
                this.g.f26564L = jnVar.f27066b;
                if (jnVar.f27067c.booleanValue()) {
                    this.g.f26574V = Integer.valueOf(jnVar.f27068d.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
