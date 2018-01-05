package com.android.ex.photo;

public final class com.android.ex.photo.o implements Runnable
{

    public final com.android.ex.photo.j a;

    o(com.android.ex.photo.j p0) {
        this.a = p0;
    }

    public final void run() {
        this.a.c.finish();
        this.a.c.overridePendingTransition(0, 0);
    }

}
