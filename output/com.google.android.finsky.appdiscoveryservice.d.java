package com.google.android.finsky.appdiscoveryservice;

import a.a.c;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class com.google.android.finsky.appdiscoveryservice.d implements c.a.a
{

    d() {
    }

    public final Object a() {
        return (Executor)a.a.c.a(Executors.newCachedThreadPool(), "Cannot return null from a non-@Nullable @Provides method");
    }

}
