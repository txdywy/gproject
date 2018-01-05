package com.google.android.gms.internal;

public abstract class xx {
    public /* synthetic */ xw f27727a;

    xx(xw xwVar) {
        this.f27727a = xwVar;
    }

    protected abstract Object mo4949a();

    protected abstract Object mo4950a(ye yeVar);

    public final Object m25993b() {
        Object obj = null;
        ye a = this.f27727a.m25990a();
        if (a == null) {
            ap.m24193c("ClientApi class cannot be loaded.");
        } else {
            try {
                obj = mo4950a(a);
            } catch (Throwable e) {
                ap.m24194c("Cannot invoke local loader using ClientApi class", e);
            }
        }
        return obj;
    }

    public final Object m25994c() {
        try {
            return mo4949a();
        } catch (Throwable e) {
            ap.m24194c("Cannot invoke remote loader", e);
            return null;
        }
    }
}
