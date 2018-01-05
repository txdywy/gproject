package com.google.android.c;

import android.database.ContentObserver;
import java.util.concurrent.atomic.AtomicBoolean;

public final class com.google.android.c.d extends ContentObserver
{

    public final com.google.android.c.f a;

    d(com.google.android.c.f p0) {
        this.a = p0;
        ContentObserver(0);
    }

    public final void onChange(boolean p0) {
        this.a.c.set(1);
    }

}
