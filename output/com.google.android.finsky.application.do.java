package com.google.android.finsky.application;

import a.a.b;
import a.a.c;
import android.content.Context;
import android.os.AsyncTask;
import c.a.a;
import com.google.android.instantapps.common.gms.GmsConnection;
import com.google.android.instantapps.common.gms.k;

public final class com.google.android.finsky.application.do implements c.a.a
{

    public final c.a.a a;
    public final c.a.a b;

    do(c.a.a p0, c.a.a p1) {
        this.a = p0;
        this.b = p1;
    }

    public final Object a() {
        return (com.google.android.instantapps.common.gms.k)a.a.c.a(new com.google.android.instantapps.common.gms.k(AsyncTask.THREAD_POOL_EXECUTOR, new GmsConnection((Context)this.a.a(), a.a.b.b(this.b))), "Cannot return null from a non-@Nullable @Provides method");
    }

}
