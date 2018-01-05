package com.google.android.finsky.search;

import android.content.Context;
import java.util.concurrent.Semaphore;

public abstract class C4056i {
    public final String f20382k;
    public final Context f20383l;
    public long f20384m;

    public C4056i(String str, Context context) {
        this.f20382k = str;
        this.f20383l = context;
    }

    protected abstract void mo3896a();

    protected abstract void mo3897a(C4063k c4063k);

    public final void m18976b() {
        Semaphore semaphore = new Semaphore(0);
        mo3897a(new C4064j(semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
        }
    }
}
