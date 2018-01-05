package com.google.android.finsky.boothandler;

import com.google.android.finsky.hygiene.v;

public final class com.google.android.finsky.boothandler.a implements Runnable
{

    public final BootCompletedReceiver a;

    a(BootCompletedReceiver p0) {
        this.a = p0;
    }

    public final void run() {
        this.a.c.d();
    }

}
